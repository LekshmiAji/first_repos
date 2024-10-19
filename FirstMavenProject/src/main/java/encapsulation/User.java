package encapsulation;

import java.util.Scanner;

public class User {
private String pin_no;
	public static void main(String[] args) {
		
		Bank b=new Bank();
		User u=new User();
		u.set_pin("");
		String pin_enter=u.get_pin();
		
		if(b.validatepins(pin_enter))
		{
			System.out.println("You entered valid pin number.You can proceed.");
		}
		else
		{
			System.out.println("You entered invalid pin number.Please try again.");
		}

	}
	public void set_pin(String pin_no)
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the pin no:");
		 pin_no=sc.nextLine();
		sc.close();
		 this.pin_no=pin_no;
		 
			
	}
	public String get_pin()
	{
		
		return pin_no;
		
	}
	

}
