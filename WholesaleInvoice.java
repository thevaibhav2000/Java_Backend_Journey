public class WholesaleInvoice {
    public static void main(String[]cargs){
        int QuantityOrdered = 600;
        double basePrice = 50.0;
        double discountRate = 0.0;
        if(QuantityOrdered>=600){
            discountRate = 0.20;
        }else if(QuantityOrdered>=100){
            discountRate = 0.10;
        }else{
            discountRate = 0.0; 
        }  
        double TotalPrice = QuantityOrdered*basePrice;  
        double Savings = TotalPrice*discountRate;
        double FinalPrice = TotalPrice-Savings;
        System.out.println("Quantity Ordered: " + QuantityOrdered);
        System.out.println("Base Price: $" + basePrice);
        System.out.println("Discount Applied: " + (discountRate*100) + "%");
        System.out.println("Total Price: $" + TotalPrice);
        System.out.println("Savings: $" + Savings);
        System.out.println("Final Price: $" + FinalPrice);
    }
    
}
