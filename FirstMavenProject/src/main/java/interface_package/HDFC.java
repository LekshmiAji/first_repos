package interface_package;

import java.util.Scanner;

public class HDFC implements RBI {

	public static void main(String[] args) {
		HDFC hd=new HDFC();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount that you want to deposit: ");
		double amount=sc.nextDouble();
		System.out.println("Enter the duration for which you want to deposit: ");
		int duration=sc.nextInt();
		sc.close();
		double total= hd.recurringDeposit(amount, duration);
		System.out.println("Total amount after " +duration +" years: " + total);

	}
	public double recurringDeposit(double amount,int duration)
	{
		double total=amount+(amount*interestrate);
		return total;
		
	}
}
