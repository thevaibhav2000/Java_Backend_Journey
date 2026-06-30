package collections_framework;

// 1. We MUST import this to use the Collections Framework
import java.util.ArrayList;

public class ShoppingCart {
    public static void main(String[] args) {
        
        System.out.println("--- Booting Amazon Cart Server ---");

        // 2. THE SETUP
        // Notice the <String>. This is a "Bouncer". 
        // It guarantees ONLY Strings can enter this specific list.
        ArrayList<String> cart = new ArrayList<>();

        // 3. INFINITE ADDING (No size limits!)
        System.out.println("\n[ACTION] User is adding items...");
        cart.add("MacBook Pro");
        cart.add("Wireless Mouse");
        cart.add("Mechanical Keyboard");
        cart.add("HDMI Cable");

        System.out.println("Cart contains " + cart.size() + " items.");
        System.out.println("Current Cart: " + cart);

        // 4. AUTO-SHIFTING (The magic of removing)
        System.out.println("\n[ACTION] User changed their mind. Removing 'Wireless Mouse'...");
        
        // In a standard array, removing an item leaves a dangerous 'null' hole.
        // The ArrayList physically deletes the hole and shifts the Keyboard and Cable up!
        cart.remove("Wireless Mouse");

        System.out.println("Cart contains " + cart.size() + " items.");
        System.out.println("Current Cart: " + cart);
    }
}