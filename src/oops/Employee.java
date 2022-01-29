package oops;

public class Employee {
	public String Name;
	public int EmployeeId;
	public static int salary;
	public static String companyName = "Infosys";
	
	public Employee(String Name,int EmployeeId,int salary) {
	
		this.Name = Name;
		this.EmployeeId = EmployeeId ;
		this.salary = salary;
		
	}
	public Employee(String Name,int EmployeeId) {
		
		this.Name = Name;
		this.EmployeeId = EmployeeId ;
		
		
	}

	public void printName() {
		
		System.out.println("Name of Emplyee is " + Name );
		
	}
	public void printSalary() {
		System.out.println("salary of Emplyee is " + Employee.salary );
	}
	public static void ChangeCompanyName() {
		Employee.companyName = "Infosys Technology" ;
	}
public void printcompanyName() {
		
		System.out.println("Name of the company is " + companyName );
		
	}
}
