package array_list_autoboxing_unboxing.array.arraylist.arraylistpractice1;

import java.util.Scanner;

public class TestContact {
	private static Scanner scanner = new Scanner(System.in);
	private static MobilePhone mobilePhone = new MobilePhone("888 888 8888");
	
	public static void main(String[] args) {
		boolean quit = false;
		startPhone();
		printAction();
		
		while(!quit) {
			System.out.println("\nEnter action: (6 to show available actions)");
			int action = scanner.nextInt();
			scanner.nextLine();
			
			switch (action) {
			case 0: 
				System.out.println("Shutting down..");
				quit = true;
				break;
			case 1:
				mobilePhone.printContacts();
				break;
			case 2:
				addNewContact();
				break;
			case 3:
				updateContact();
				break;
			case 4:
				removeContact();
				break;
			case 5:
				queryContact();
				break;
			case 6:
				printAction();
				break;
			}
		}
	}
	
	private static void addNewContact() {
		System.out.println("Enter new contact name: ");
		String contactName = scanner.nextLine();
		
		System.out.println("Enter new contact phone: ");
		String contactPhone = scanner.nextLine();
		
		Contacts newContact = Contacts.createContact(contactName, contactPhone);
		if(mobilePhone.addNewContact(newContact)) {
			System.out.println("New contact added: Name = " + contactName + "," + " Phone Number = " + contactPhone);			
		}
		else {
			System.out.println("Cannot add, " + contactName + " already on file");
		}
	}
	
	private static void updateContact() {
		System.out.println("Enter existing contact name: ");
		String name = scanner.nextLine();
		
		Contacts existingContactRecord =  mobilePhone.queryContact(name);
		if(existingContactRecord == null) {
			System.out.println("Contact not found");
			return;
		}
		System.out.println("Enter new contact name: ");
		String newName = scanner.nextLine();
		
		System.out.println("Enter new contact phone: ");
		String newPhone = scanner.nextLine();
		
		Contacts newContact = Contacts.createContact(newName, newPhone); 
		
		if(mobilePhone.updateContact(existingContactRecord, newContact)) {
			System.out.println("Successfully updated");
		}
		else {
			System.out.println("Error updating record.");
		}
	}
	
	private static void removeContact() {
		System.out.println("Enter existing contact name: ");
		String name = scanner.nextLine();
		
		Contacts existingContactRecord =  mobilePhone.queryContact(name);
		if(existingContactRecord == null) {
			System.out.println("Contact not found");
			return;
		}
		
		if(mobilePhone.removeContact(existingContactRecord)) {
			System.out.println("Sucessfully deleted");
		}
		else {
			System.out.println("Error deleting contact");
		}
	}
	
	private static void queryContact() {
		System.out.println("Enter existing contact name: ");
		String name = scanner.nextLine();
		
		Contacts existingContactRecord =  mobilePhone.queryContact(name);
		if(existingContactRecord == null) {
			System.out.println("Contact not found");
			return;
		}
		else {
			System.out.println("Found: Name = " + existingContactRecord.getName() + "," + " phone number is " + existingContactRecord.getPhone());
		}						
	}
	
	private static void startPhone() {
		System.out.println("Staring phone...");
	}
	
	private static void printAction() {
		System.out.println("\nAvailable actions:\npress");
		System.out.println(
				"0 - to shutdown\n" + 
				"1 - to print contact\n" + 
				"2 - to add new contact\n" + 
				"3 - to update an existing contact\n" + 
				"4 - to remove an existing contact\n" + 
				"5 - query if an existing contact exists\n" + 
				"6 - to print a list of avaiable actions.");
		System.out.println("Choose your action");
					
	}
}
