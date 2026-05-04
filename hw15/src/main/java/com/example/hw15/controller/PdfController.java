package com.example.hw15.controller;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class PdfController {
	
   
    // Generate PDF for a specific product
    @GetMapping("/generatepdf")
    public void generateBookPdf(HttpServletResponse response) throws Exception {
    	String title = "The Great Gatsby";
        String author = "F. Scott Fitzgerald";
        String description = "A novel set in the Jazz Age that explores wealth and society.";
        String price = "499";
        String publishedDate = "1925";
        
            response.setContentType("application/pdf");
            response.setHeader("Content-Disposition", "attachment; filename=book.pdf");

            try (PDDocument document = new PDDocument()) {
                PDPage page = new PDPage();
                document.addPage(page);

                try (PDPageContentStream contentStream = new PDPageContentStream(document, page)) {
                    contentStream.setFont(PDType1Font.HELVETICA_BOLD, 16);
                    contentStream.beginText();
                    contentStream.newLineAtOffset(50, 750);
                    contentStream.showText("Book Details");
                    contentStream.endText();

                    contentStream.setFont(PDType1Font.HELVETICA, 12);
                    int yPosition = 720;
                    contentStream.beginText();
                    contentStream.newLineAtOffset(50, yPosition);
                    contentStream.showText("Title: " + title);
                    contentStream.endText();

                    yPosition -= 20;
                    contentStream.beginText();
                    contentStream.newLineAtOffset(50, yPosition);
                    contentStream.showText("Author: " + author);
                    contentStream.endText();

                    yPosition -= 20;
                    contentStream.beginText();
                    contentStream.newLineAtOffset(50, yPosition);
                    contentStream.showText("Description: " + description);
                    contentStream.endText();

                    yPosition -= 20;
                    contentStream.beginText();
                    contentStream.newLineAtOffset(50, yPosition);
                    contentStream.showText("Price: " + price);
                    contentStream.endText();
                    
                    yPosition -= 20;
                    contentStream.beginText();
                    contentStream.newLineAtOffset(50, yPosition);
                    contentStream.showText("Published Date: " + publishedDate);
                    contentStream.endText();
                }

                document.save(response.getOutputStream());
            }
        } 
    
    @GetMapping("/book")
    public String bookPage() {
        return "book";
    }
    }
