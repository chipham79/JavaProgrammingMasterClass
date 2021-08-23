package Section6oop.person;

public class Person {
	private String firstName;
	private String lastName;
	private int age;
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public int getAge() {
		if ( (this.age <= 0) || (this.age > 100) ) {
			return this.age = 0;
		}
		return this.age;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public boolean isTeen() {
		if ( (this.age > 12) && (this.age < 20) ) {
			return true;
		}
		return false;
	}
	
	public String getFullName() {
		if ( (this.firstName.isEmpty()) && (this.lastName.isEmpty()) ) {
			return "";
		}
		return (this.firstName + " " + this.lastName).trim();
	}
	
	public static void main(String[] args) {
		Person person = new Person();
		
		person.setFirstName("");
		person.setLastName("");
		person.setAge(10);
		
		System.out.println("fullName= " + person.getFullName());
		System.out.println("teen= " + person.isTeen());
		
		person.setFirstName("John");
		person.setAge(18);
		
		System.out.println("fullName= " + person.getFullName());
		System.out.println("teen= " + person.isTeen());
		
		person.setLastName("Smith");
		
		System.out.println("fullName= " + person.getFullName());
		
		
	}
	
}
