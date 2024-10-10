package Salary_Inheritance;

public class Total_Child2 extends Calculate_hra_pf_Child1 {
double total;
	public static void main(String[] args) {
		
		Total_Child2 ob=new Total_Child2();
		ob.get_details();
		ob.cal();
		ob.calculate();
		ob.display();
		
					
	}
	public void calculate()
	{
		total=hra+pf+basicPay+deduction+bonus;
		System.out.println("The total salary is : "+total);
		
	}
	public void display()
	{
		System.out.println("...................SALARY SLIP.................");
		System.out.println("BASIC PAY:  "+basicPay);
		System.out.println("BONUS  :  "+bonus);
		System.out.println("DEDUCTION :  "+deduction);
		System.out.println("HRA : "+hra);
		System.out.println("PF : "+pf);
		System.out.println("TOTAL SALARY : "+total);
		
	}

}
