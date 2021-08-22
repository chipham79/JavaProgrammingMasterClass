package DiscountSystem;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Visit {
	private Customer name;
	private Date date;
	private double serviceExpense;
	private double productExpense;
	
	public Visit( Customer name, Date date) {
		this.name = name;
		this.date = date;
	}
	
	public String getName( ) {
		return name.getName();
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
		return ( serviceExpense - (serviceExpense * DiscountRate.getSeriveDiscountRate(name.getMemberType())))
				+ (productExpense - (productExpense * DiscountRate.getProductDiscountRate(name.getMemberType())));
	}
	
	
	
	public String toString() {
		DateFormat df = new SimpleDateFormat("MM-dd-yyyy");
		return "Customer name = " + name.getName() + 
				" , date " + df.format(this.date) +
				" , customer member = " + name.isMember() +
				" , customer type = " + name.getMemberType() +
				" , service expense = " + this.serviceExpense +
				" , product expense = " + this.productExpense;
	}
	
	
	
	
	
	
	
	
	
	
	
}
