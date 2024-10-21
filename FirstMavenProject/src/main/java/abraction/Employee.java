package abraction;

public abstract class Employee {
	String employee_name;
	public abstract double calculate_salary();
	 public Employee(String employee_name)
	 {
		 this.employee_name=employee_name;
	 }

}
