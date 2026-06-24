package factory_hr;

public class FactoryHR {
    public static void main(String[] args) {
        // Create instances of Consultant and Operator
        Employee consultant = new Consultant("C001", 50.0);
        Employee operator = new Operator("O001", 30.0);

        // Process shifts for both employees
        consultant.processShift(8); // Consultant worked 8 hours
        operator.processShift(10);   // Operator worked 10 hours
    }
}