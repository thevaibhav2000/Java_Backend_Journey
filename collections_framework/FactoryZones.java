package collections_framework;

import java.util.HashMap;
import java.util.ArrayList;

public class FactoryZones {
    public static void main(String[] args) {
        
        System.out.println("--- Booting Factory Zone Manager ---");

        // 1. THE NESTED SETUP (HashMap containing ArrayLists)
        HashMap<String, ArrayList<String>> factory = new HashMap<>();

        // 2. CREATE AND FILL THE ARRAYLISTS
        ArrayList<String> zoneAMachines = new ArrayList<>();
        zoneAMachines.add("Robotic Welder 1");
        zoneAMachines.add("Conveyor Belt A");
        zoneAMachines.add("Laser Scanner");

        ArrayList<String> zoneBMachines = new ArrayList<>();
        zoneBMachines.add("Packaging Arm");
        zoneBMachines.add("Shipping Labeler");

        // 3. PUT THE LISTS INTO THE HASHMAP
        // We are locking an entire list behind a single String Key!
        factory.put("Zone_A", zoneAMachines);
        factory.put("Zone_B", zoneBMachines);

        // 4. THE MANAGER'S REQUEST
        String targetZone = "Zone_z";
        System.out.println("\n[DASHBOARD] Manager requested status for: " + targetZone);

        // 5. RETRIEVAL AND PRINTING
        // We give the HashMap the String Key, and it hands us the ArrayList
        ArrayList<String> retrievedList = factory.get(targetZone);

        if (retrievedList == null) {
            System.out.println("[ALARM] Zone does not exist!");
        } else {
            System.out.println("Machines running in " + targetZone + ":");
            
            // We use our For-Each loop to cleanly print the extracted list
            for (String machine : retrievedList) {
                System.out.println(" > " + machine);
            }
        }
    }
}