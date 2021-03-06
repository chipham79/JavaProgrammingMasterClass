package array_list_autoboxing_unboxing.array.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class TestGroceryList {
	private static Scanner scanner = new Scanner(System.in);
	private static GroceryList groceryList = new GroceryList();
	
	public static void main(String[] args) {
		boolean quit = false;
		int choice = 0;
		printInstruction();
		while (!quit) {
			System.out.println("Enter your choice: ");
			choice = scanner.nextInt();
			scanner.nextLine();
			switch(choice) {
			case 0: 
				printInstruction();
				break;
			case 1: 
				groceryList.printGroceryList();
				break;
			case 2: 
				addItem();
				break;
			case 3: 
				modifyItem();
				break;
			case 4: 
				removeItem();
				break;
			case 5: 
				searchForItem();
				break;
			case 6:
				processArrayList();
				break;			
			case 7: 
				quit = true;
				break;
			}
		}		
	}
	
	public static void printInstruction() {
		System.out.println("\nPress");
		System.out.println("\t 0 - To print choice option");
		System.out.println("\t 1 - To print the list of grocery items");
		System.out.println("\t 2 - To add an item to the list");
		System.out.println("\t 3 - To modify an item to the list");
		System.out.println("\t 4 - To remove an item to the list");
		System.out.println("\t 5 - To search for an item to the list");
		System.out.println("\t 6 - To quit the application");		
	}
	
	public static void addItem() {
		System.out.println("Please enter the grocery item: ");
		String item = scanner.nextLine();
		groceryList.addGroceryItem(item);
	}
	
	public static void modifyItem() {
		System.out.println("Current item name: ");
		String itemName = scanner.nextLine();

		System.out.println("Enter new item: ");
		String newItem = scanner.nextLine();
		
		groceryList.modifyGroceryItem(itemName, newItem);
				
	}
	
	public static void removeItem() {
		System.out.println("Enter item name: ");
		String itemName = scanner.nextLine();
		
		groceryList.removeGroceryItem(itemName);
	}
	
	public static void searchForItem() {
		System.out.println("Item to search for: ");
		String searchItem = scanner.nextLine();
		if(groceryList.onFile(searchItem)) {
			System.out.println("Found " + searchItem + " in our grocery list");
		} else {
			System.out.println(searchItem + " is not in the grocery list");
		}
	}
	
	public static void processArrayList() {
		ArrayList<String> newArray = new ArrayList<String>();
		newArray.addAll(groceryList.getGroceryList());
		
		ArrayList<String> nextArray = new ArrayList<String>(groceryList.getGroceryList());
		
		String[] myArray = new String[groceryList.getGroceryList().size()];
		myArray = groceryList.getGroceryList().toArray(myArray);
		
	}
}
