package inheritance;

import java.util.Scanner;

public class Hierarch_Parent {
	public void Factorial()
	{
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		num=sc.nextInt();
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println("The factorial is: "+fact);
	}

}
