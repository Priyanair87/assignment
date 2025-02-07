package amstrong;
import java.util.Scanner;

public class AmstongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number:");
		n=sc.nextInt();
		int a = 0;
		int b=n;
		int s=0;
		while(n!=0) {
			a=n%10;
			s=s+a*a*a;
			n=n/10;
			
		}
	if(s==b)
	System.out.println("amstrong number");
	else
	System.out.println("not an amstrong number");

	}

}
