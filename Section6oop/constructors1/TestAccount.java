package Section6oop.constructors1;

public class TestAccount {
	public static void main(String[] args) {
		Account bobAccount = new Account("9999999999", 10.00, "Bob Brown", "bob@gmail.com", "(888)-888-8888");
		
		System.out.println(bobAccount.getBalance());
		
		bobAccount.setNumber("9999999999");
		bobAccount.setBalance(0.00);
		bobAccount.setCustomerName("Bob Brown");
		bobAccount.setCustomerEmail("bob@gmail.com");
		bobAccount.setCustomerPhoneNumber("(888)-888-8888");
		
		bobAccount.withdrawal(100.0);
		
		bobAccount.deposit(50.0);
		bobAccount.withdrawal(100.0);
		
		bobAccount.deposit(51.0);
		bobAccount.withdrawal(100.0);
		
		Account chiAccount = new Account("Chi", "chipham@gmail.com", "8888888888");
		
		System.out.println(chiAccount.getCustomerName());
		
		
		VipPerson person1 = new VipPerson();
		System.out.println(person1.getName());
		
		VipPerson person2 = new VipPerson("Bob", 25000.00);
		System.out.println(person2.getName());
		
		VipPerson person3 = new VipPerson("Chi", 10000.00, "chi.pham@gmail.com");
		System.out.println(person3.getName());
		System.out.println(person3.getEmailAddress());
	}
}
