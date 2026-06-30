package fulfillment;    

public class WarehouseRunner {
    public static void main(String[] args) {
        System.out.println("--- Booting Warehouse Automated Fulfillment Engine --- \n");

        // We declare ONE generic parent reference variable container
        ShippingOrder currentOrder;

        // --- SHIPMENT #1: DRONE ---
        System.out.println("Processing Shipment #1:");
        currentOrder = new DroneShipping("MUMBAI-ZONE3", 4.5);
        currentOrder.calculateDeliveryTime(); // Runs Drone logic!

        System.out.println("\n------------------------------------------------\n");

        // --- SHIPMENT #2: CARGO JET ---
        System.out.println("Processing Shipment #2:");
        // POLYMORPHISM: We swap the exact same variable to hold your new Jet object block!
        currentOrder = new JetShipping("LONDON-HEATHROW", 850.0);
        currentOrder.calculateDeliveryTime(); // Runs Jet logic automatically!
    }
}