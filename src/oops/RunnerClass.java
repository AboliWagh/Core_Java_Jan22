package oops;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Employee emp1 = new Employee ();
		emp1.Name = "Aboli";
		emp1.EmployeeId = 12345;
		emp1.salary = 1000;*/
		
		/*Employee emp2 = new Employee ();
		emp2.Name = "Amit";
		emp2.EmployeeId = 121212;
		emp2.salary = 1200;*/
		
		//System.out.println("Name of emp1 " +emp1.Name );
		//System.out.println("Name of emp2 " +emp2.Name );
		
		//Employee emp1 = new Employee("Aboli",12345,1000);
		//Employee emp2 = new Employee("Amit",121212,1200);
		
		
		//emp1.printName();
		//emp2.printName();
		/*Employee emp3 = new Employee("Ved",12344321);
		emp3.printName();
		emp3.printSalary();
		Employee.ChangeCompanyName();
	
	emp3.printcompanyName();*/
	
	PersonClass per1 = new PersonClass();
	
	//ChildClass child1 = new ChildClass ();
	
	ChildClass child1 = new ChildClass ("Aboli",30,"Tester");
	
	
	child1.display();
	child1.print ();
	MethodOverLoadingExample obj = new  MethodOverLoadingExample();
	obj.sum(4,6);
	obj.sum(4,6,7);
	
	ICICIBank bank1 = new ICICIBank();
	bank1.Creditcard();
	
	EncapsulationExample Obj10 = new EncapsulationExample();
	
	Obj10.setName("Aboli");
	
	System.out.println(Obj10.getName());
	
	Obj10.setSalary(2000);
	System.out.println(Obj10.getSalary());
	
	Obj10.setCompany("Simplilearn");
	System.out.println(Obj10.getCompany());
	
	
	}

	

}
