package primestatic;
import java.util.Scanner;
public class StaticPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number:");
		int n=sc.nextInt();
		StaticPrimeNumber.prime(n);
	}
  static void prime(int num)
  {
	  int a=num;
	  int r=0;
	  while(num!=0)
	  {  
		  r=r*10+num%10 ;
		  num=num/10;  
	  }
	  StaticPrimeNumber.check(r, a);
  }
	  static void check(int r,int a)
	  {
	  if(r==a)
	  {
		 System.out.println("palindrome");
	  }
		 else
		 {
		   System.out.println("not palindrome"); 
		 }
	  }
  }

