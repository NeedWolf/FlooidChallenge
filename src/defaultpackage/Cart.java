package defaultpackage;

import java.util.*;

public class Cart {
    
    Dictionary<Item, Integer> items;
    
    public Cart() {
        items = new Hashtable<Item, Integer>();
    }

    public void addItem(Item item, int amount) {
        if (items.get(item) != null) {
            items.put(item, items.get(item) + amount);
        } else {
            items.put(item, amount);
        }
    }

    public boolean removeItem(Item item, int amount) {
        if (items.get(item) != null && items.get(item) >= amount) {
            items.put(item, items.get(item) - amount);
            return true;
        } else {
            return false;
        }
    }

    public void removeCart() {
        items = new Hashtable<Item, Integer>();
    }

    public double getCartTotal() {
        double total = 0;
        Enumeration<Item> iterator = items.keys();
        while (iterator.hasMoreElements()) {
            Item entry = iterator.nextElement();
            int amountInCart = items.get(entry);
            total = total + entry.getPrice() * amountInCart;
            for (Promotion p : entry.getPromotions()) {
                total = total - p.getDiscount(amountInCart);
            }
        }
        return total;
    }
}
