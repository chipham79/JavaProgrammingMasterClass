package array_list_autoboxing_unboxing.array.autoboxing_unboxing;

public class MainTest {
	public static void main(String[] args) {
		Bank bank = new Bank("ABC Banking");
		
		if(bank.addBranch("Branch1")) {
			System.out.println("Branch1 branch already created");
		}
		
		bank.addBranch("Branch1");
		bank.addCustomer("Branch1", "Tim", 50.05);
		bank.addCustomer("Branch1", "Mike", 170.05);
		bank.addCustomer("Branch1", "John", 250.45);
		
		bank.addBranch("BranchTest2");
		bank.addCustomer("BranchTest2", "Bob", 1105.45);
		
		bank.addCustomerTransaction("Branch1", "Tim", 40.05);
		bank.addCustomerTransaction("Branch1", "Tim", 12.50);
		bank.addCustomerTransaction("Branch1", "John", 1.45);

			
		bank.listCustomer("Branch1", true);
		bank.listCustomer("BranchTest2", true);
		
		bank.addBranch("BranchTest3");
		
		if(!bank.addCustomer("BranchTest3", "Brian", 5.00)) {
			System.out.println("Error BranchTest3 branch does not exists"); // Check the findBank is working as expected
		}
		
		if(!bank.addBranch("Branch1")) {
			System.out.println("Branch1 branch already exists"); 
		}
		
		if(!bank.addCustomerTransaction("Branch1", "Alice", 52.00)) {
			System.out.println("Customer does not exist at branch"); // Check addCustomerTransaction->findCustomer return
			
		}
		
		if(!bank.addCustomer("Branch1", "Tim", 50.05)) {
			System.out.println("Customer Tim already exists"); //Check newCustomer->findCustomer return
		}
		
	}
	
}
