package polymorphism;

public class OnSeason_Parent {
	public float calculatediscount(float cost)
	{
		
	float discountper=0.4f;
	float discount=cost*discountper;
    float finalprice=cost-discount;
   // System.out.println("The cost of the item is: "+cost);
	System.out.println("The rate of the item in Onseason is: "+finalprice);
		return finalprice;
	
	}
	}


