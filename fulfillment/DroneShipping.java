package fulfillment;

public class DroneShipping extends ShippingOrder {
    public DroneShipping(String destinationCode, double packageweight) {
        super(destinationCode, packageweight);
    }

    @Override
    public void calculateDeliveryTime() {
        System.out.println("DRONE FLEET -> Calculating battery flight paths for weight: " 
                            + this.packageweight + " kg to destination: " + getDestinationCode());
    }
}
