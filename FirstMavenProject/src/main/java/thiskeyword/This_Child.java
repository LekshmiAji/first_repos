package thiskeyword;

public class This_Child extends  This_parent{
String a="Child Class";

	public static void main(String[] args) {
		
		This_Child objt=new This_Child();
		objt.display();
	}
	public void display()
	{
		
		System.out.println(a);
		System.out.println(super.a);
	}

}
