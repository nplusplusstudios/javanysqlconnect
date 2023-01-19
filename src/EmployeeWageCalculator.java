import java.util.Scanner;
public class EmployeeWageCalculator {
    //no need of a constructor method
    //only i need the methods to do the
    //work
    Scanner scan = new Scanner(System.in);
    
    public void findGrossWage(){
        float hw,hr,gross;
        System.out.println("Wage Calculations");
        System.out.print("enter hours worked : ");
        hw = scan.nextFloat();
        System.out.print("enter hourly rate  : ");
        hr = scan.nextFloat();
        gross = hw * hr;
        System.out.println("gross wage : " + gross);
    }
    
    public float getTaxAmount(float gross){
        if(gross >= 20000){
            return gross * (5f/100);
        }
        else if(gross >= 15000){
            return gross * (3f/100);
        }
        else if(gross >= 10000){
            return gross * (2f/100);
        }
        else{
            return gross * (1f/100);
        }
        
    }
    
}
