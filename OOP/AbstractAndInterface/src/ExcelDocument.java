public class ExcelDocument extends Document implements Printable{
    @Override
    public void open() {
        System.out.println("Excel açıldı");

    }

    @Override
    public void save() {
        System.out.println("Excel kaydedildi");

    }


    @Override
    public void print() {
        System.out.println("Excel çıktı alındı");
    }
}
