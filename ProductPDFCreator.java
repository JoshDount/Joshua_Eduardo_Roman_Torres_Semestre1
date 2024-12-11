import com.itextpdf.text.Document;
import com.itextpdf.text.Image;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;
import java.net.URL;
import java.util.List;

public class ProductPDFCreator {

	public void guardaPDFDeProducto(Product product) {

		String pdfPath = "producto_" + product.getId() + ".pdf";

		try {

			Document document = new Document();

			PdfWriter.getInstance(document, new FileOutputStream(pdfPath));

			document.open();

			document.add(new Phrase("Nombre del Producto: " + product.getTitle() + "\n"));
			document.add(new Phrase("Descripción del Producto: " + product.getDescription() + "\n"));
			document.add(new Phrase("Precio del Producto: $" + product.getPrice() + "\n"));
			document.add(new Phrase("Categoría del Producto: " + product.getCategory() + "\n\n"));

			List<String> images = product.getImages();
			if (images != null && !images.isEmpty()) {
				for (String imageUrl : images) {
					try {

						Image image = Image.getInstance(new URL(imageUrl));

						image.scaleToFit(300, 300);

						document.add(image);

						document.add(new Phrase("\n"));
					} catch (Exception e) {
						System.out.println("No se pudo agregar una imagen: " + e.getMessage());
					}
				}
			} else {

				document.add(new Phrase("No hay imágenes disponibles para este producto.\n"));
			}

			document.close();

			System.out.println("PDF creado con éxito en: " + pdfPath);
		} catch (Exception e) {
			System.out.println("Error al crear el PDF: " + e.getMessage());
		}
	}
}
