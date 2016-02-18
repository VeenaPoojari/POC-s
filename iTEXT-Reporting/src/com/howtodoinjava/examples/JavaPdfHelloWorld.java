package com.howtodoinjava.examples;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class JavaPdfHelloWorld
{
   public static void main(String[] args)
   {
      Document document = new Document();
      try
      {
         PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("HelloWorld.pdf"));
        
         document.open();
         System.out.println(document.getPageNumber());
         document.add(new Paragraph("A Hello World PDF document."));
         document.close();
         writer.close();
         System.out.println("done");
      } catch (DocumentException e)
      {
         e.printStackTrace();
      } catch (FileNotFoundException e)
      {
         e.printStackTrace();
      }
   }
}