package customer;

import java.util.Scanner;

public class DiscountDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("enter the item price:");
		float amount=sc.nextFloat();
		float discount=DiscountDetails.checkdiscount(amount);
        System.out.println("discount amount:" +discount);
		float totalprice=DiscountDetails.totalamount(discount, amount);
        System.out.println("Final amount is:" +totalprice);

	}
static float checkdiscount(float amount)
{
	float discount;
	if(amount>5000)
	{
		 discount=(float) (amount*0.2);
	}
	else
	{
		 discount= 0f;
	}
	return discount;
}
static float totalamount(float discount,float amount)
{
	float totalprice;
	totalprice=amount-discount;
	return totalprice;
	
}

}
