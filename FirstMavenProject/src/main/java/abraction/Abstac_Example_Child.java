package abraction;

public class Abstac_Example_Child extends Abstrac_Example1 {

	public static void main(String[] args) {
		
		Abstac_Example_Child objt=new Abstac_Example_Child();
		objt.display();
		objt.display1();
				
	}

	@Override
	public void display1() {
		System.out.println("Welcome");
		
	}

}
