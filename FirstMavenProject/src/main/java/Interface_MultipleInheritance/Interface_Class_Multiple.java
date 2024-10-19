package Interface_MultipleInheritance;

public class Interface_Class_Multiple implements Interface_Example1,interface_Example2 {

	public static void main(String[] args) {

		Interface_Class_Multiple objt=new Interface_Class_Multiple();
		objt.sub();
		objt.sum();

	}

	@Override
	public void sub() {
    
		int a=20;
		int b=10;
		int c=a-b;
		System.out.println("The differnce is: "+c);

		
	}

	@Override
	public void sum() {
		int a=20;
		int b=50;
		int c=a+b;
		System.out.println("The sum is: "+c);

		
	}

}
