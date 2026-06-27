package testing_errors;

public class TimeClock {
    public static void main(String[] args) {
        System.out.println("--- Processing Factory Timecards ---");
        
        String scannedInput = "ABC-123"; 
        
        try {
            // THE DANGER ZONE
            int hoursWorked = Integer.parseInt(scannedInput);
            
            // This only runs if the line above succeeds!
            System.out.println("Success! Your total working Hour is: " + hoursWorked);
            
        } catch (NumberFormatException e) {
            // THE RESCUE ZONE
            System.out.println("ERROR: Invalid keypad input detected. Please enter numbers only!");
        }

        // PROOF OF SURVIVAL (No variables needed here)
        System.out.println("Server remains online.");
    }
}