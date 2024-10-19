package encapsulation;

import java.util.ArrayList;

public class Bank {
	private ArrayList<String> validpins=new ArrayList<>();
	
	public Bank()
	{
		validpins.add("1001");
		validpins.add("1234");
		validpins.add("1212");
	}
	public boolean validatepins(String enteredpin)
	{
		System.out.println("Valid pins are: "+validpins);
		//System.out.println(validpins.contains(enteredpin));
		return validpins.contains(enteredpin);
		
		
		}

}
