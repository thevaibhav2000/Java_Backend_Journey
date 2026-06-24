package factory_hr;

public class Consultant extends Employee {
    public Consultant(String employeeId, double hourlyRate) {
        super(employeeId, hourlyRate);
    }

    @Override
    public void processShift(int hoursWorked) {
        double totalPay = hoursWorked * getHourlyRate();
        System.out.println("Consultant " + employeeId + " worked " + hoursWorked + " hours. Total pay: $" + totalPay);
    }
    
}
