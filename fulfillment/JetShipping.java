package fulfillment;

public class JetShipping extends ShippingOrder {
    public JetShipping(String destinationCode, double packageweight) {
        super(destinationCode, packageweight);
    }

    @Override
    public void calculateDeliveryTime() {
        System.out.println("JET FLEET -> Calculating flight paths for weight: " 
                            + this.packageweight + " kg to destination: " + getDestinationCode());
    }
    
}
