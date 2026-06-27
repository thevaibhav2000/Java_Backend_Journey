package oop_security;

public class FactoryConfig {
    public static void main(String[] args) {
          System.out.println("--- Booting Factory Configuration ---");
        int curr_temp = 85;

        final int MAX_TEMP =100;

        System.out.println("Current temperature is: " + curr_temp);
        System.out.println("Maximum temperature is: " + MAX_TEMP);  

System.out.println("\n[ALERT] Heating up machines...");


curr_temp = 105;
System.out.println("New Current Temp: " + curr_temp);
// MAX_TEMP =200;


       
       //System.out.println("Maximum temperature is: " + MAX_TEMP);  


    }
}
