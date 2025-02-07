package studentdetails;

import java.util.Scanner;
public class TwoStudentDetails {
	String name;
	int age;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoStudentDetails ts=new TwoStudentDetails();
		ts.read();
		ts.print();
		TwoStudentDetails ts1=new TwoStudentDetails();
		ts1.read();
		ts1.print();
	}
void read()
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
}
