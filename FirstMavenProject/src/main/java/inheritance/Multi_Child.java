package inheritance;

import java.util.Scanner;

public class Multi_Child extends Multi_Parent2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multi_Child objt=new Multi_Child();
		objt.sub();
		objt.sum();
		objt.multiply();
		

	}
	
public void multiply()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter two numbers: ");
	int num1=sc.nextInt();
	int num2=sc.nextInt();
	
	int product;
	product=num1*num2;
	System.out.println("The product is: "+product);
}
}
