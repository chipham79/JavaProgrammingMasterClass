package Practice;

import java.util.Scanner;

public class Person {
	private String name;
	private int age;
	private int id;
	
	public Person(String name, int age, int id) {		
		this.name = name;
		this.age = age;
		this.id = id;
	}
	
	public String getName() {
		return name;
		
	}
	
	public int getAge() {
		return age;
		
	}
	
	public int getID() {
		return id;
		
	}
	public void inputInfo(Scanner scanner) {
		System.out.println("Enter name: ");
		name = scanner.nextLine();
		System.out.println("Enter age: ");
		name = scanner.nextLine();
		System.out.println("Enter id: ");
		name = scanner.nextLine();
		
	}
	
	public void showInfo(Scanner scanner) {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("ID: " + id);
	}
	
}	
