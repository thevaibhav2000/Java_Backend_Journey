package custom_exceptions;

public class BankAPI {

    // This is our business process
    public static void withdrawMoney(int accountBalance, int withdrawAmount) {
        
        System.out.println("\n[SERVER] Processing withdrawal of $" + withdrawAmount + "...");

        // 1. Check the Business Rule
        if (withdrawAmount > accountBalance) {
            // 2. PULL THE FIRE ALARM!
            // This immediately stops the method. Code below this line will NOT run.
            throw new IllegalArgumentException("INSUFFICIENT FUNDS! You only have $" + accountBalance);
        }

        // 3. If the alarm wasn't thrown, we are safe to give the money
        int newBalance = accountBalance - withdrawAmount;
        System.out.println("[SERVER] Success! Please take your cash. New Balance: $" + newBalance);
    }

    public static void main(String[] args) {
        System.out.println("--- Welcome to HDFC ATM ---");

        int myBalance = 1000;

        try {
            // TEST 1: A safe withdrawal
            withdrawMoney(myBalance, 200);

            // TEST 2: The Hacker Attempt (This will trigger our custom alarm)
            withdrawMoney(myBalance, 5000); 

            // This line will NEVER print because the alarm above stops the program
            System.out.println("Have a nice day!"); 

        } catch (IllegalArgumentException e) {
            // 4. Catching our own alarm!
            System.out.println("\n[SECURITY ALERT CAUGHT]: " + e.getMessage());
        } finally {
            System.out.println("\n[SYSTEM] Closing database connection. Goodbye.");
        }
    }
}