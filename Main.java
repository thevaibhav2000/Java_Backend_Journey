public class Main{
    public static void main(String[] args) {
     int item_price = 10;
     double tax_rate = 0.18;
     boolean is_item_on_sale = true;
        double tax_amount = item_price * tax_rate;
        double total_price = item_price + tax_amount;

        String storeMessage = "Thank you for shopping with us!";
      System.out.println("Availability Status: " + is_item_on_sale);
        System.out.println("Item Price: $" + item_price);
        System.out.println("Tax Amount: $" + tax_amount);
        System.out.println("Total Price: $" + total_price);
          System.out.println(storeMessage);
    }
}