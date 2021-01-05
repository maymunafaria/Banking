package banking;
import java.util.*;

public class Account {
    private String name;
    private String phone_no;
    private double balance;
    private String pin;
   
//    with pin account
    public Account(String n, String ph , double b , String p)
        {
            this.name = n;
            this.phone_no = ph;
            this.balance = b;
            this.pin = p;
        }
    
 //  without pin 
    public Account(String n , String ph , double b)
    {
            this.name = n;
            this.phone_no = ph;
            this.balance = b;
}
// add pin 
            public void pin (String p)
                {
                     this.pin= p;
                 }

    
      void information()
    {
         System.out.println("name" +name);
        System.out.println("phone number" +phone_no);
        System.out.println("balance" + balance);
    }
 public void cashout(double amount)
{
if(pin==null)
{// pin added
}}


    public void addmoney(double amount)
    {
        this.balance = this.balance+amount;
        System.out.println("Add money: " + amount);
        System.out.println("new balance" + balance);
        
    }
    
    public void cashout(double amount, String pin){
        if (pin != this.pin){
            System.out.println("pin does not match");
            return;
        }
        else
        {
            if(balance >= amount){
                balance = balance-amount;
                System.out.println("Cash out: " + amount);
                System.out.println("new balance" + balance);
            }

         else{
                System.out.println("Failed to cash out due to insufficient balance ");
            }
        }
    }
}

          
        
    
    
