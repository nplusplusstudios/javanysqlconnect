public class TestAccount {
    public static void main(String[] args) {
        //delcare an Account object        
        Account acc,acc2,acc3;
        
        //create the Account Object
        acc = new Account("001","Sam","kandy",7500f);
        acc2 = new Account("002","Anne","Colombo",5000f);
        acc3 = new Account("005","John Doe","Kandy",12500f);
        
        //Call the methods
        acc.showDetails();
        
        acc.deposit(5000);        
        acc.showDetails();
        
        acc.withdraw(2000);        
        acc.showDetails();
        
        acc2.showDetails();
        acc3.showDetails();
        
        System.out.println("TEST CODE BELOW");
        System.out.println("**************************");        
        
        Account acc4 = new Account("009","Kevin","Kandy",5000);
        
        //acc4.balance = 500000;
        acc4.showDetails();
        
        
    }//end of main method
}//end of program
