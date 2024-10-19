package polymorphism;
import java.util.Scanner;
public class OffSeason_Child extends OnSeason_Parent {

	public static void main(String[] args) {
		
		OffSeason_Child obj=new OffSeason_Child();
		Scanner sc= new Scanner(System.in);	
		System.out.println("The cost of an item is: ");
		 float cost=sc.nextFloat();
		 sc.close();
		obj.calculatediscount(cost);
		//System.out.println(result);

	}
	public float calculatediscount(float cost)
	{
		super.calculatediscount(cost);
		float discountper=0.15f;
	float discount=cost*discountper;
    float finalprice=cost-discount;
	System.out.println("The rate of the item in offseason is: "+finalprice);
	
		return finalprice;
	
	}

}
