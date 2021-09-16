package defaultpackage;

import java.util.ArrayList;

public class Item {
    
    private double price;
    private ArrayList<Promotion> promotions;


    public Item(double price) {
        this.price = price;
        promotions = new ArrayList<Promotion>();
    }

    public Item() {
        this(1.00);
    }

    public boolean addPromotion(Promotion promotion) {
        return promotions.add(promotion);
    }

    public Promotion removePromotion(int index) {
        return promotions.remove(index);
    }

    public Promotion getPromotion(int index) {
        return promotions.get(index);
    }

    public ArrayList<Promotion> getPromotions() {
        return new ArrayList<Promotion>(promotions);
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}