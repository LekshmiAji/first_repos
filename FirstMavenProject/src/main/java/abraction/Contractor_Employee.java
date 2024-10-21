package abraction;

public class Contractor_Employee extends Employee{
	double hourly_rate;
	int hour_worked;
	public double calculate_salary()
	{
		return hourly_rate*hour_worked;
		
	}
	public Contractor_Employee(String employee_name,double hourly_rate,int hour_worked)
	{
		super(employee_name);
		this.hour_worked=hour_worked;
		this.hourly_rate=hourly_rate;
	}
}
