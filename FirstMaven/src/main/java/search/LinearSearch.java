package search;
import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		    int a[];
		    //boolean flag=false;
		    a=new int[5];
		    Scanner sc=new Scanner(System.in);
		    
		   System.out.println("enter the elements to be searched");
		    int n=sc.nextInt();
		    System.out.println("enter the elements");
		    for(int i=0;i<5;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    for(int i=0;i<5;i++)
		    {
		        if(a[i]==n)
		        {
		            System.out.println(n+"element found at the position"+i);
		        }
		       /* else
		        {
		        	System.out.println(n+"element not found");	
		        }*/
		    }
		  
		}
		
}


