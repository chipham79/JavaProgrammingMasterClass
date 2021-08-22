package SchoolSystem.model;

import java.util.Scanner;

public abstract class Employee {

	protected String id;
	protected String name;
	protected String dob;
	protected String address;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void inputInfo() {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter employee id: ");
		this.id = sc.nextLine();
		
		
		System.out.println("Enter employee name: ");
		this.name = sc.nextLine();
		
		System.out.println("Enter employee dob: ");
		this.dob = sc.nextLine();
		
		System.out.println("Enter employee address: ");
		this.address = sc.nextLine();
			
	
		
	}
	
	public void getInfo() {
		System.out.println("Name employee: " + this.name + ", Date of Birth: " + this.dob);
	}
}
