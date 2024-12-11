import java.util.List;

public class Product {
	private int id;
	private String title;
	private double price;
	private String description;
	private String category;
	private List<String> images;

	public Product(int id, String title, String description, double price, String category, List<String> images) {
		this.id = id;
		this.title = title;
		this.description = description;
		this.price = price;
		this.category = category;
		this.images = images;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public List<String> getImages() {
		return images;
	}

	public void setImages(List<String> images) {
		this.images = images;
	}

	@Override
	public String toString() {
		return "Producto {" + "ID=" + id + ", Nombre='" + title + '\'' + ", Precio=" + price + ", Descripción='"
				+ description + '\'' + ", Categoría='" + category + '\'' + ", Imágenes=" + images + '}';
	}
}
