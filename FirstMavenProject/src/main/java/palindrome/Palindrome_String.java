package palindrome;

import java.util.Scanner;

public class Palindrome_String {

	public static void main(String[] args) {
		
		Palindrome_String obj=new Palindrome_String();
		obj.palindrome();
	}
	public void palindrome()
	{
		String str, rev="";
		Scanner stringob=new Scanner(System.in);
		System.out.println("Enter a string to check whether it is a palindrome or not");
		str=stringob.nextLine();
		int length=str.length();
		for(int i=length-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		if(str.equals(rev))
		{
			System.out.println("The given string is palindrome: "+rev);
		}
		else
		{
			System.out.println("The given string is not palindrome: "+rev);
		}
	}

}
