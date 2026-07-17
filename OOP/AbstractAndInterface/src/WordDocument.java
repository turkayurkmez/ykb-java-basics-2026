public class WordDocument extends Document implements Printable{
    @Override
    public void open() {
        System.out.println("Word açıldı");

    }

    @Override
    public void save() {
        System.out.println("Word kaydedildi");

    }

    @Override
    public void print() {
        System.out.println("Word çıktısı alındı");

    }
}
