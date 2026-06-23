public class CurrencyConverter {
    public static void main(String[] args) {
        double usdAmount1 = 45.0;
        double usdAmount2 = 120.50;
        System.out.println("--- Initiating Reusable Currency Exchange Processing ---");
        
        // we here call the function that we had made it is reusable peice of code and we can call it as many times as we want
        double result1= ConvertToInr(usdAmount1);
        double result2= ConvertToInr(usdAmount2);
       System.out.println("$" + usdAmount1 + " USD converts to: ₹" + result1 + " INR");
        System.out.println("$" + usdAmount2 + " USD converts to: ₹" + result2 + " INR");
    }

    public static double ConvertToInr(double usd) {
        double exchangeRate = 83.50; // Example conversion rate
        double finalInr = usd * exchangeRate;
        return finalInr;
    }
}
