public class ManufacturingTracker {
    public static void main(String[] args) {
        int batchSize = 5;
        double componentUnitPrice = 12.5;

      System.out.println("--- Starting Quality Inspection Loop ---");
      for(int i=1; i<=batchSize; i++){
        double cumulativeCost = i * componentUnitPrice;
        System.out.println("Inspecting Item #" + i + " | Cumulative Batch Cost: $" + cumulativeCost );
      }
      System.out.println("--- Batch Inspection Complete ---");
    }
    
}
