public class Account {
    //data 
    private String accNo,name,address;
    private float balance;
    
    //constructor method
    public Account(String no, String na, String add, float bal){
        accNo = no;
        name  = na;
        address = add;
        balance = bal;
    }
    
    //methods
    public void deposit(float amt){
        balance = balance + amt; 
    }
    
    public void withdraw(float amt){
        balance = balance - amt; //not good
    }
    
    public void showDetails(){
        System.out.println("Account Number : " + accNo);
        System.out.println("Customer Name  : " + name);
        System.out.println("Address        : " + address);
        System.out.println("Bank Balance   : " + balance);
        System.out.println("***********************************\n");
    } 
    
}//end of Account Class
