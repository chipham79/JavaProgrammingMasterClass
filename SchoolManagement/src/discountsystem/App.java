package discountsystem;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class App {
	public static void main(String[] args) {
		Customer customer1 = new Customer("Suzi", true, "Premium");
		
		
		System.out.println(customer1.getName());
		System.out.println(customer1.getMemberType());
		System.out.println(customer1.isMember());
		
		/*
		 * DateFormat df = new SimpleDateFormat("MM-dd-yyyy"); Date d1 = null; try { d1
		 * = df.parse("08-20-2021"); } catch (ParseException e) { // TODO Auto-generated
		 * catch block e.printStackTrace(); }
		 */
		Visit visit1 = new Visit(customer1, new Date() );
		
	
		
		visit1.setProductExpense(100);
		visit1.setServiceExpense(150);		
		
		System.out.println(visit1.toString());
		System.out.println("Total expense is " + visit1.getTotalExpense());
		
	}
}
