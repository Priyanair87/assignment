package personvote;
import java.util.Scanner;
public class PersonVoteOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter person age:");
		int age=sc.nextInt();
		boolean a= PersonVoteOrNot.vote(age);
		System.out.println(a);
	}
 static boolean vote(int age)
 {
	 if(age>=18)
	 {
		 return true;
	 }
	 else
	 {
		 return false;	 
	 }
 }
}
