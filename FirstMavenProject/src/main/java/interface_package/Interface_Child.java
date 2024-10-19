package interface_package;

public class Interface_Child implements Interface_Example1 {

	public static void main(String[] args) {

		Interface_Child objt=new Interface_Child();
		objt.add();

	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("Sum is : "+c);
		
	}
	

}
