package array_list_autoboxing_unboxing.array.arraylist.arraylistpractice1;

public class Contacts {
	private String name;
	private String phone;
	
	public Contacts(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}
	
	
	public static Contacts createContact(String name, String phoneNumber) {
		return new Contacts(name, phoneNumber);
	}
	
	
}
