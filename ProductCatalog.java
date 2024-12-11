import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.Scanner;

public class ProductCatalog {
	private final HttpClientHelper httpClientHelper = new HttpClientHelper();
	private final Gson gson = new GsonBuilder().setPrettyPrinting().create();

	public void searchProducts(String searchOption, Scanner scanner) {
		try {
			switch (searchOption.toLowerCase()) {
			case "a":
				System.out.print("Ingresa el ID del producto: ");
				int id = scanner.nextInt();
				scanner.nextLine();
				searchProductById(id);
				break;

			case "b":
				System.out.print("Ingresa la categoría a buscar: ");
				String category = scanner.nextLine();
				searchProductsByCategory(category);
				break;

			case "c":
				System.out.print("Ingresa el nombre o descripción a buscar: ");
				String query = scanner.nextLine();
				searchProductsByDescription(query);
				break;

			case "d":
				System.out.print("Ingresa el precio mínimo: ");
				double minPrice = scanner.nextDouble();
				System.out.print("Ingresa el precio máximo: ");
				double maxPrice = scanner.nextDouble();
				scanner.nextLine();
				searchProductsByPriceRange(minPrice, maxPrice);
				break;

			default:
				System.out.println("Opción inválida. Intenta nuevamente.");
			}
		} catch (Exception e) {
			System.out.println("Ocurrió un error durante la búsqueda: " + e.getMessage());
		}
	}

	public void addProduct(Scanner scanner, Gson gson) {
		try {
			System.out.print("Ingresa el nombre del producto: ");
			String name = scanner.nextLine();

			System.out.print("Ingresa el precio del producto: ");
			double price = scanner.nextDouble();
			scanner.nextLine();

			System.out.print("Ingresa la categoría del producto: ");
			String category = scanner.nextLine();

			String jsonPayload = gson.toJson(new ProductPayload(name, price, category));
			String response = httpClientHelper.post("https://fakestoreapi.com/products", jsonPayload);

			Object json = gson.fromJson(response, Object.class);
			String prettyJson = this.gson.toJson(json);

			System.out.println("Producto agregado exitosamente:");
			System.out.println(prettyJson);
		} catch (Exception e) {
			System.out.println("Ocurrió un error al agregar el producto: " + e.getMessage());
		}
	}

	public void searchProductById(int id) throws Exception {
		String response = httpClientHelper.get("https://fakestoreapi.com/products/" + id);
		if (response.contains("id")) {
			System.out.println("Producto encontrado:");
			Object json = gson.fromJson(response, Object.class);
			System.out.println(gson.toJson(json));
		} else {
			System.out.println("Producto no encontrado.");
		}
	}

	public void searchProductsByCategory(String category) throws Exception {
		String response = httpClientHelper.get("https://fakestoreapi.com/products/category/" + category);
		if (response.contains("[")) {
			System.out.println("Productos encontrados:");
			Object json = gson.fromJson(response, Object.class);
			System.out.println(gson.toJson(json));
		} else {
			System.out.println("No se encontraron productos en esta categoría.");
		}
	}

	public void searchProductsByDescription(String query) throws Exception {
		String response = httpClientHelper.get("https://fakestoreapi.com/products");
		Product[] products = gson.fromJson(response, Product[].class);

		boolean found = false;
		System.out.println("Productos encontrados:");
		for (Product product : products) {
			if (product.getTitle().toLowerCase().contains(query.toLowerCase())) {
				System.out.printf("- Producto [%d] [%s] [%.2f]\n", product.getId(), product.getCategory(),
						product.getPrice());
				found = true;
			}
		}

		if (!found) {
			System.out.println("No se encontraron productos que coincidan con la búsqueda.");
		}
	}

	public void searchProductsByPriceRange(double minPrice, double maxPrice) throws Exception {
		String response = httpClientHelper.get("https://fakestoreapi.com/products");
		Product[] products = gson.fromJson(response, Product[].class);

		boolean found = false;
		System.out.println("Productos encontrados:");
		for (Product product : products) {
			if (product.getPrice() >= minPrice && product.getPrice() <= maxPrice) {
				System.out.printf("- Producto [%d] [%s] [%.2f]\n", product.getId(), product.getCategory(),
						product.getPrice());
				found = true;
			}
		}

		if (!found) {
			System.out.println("No se encontraron productos en este rango de precios.");
		}
	}

	private static class ProductPayload {
		private final String title;
		private final double price;
		private final String category;

		public ProductPayload(String title, double price, String category) {
			this.title = title;
			this.price = price;
			this.category = category;
		}
	}

	public Product getProductById(int id) {
		try {
			String response = httpClientHelper.get("https://fakestoreapi.com/products/" + id);
			if (response != null && !response.isEmpty()) {
				return gson.fromJson(response, Product.class);
			}
		} catch (Exception e) {
			System.out.println("Error al obtener el producto: " + e.getMessage());
		}
		return null;
	}

	public void deleteProduct(int id) {
		try {
			String response = httpClientHelper.delete("https://fakestoreapi.com/products/" + id);

			if (response == null || response.isEmpty()) {
				System.out.println("No se pudo eliminar el producto. Es posible que no exista.");
				return;
			}

			Object json = gson.fromJson(response, Object.class);
			String prettyJson = gson.toJson(json);

			System.out.println("Producto eliminado exitosamente:");
			System.out.println(prettyJson);
		} catch (Exception e) {
			System.out.println("Ocurrió un error al intentar eliminar el producto: " + e.getMessage());
		}
	}
}
