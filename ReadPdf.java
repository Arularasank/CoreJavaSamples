import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.PDFTextStripperByArea;

import java.io.File;
import java.io.IOException;

public class ReadPdf {

    public static void main(String[] args) throws IOException {

        try (PDDocument document = PDDocument.load(new File("C:/J/51684423_PFPYStatement.pdf"))) {

            document.getClass();

            if (!document.isEncrypted()) {
			
                PDFTextStripperByArea stripper = new PDFTextStripperByArea();
                stripper.setSortByPosition(true);

                PDFTextStripper tStripper = new PDFTextStripper();

                String pdfFileInText = tStripper.getText(document);
				
                

				// split by whitespace
                String lines[] = pdfFileInText.split("\\r?\\n");
				int i=0;
                for (String line : lines) {
                    //System.out.println(line);
					if(pdfFileInText.contains("Arularasan K")){
						System.out.println( );
					}
					
                }

            }

        }

    }
}
