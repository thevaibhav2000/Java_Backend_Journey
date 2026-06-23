public class TempratureMonitor {
    public static void main(String[] args) {
        double[] coreTemprature = { 98.6, 99.1, 100.4, 101.2, 102.5, 103.0, 104.3 };
        System.out.println("--- Initiating Sensor Telemetry Scan ---");
        System.out.println("Total active sensor detected: " + coreTemprature.length);

        for(int i =0;i<coreTemprature.length;i++){
            double currentTemp = coreTemprature[i];
            if(currentTemp>100.0){
                System.out.println("warning sensor"+ i+"reads critical temp"+ currentTemp+"°C!");
            }else{
                System.out.println("sensor"+ i+"reads normal temp"+ currentTemp+"°C.");

            }
        }   
        System.out.println("--- Telemetry Scan Complete ---");
    }
}
