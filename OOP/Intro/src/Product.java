public class Product {

    public String name;
    private double price;
    public void setPrice(double price){
        if (price<=0){
            System.out.println("Fiyat pozitif olmak zorundadırr");
            return;
        }
        this.price = price;
    }

    public double getPrice (){
        return this.price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int stock;

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public boolean isInStock(){
        return stock > 0;
    }
}
