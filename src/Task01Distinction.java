
public class Task01Distinction {
    public static void main(String[] args) {
        //declare
        EmployeeWageCalculator ewc;
        //create object
        ewc = new EmployeeWageCalculator();
        
        //call the method
        ewc.findGrossWage();
        
        float a = 75000;
        float t = ewc.getTaxAmount(a);
        System.out.println("tax amount " + t);
        
    }
}
