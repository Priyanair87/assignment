package instancemethod;

public class IntFloatAdd {
	void addition(int a,int b,int c)
    {
       
        float avg=(a+b+c)/3;
        System.out.println("integer avg:"+avg);
    }
    void addition(float x,float y,float z)
    {
        float avg=(x+y+z)/3;
        System.out.println("float:"+avg);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int a,b,c;
   float x,y,z;
   a=2;
   b=6;
   c=8;
   x=2.5f;
   y=3.6f;
   z=5.6f;
   IntFloatAdd ia=new IntFloatAdd();
   ia.addition(a,b,c);
   ia.addition(x, y, z);
		   
		   
		   
	}

}
