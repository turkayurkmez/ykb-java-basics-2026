public class PDFDocument extends Document {
    @Override
    public void open() {
        System.out.println("PDF açıldı");
    }

    @Override
    public void save() {
        System.out.println("PDF kaydedildi");

    }


}
