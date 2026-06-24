package factory_hr;

public abstract class Employee{
    public String employeeId;
    private double hourlyRate;

    public  Employee(String employeeId, double hourlyRate){
        this.employeeId = employeeId;
        this.hourlyRate = hourlyRate;
    }


   // getter function
    public double getHourlyRate() {
          return hourlyRate;
     }
public abstract void processShift(int hoursWorked);
   
}


