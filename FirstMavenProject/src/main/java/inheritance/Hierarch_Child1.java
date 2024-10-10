package inheritance;

import java.util.Scanner;

public class Hierarch_Child1 extends Hierarch_Parent {

	public static void main(String[] args) {
		Hierarch_Child1 ob=new Hierarch_Child1();
		ob.Palindrome();

	}
	public void Palindrome()
	{
		int temp=0,sum=0,number,remainder;
		System.out.println("Enter the number to do the palindrome checking:  ");
		Scanner objt=new Scanner(System.in);
		number=objt.nextInt();
		temp=number;
		while(number>0)
		{
		remainder=number%10;
		sum=sum*10+remainder;
		number=number/10;
		//temp=number;
		}
		if(temp==sum)
		{
		System.out.println("PAlindrom");
		}
		else
		{
		System.out.println("Not");
		}
	}

}
