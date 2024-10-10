package Salary_Inheritance;

public class Calculate_hra_pf_Child1 extends SalaryCalculation_Get {
double hra,pf;
	
	void cal()
	{
		hra=0.05*basicPay;
		pf=0.02*basicPay;
		System.out.println("The hra is : "+hra);
		System.out.println("The pf is : "+pf);
	}
	

}
