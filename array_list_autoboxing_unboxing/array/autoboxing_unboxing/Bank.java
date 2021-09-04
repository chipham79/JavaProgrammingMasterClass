package array_list_autoboxing_unboxing.array.autoboxing_unboxing;

import java.util.ArrayList;

public class Bank {
	private String name;
	private static ArrayList<Branch> branches;
	
	public Bank(String name) {
		this.name = name;
		this.branches = new ArrayList<Branch>();
	}
	
	public boolean addBranch(String branchName) {
		if(findBranch(branchName) == null) {
			this.branches.add(new Branch(branchName));
			return true;
		}
		return false;
	}
	
	public boolean addCustomer(String branchName, String customerName, double initialAmount) {
		Branch branch = findBranch(branchName);
		if(branch != null) {
			return branch.newCustomer(customerName, initialAmount);
		}
		
		return false;
	}
	
	public boolean addCustomerTransaction(String branchName, String customerName, double amount) {
		Branch branch = findBranch(branchName);
		if(branch != null) {
			return branch.addCustomerTransaction(customerName, amount);
		}
		
		return false;
	}
	
	private Branch findBranch(String branchName) {
		for( Branch branch : branches) {
			if(branch.getName().equals(branchName)) {
				return branch;
			}
		}
		return null;
	}
	
	public boolean listCustomer(String branchName, boolean showTransactions) {
		Branch branch = findBranch(branchName);
		if(branch != null) {
			System.out.println("Customers for branch " + branch.getName());
			
			ArrayList<Customer> branchCustomers = branch.getCustomers();
			for(Customer branchCustomer : branchCustomers) {
				System.out.println("Customer: " + branchCustomer.getName() + "[" + ( branchCustomers.indexOf(branchCustomer) + 1 )  + "]" );
				if(showTransactions) {
					ArrayList<Double> transactions = branchCustomer.getTransactions();
					for(Double transaction : transactions) {
						System.out.println("[" + transactions.indexOf(transaction) + "]" + "Amount " + transaction);
					}
					
				}
			}
			return true;
		} 
		else {
			return false;
		}
	}

	public String getName() {
		return name;
	}
	
	
	
	
}
