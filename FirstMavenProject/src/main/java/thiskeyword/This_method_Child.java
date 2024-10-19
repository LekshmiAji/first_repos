package thiskeyword;

public class This_method_Child extends This_method_parent  {

	public static void main(String[] args) {
		This_method_Child objt=new This_method_Child();
		objt.display2();
		

	}
public void display2()
{
	super.display1();
	System.out.println("This is the Child Method Class");
}
}
