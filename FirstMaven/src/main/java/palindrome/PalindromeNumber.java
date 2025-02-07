package palindrome;
import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number:");
		n=sc.nextInt();
		int a = 0;
		int b=n;
		while(n!=0) {
			a=n%10+a*10;
			n=n/10;
			
			}
		if(a==b)
		System.out.println("Palindrome");
		else
		System.out.println("not palindrome");

	}

}
