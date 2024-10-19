package polymorphism;

public class Poly_Child extends Poly_Parent{

	public static void main(String[] args) {
		Poly_Child objt=new Poly_Child();
       objt.add(20, 10);
	}
	public void add(int a,int b)
	{
		 super.add(30, 20);
		int c=a-b;
		System.out.println("The differnce of 2 integers is: "+c);
	}

}
