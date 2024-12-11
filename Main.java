import com.google.gson.Gson;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ProductPDFCreator pdfCreator = new ProductPDFCreator();
		ProductCatalog catalog = new ProductCatalog();
		Scanner scanner = new Scanner(System.in);
		Gson gson = new Gson();

		while (true) {
			System.out.println("*****************************************************");
			System.out.println("* Bienvenido al Catálogo de Productos.             *");
			System.out.println("* Selecciona una de las siguientes opciones:       *");
			System.out.println("* 1) Buscar Productos                              *");
			System.out.println("* 2) Agregar Producto                              *");
			System.out.println("* 3) Eliminar Producto                             *");
			System.out.println("* 4) Generar PDF de un Producto                    *");
			System.out.println("* 0) Salir                                         *");
			System.out.println("*****************************************************");
			System.out.print("Opción: ");
			int option = scanner.nextInt();
			scanner.nextLine();

			int productId;

			switch (option) {
			case 1:
				System.out.println("1) Buscar productos por:");
				System.out.println("a) ID");
				System.out.println("b) Categoría");
				System.out.println("c) Nombre/Descripción");
				System.out.println("d) Rango de precio");
				System.out.print("Opción: ");
				String searchOption = scanner.nextLine();

				catalog.searchProducts(searchOption, scanner);
				break;

			case 2:
				System.out.println("Agregar un nuevo producto:");
				catalog.addProduct(scanner, gson);
				break;

			case 3:
				System.out.print("Ingresa el ID del producto a eliminar: ");
				productId = scanner.nextInt();
				catalog.deleteProduct(productId);
				break;

			case 4:

				System.out.print("Ingresa el ID del producto para generar el PDF: ");
				productId = scanner.nextInt();
				scanner.nextLine();

				Product product = catalog.getProductById(productId);
				if (product != null) {
					pdfCreator.guardaPDFDeProducto(product);
				} else {
					System.out.println("Producto no encontrado.");
				}
				break;

			case 0:
				System.out.println("¡Hasta luego!");
				scanner.close();
				return;

			default:
				System.out.println("Opción inválida. Intenta nuevamente.");
			}
		}
	}
}
