public class Item {
    
    private double price;

    public Item(double price) {
        this.price = price;
    }

    public Item() {
        this(1.00);
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}