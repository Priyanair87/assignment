package oddeven;

public class OddEvenCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int ec=0;
     int oc=0;
     for(int i=10;i<=20;i++)
     {
    	 if(i%2==0)
    	 {
    		ec+=1;
    	 }
    	 else
    	 {
    		 oc+=1;
    	 }
     }
     System.out.println("even count:"+ec);
     System.out.println("odd count:"+oc);

	}

}
