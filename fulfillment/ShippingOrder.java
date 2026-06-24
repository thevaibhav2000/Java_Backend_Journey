package fulfillment;

public abstract class ShippingOrder {
    private String destinationCode;
    public double packageweight;

    public ShippingOrder(String destinationCode, double packageweight) {
        this.destinationCode = destinationCode;
        this.packageweight = packageweight;
    }
    public String getDestinationCode() {
        return destinationCode;
    }
    public abstract void calculateDeliveryTime();
}
