package constructor;
import java.util.Scanner;
public class studentdetails {
	String name;
	int age;
	public studentdetails()
	{
		System.out.println("enter student name and age");
		Scanner sc=new Scanner(System.in);
		 name=sc.next();
		 age=sc.nextInt();
	}
	void print()
	{
		
		System.out.println("student name:"+name);
		System.out.println("student age:"+age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		studentdetails sd=new studentdetails();
		sd.print();
	}
	
}
