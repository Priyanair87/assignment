package instancemethod;

public class InstanceFloatIntAddition {
	 int a,b,c;
	    float x,y,z;
	    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceFloatIntAddition i=new InstanceFloatIntAddition();
        //ain m1=new Main();
        i.a=10;
        i.b=12;
        i.c=3;
        i.x=1.5f;
        i.y=1.4f;
        i.z=8.5f;
     i.addition(i.a,i.b,i.c);
         i.addition(i.x,i.y,i.z);

	}
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

}
