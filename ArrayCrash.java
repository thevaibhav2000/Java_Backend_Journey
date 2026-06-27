public class ArrayCrash {
    public static void main(String[] args) {
        
        try {
            // 1. THE DANGER ZONE
            int[] myNumbers = {10, 20, 30}; 
            
            // We ask Java to try running this risky line:
            System.out.println(myNumbers[5]); 
            
        } catch (ArrayIndexOutOfBoundsException e) {
            // 2. THE RESCUE ZONE
            // Java sees the crash above, stops it, and instantly jumps down here!
            System.out.println("Error: You tried to grab a number that doesn't exist!");
        }
        
    }
}