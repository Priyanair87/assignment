package array;
import java.util.Scanner;
public class SumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a[];
		a=new int[5];
       int sum=0;
       
       for(int i=0;i<5;i++)
       {
    	 a[i] =sc.nextInt();
    	 sum+=a[i];
       }
       System.out.println("sum:"+sum);
      
	}

}
