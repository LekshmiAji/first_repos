package abraction;

import java.util.Scanner;

public class FullTimeEmployee extends Employee{
	double salary;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Input for Contractor
        System.out.print("Enter Contractor Name: ");
        String contractorName = scanner.nextLine();
        System.out.print("Enter Payment Per Hour: ");
        double paymentPerHour = scanner.nextDouble();
        System.out.print("Enter Working Hours: ");
        int workingHours = scanner.nextInt();
        Employee contractor = new Contractor_Employee(contractorName, paymentPerHour, workingHours);
        System.out.println("Contractor Salary: $" + contractor.calculate_salary());

        // Clear the buffer
        scanner.nextLine(); 

        // Input for FullTimeEmployee
        System.out.print("Enter Full-Time Employee Name: ");
        String fullTimeName = scanner.nextLine();
        System.out.print("Enter Monthly Salary: ");
        double monthlySalary = scanner.nextDouble();
        Employee fullTimeEmployee = new FullTimeEmployee(fullTimeName, monthlySalary);
        System.out.println("Full Time Employee Salary: $" + fullTimeEmployee.calculate_salary());

        scanner.close();
	}
		
	
	
	public FullTimeEmployee(String employee_name,double salary)
	{
		super(employee_name);
		this.salary=salary;
		
	}

	@Override
	public double calculate_salary() {
		return salary;
	}

}
