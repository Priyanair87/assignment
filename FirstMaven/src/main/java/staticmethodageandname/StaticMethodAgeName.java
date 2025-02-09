package staticmethodageandname;
import java.util.Scanner;
public class StaticMethodAgeName {
	
	public static void main(String[]args) {
	
		StaticMethodAgeName.read();
	}
	
		
	static void read()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter name and age:");
			String name=sc.next();
			int age=sc.nextInt();
			StaticMethodAgeName.print(name,age);
		}
		static void print(String n,int a)
		{
		System.out.print("name:"+n +" "+"age:"+a);
		}
}
