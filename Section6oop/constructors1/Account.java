package Section6oop.constructors1;

public class Account {
	private String number;
	private double balance;
	private String customerName;
	private String customerEmail;
	private String customerPhoneNumber;
	
	public Account() {
		this("56789", 2.0, "Default Name", "Default Email", "Default Phone");
		System.out.println("Empty constructor called");
	}
	
	public Account(String number, double balance, String customerName, String customerEmail, String customerPhoneNumber) {
		System.out.println("Account contructor called");
		this.number = number;
		this.balance = balance;
		this.customerName = customerName;
		this.customerEmail = customerEmail;
		this.customerPhoneNumber = customerPhoneNumber;
	}
	
	
	public Account(String customerName, String customerEmail, String customerPhoneNumber) {
		this("7777", 100.25, customerName, customerEmail, customerPhoneNumber );

	}

	public void deposit(double depositAmount) {
		this.balance += depositAmount;
	}
	
	public void withdrawal( double withdrawalAmount) {
		if (balance - withdrawalAmount < 0) {
			System.out.println(String.format("Only %s avaiable. Withdrawal not processed", this.balance));
		} 
		else {
			this.balance -= withdrawalAmount;
			System.out.println(String.format("Withdrawal of %s processed. Remaing balance = %s", withdrawalAmount, this.balance));
		}
	}
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public String getCustomerPhoneNumber() {
		return customerPhoneNumber;
	}
	public void setCustomerPhoneNumber(String customerPhoneNumber) {
		this.customerPhoneNumber = customerPhoneNumber;
	}
	
	
}
