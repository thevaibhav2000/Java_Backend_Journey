package factory_hr;

public class Operator extends Employee {
    public Operator(String employeeId, double hourlyRate) {
        super(employeeId, hourlyRate);
    }

    @Override
    public void processShift(int hoursWorked) {
        double totalPay = hoursWorked * getHourlyRate();
        System.out.println("Operator " + employeeId + " worked " + hoursWorked + " hours. Total pay: $" + totalPay);
    }
    
}
