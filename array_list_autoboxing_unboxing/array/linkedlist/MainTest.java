package array_list_autoboxing_unboxing.array.linkedlist;

import java.util.ArrayList;

public class MainTest {
	public static void main(String[] args) {
		Customer customer = new Customer("Tim", 100.00);
		Customer anotherCustomer = customer;
		anotherCustomer.setBalance(12.18);
		System.out.println("Balance for customer " + customer.getName() + " is " + customer.getBalance());
		
		ArrayList<Integer> intList = new ArrayList<Integer>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		
		for(Integer num : intList) {
			System.out.println(intList.indexOf(num) + ": " + num);
		}
		
		intList.add(1, 2);
		
		System.out.println("-------------");
		
		for(Integer num : intList) {
			System.out.println(intList.indexOf(num) + ": " + num);
		}
	}
}
