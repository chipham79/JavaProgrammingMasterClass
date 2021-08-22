package DiscountSystem;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Visit {
	private Customer customer;
	private Date date;
	private double serviceExpense;
	private double productExpense;
	
	public Visit( Customer customer, Date date) {
		this.customer = customer;
		this.date = date;
	}
	
	public String getName( ) {
		return customer.getName();
	}
	
	public double getServiceExpense() {
		return this.serviceExpense;
	}
	
	public void setServiceExpense(double serviceExpense) {
		this.serviceExpense = this.serviceExpense + serviceExpense;
	}
	
	public double getProductExpense() {
		return this.productExpense;
	}
	
	public void setProductExpense(double productExpense) {
		this.productExpense = this.productExpense + productExpense;
	}
	
	public double getTotalExpense() {
		return ( serviceExpense - (serviceExpense * DiscountRate.getSeriveDiscountRate(customer.getMemberType())))
				+ (productExpense - (productExpense * DiscountRate.getProductDiscountRate(customer.getMemberType())));
	}
	
	
	
	public String toString() {
		DateFormat df = new SimpleDateFormat("MM-dd-yyyy");
		return "Customer name = " + customer.getName() + 
				" , date " + df.format(this.date) +
				" , customer member = " + customer.isMember() +
				" , customer type = " + customer.getMemberType() +
				" , service expense = " + this.serviceExpense +
				" , product expense = " + this.productExpense;
	}
	
	
	
	
	
	
	
	
	
	
	
}
