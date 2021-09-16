package defaultpackage;

import java.io.PrintStream;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Cart cart = new Cart();
        Item peaches = new Item(0.75);
        peaches.addPromotion(new Promotion(4, Promotion.DiscountType.FLAT, 0.25, peaches));
        Item avocados = new Item(2.00);
        Item mangos = new Item(2.00);
        mangos.addPromotion(new Promotion(2, Promotion.DiscountType.FREE_ITEM, 0, mangos));

        Scanner in = new Scanner(System.in);
        System.out.println("Welcome!");
        System.out.print("How many peaches would you like: ");
        int numOfPeaches = in.nextInt();
        cart.addItem(peaches, numOfPeaches);
        System.out.print("How many avocados: ");
        int numOfAvocados = in.nextInt();
        cart.addItem(avocados, numOfAvocados);
        System.out.print("How many mangos: ");
        int numOfMangos = in.nextInt();
        cart.addItem(mangos, numOfMangos);
        System.out.println("Your total will be $" + cart.getCartTotal() + ".");
        System.out.println("Have a nice day!");
        in.close();
    }
}
