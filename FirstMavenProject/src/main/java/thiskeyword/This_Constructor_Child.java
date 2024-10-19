package thiskeyword;

public class This_Constructor_Child extends  This_Constructor_Parent{

	public static void main(String[] args) {
		
		This_Constructor_Child objt=new This_Constructor_Child();
		
		
	}
	public This_Constructor_Child()
	{
		super(10);
		System.out.println("This is the Constructor Parent Class");
	}

}
