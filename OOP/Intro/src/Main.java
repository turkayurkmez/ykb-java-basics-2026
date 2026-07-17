public class Main {
    public static void main(String[] args) {

        Product p1 = new Product();
   //p1 nesnedir -> Product ise idea (sınıf)
        p1.name = "Küpe";

        Product p2 = p1;
        p2.name = "Kolye";

        System.out.println(p1.name);

//        p1.price = -1; //negatif olamaz!
        p1.setPrice(1);
        System.out.println(p1.getPrice());



    }
}