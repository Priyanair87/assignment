package factorial;
import java.util.Scanner;
public class FactorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number:");
		int n=sc.nextInt();
		int ans=FactorialNumber.fact(n);
		System.out.println("factorial of a number: " +n+" is= " +ans);
		
	}
		
	static int fact(int n)
		{
      if(n==0 || n==1)
      {
    	  return 1;
      }
      else
      {  
    	
          int f=1;
    	  for(int i=1;i<=n;i++)
    	 {
    		  f=f*i;
    		  
    	 }
    	  return(f);
    	  
      }
     }

}
