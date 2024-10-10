package Salary_Inheritance;

import java.util.Scanner;

public class SalaryCalculation_Get {
	float basicPay;
	float deduction;
	float bonus;
	public void get_details()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the below details:");
		System.out.println("....................................");
		System.out.println("Enter the BasicPay: ");
		basicPay=sc.nextFloat();
		System.out.println("Enter the Deduction: ");
		deduction=sc.nextFloat();
		System.out.println("Enter the Bonus: ");
	    bonus=sc.nextFloat();
	}

}
