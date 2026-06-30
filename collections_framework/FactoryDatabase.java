package collections_framework;

// 1. Import the HashMap tool
import java.util.HashMap;

public class FactoryDatabase {
    public static void main(String[] args) {
        
        System.out.println("--- Booting Factory MES Database ---");

        // 2. THE SETUP (The Double Bouncer)
        HashMap<String, String> warehouse = new HashMap<>();

        // 3. LOADING THE DATABASE (O(1) Insertion)
        System.out.println("[SYSTEM] Loading parts into memory...");
        warehouse.put("PRT-900", "Motherboard V2");
        warehouse.put("PRT-104", "10k Ohm Resistor");
        warehouse.put("PRT-555", "Intel i9 Processor");
        warehouse.put("PRT-302", "Cooling Fan");

        // 4. THE INSTANT SEARCH (O(1) Retrieval)
        String barcodeScanned = "PRT-9899";
        System.out.println("\n[SCANNER] Beep! Searching for: " + barcodeScanned);

        // We do NOT use a loop. We just ask the HashMap for the key directly.
        String partFound = warehouse.get(barcodeScanned);

        if (partFound == null) {
            System.out.println("[RESULT] Assembly Line requires: " + barcodeScanned + " but it is NOT in stock!");
        } else {
            System.out.println("[RESULT] Assembly Line requires: " + partFound);
        }

        System.out.println("[RESULT] Assembly Line requires: " + partFound);
    }
}