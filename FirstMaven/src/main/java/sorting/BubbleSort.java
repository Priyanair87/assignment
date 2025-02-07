package sorting;
import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int a[];
		    int temp;
		    a=new int[5];
		    Scanner sc=new Scanner(System.in);
		    System.out.println("enter the elements");
		    for(int i=0;i<5;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    for(int i=0;i<5-1;i++)
		    {
		        for(int j=0;j<5-1;j++)
		        {
		        if(a[j]>a[j+1])
		        {
		         temp=a[j];
		         a[j]=a[j+1];
		         a[j+1]=temp;
		        }
		        }
		    }
		    for(int i=0;i<5;i++)
		    {
		      System.out.print(a[i]);
		    }
		  


	}

}
