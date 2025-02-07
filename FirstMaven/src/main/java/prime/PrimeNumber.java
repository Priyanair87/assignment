package prime;
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number:");
		n=sc.nextInt();
		boolean flag=true;
		if(n==0||n==1)
		{
			System.out.println("not prime number");
		}
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				flag=false;
				break;
			}
		}
		if(flag==true)
		{
			System.out.println("Pime");
		}
		else
		{
			System.out.println("not Pime");	
		}
		}
	}

		
		