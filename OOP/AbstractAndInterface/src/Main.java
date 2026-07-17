public class Main {
    public static void main(String[] args) {

        /*
        Doküman (başlık, tarih, kopyala(),taşı(), ac(),kaydet(),ciktiAl()
        * */

        ExcelDocument excelDocument = new ExcelDocument();
        WordDocument wordDocument = new WordDocument();
        PDFDocument pdfDocument = new PDFDocument();

        DocumentSaver documentSaver = new DocumentSaver();
        documentSaver.save(excelDocument);
        documentSaver.save(wordDocument);
        documentSaver.save(pdfDocument);

        DocumentPrinter dPrinter = new DocumentPrinter();
        dPrinter.Print(excelDocument);
        dPrinter.Print(wordDocument);
       // dPrinter.Print(pdfDocument);
    }
}