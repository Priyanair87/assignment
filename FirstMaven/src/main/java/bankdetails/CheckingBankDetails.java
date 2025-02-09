package bankdetails;
import java.util.Scanner;
public class CheckingBankDetails {
 static float balance;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("enter the balance amount:");
         balance=sc.nextFloat();
        CheckingBankDetails.deposit();
        CheckingBankDetails.withdraw();
        CheckingBankDetails.checkbalance();
    
	}
	  static void deposit()
	    {   
	        Scanner sc=new Scanner(System.in);
	       System.out.println("enter the amount to deposit:");
	            float amount=sc.nextFloat();
	         balance=balance+amount;
	         CheckingBankDetails.checkbalance();
	     
	    }
	    static void withdraw()
	    {   
	        Scanner sc=new Scanner(System.in);
	       System.out.println("enter the amount to withdrawal:");
	           float amount=sc.nextFloat();
	         if(amount>balance)
	         {
	           System.out.println("the withdrawal amount is greater than current balance,please renter the correct amount");
	           amount=sc.nextInt();
	           balance=balance-amount;
	         
	         }
	         else
	         {
	        balance=balance-amount;    
	         }
	     CheckingBankDetails.checkbalance();      
	    }
	    static void checkbalance()
	    {
	        System.out.println("the current account balance is:"+balance);
	    }
	}







