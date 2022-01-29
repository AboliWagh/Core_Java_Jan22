package oops;

public class PersonClass {

	public String Name;
	public int Age;
	
	public PersonClass () {
		
		System.out.println("Inside Parent Default Constructor");
		
	}
	
	public PersonClass (String Name, int Age) {
		
		this.Name = Name;
		this.Age = Age;
		
	}
	
	public void display() {
		
		System.out.println("Inside Parent");
		
	}
	
}
