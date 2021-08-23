package DiscountSystem;

public class DiscountRate {
	private static double serviceDiscountPremium = 0.2;
	private static double serviceDiscountGold = 0.15;
	private static double serviceDiscountSilver = 0.1;
	
	private static double productDiscountPremium = 0.1;
	private static double productDiscountGold = 0.1;
	private static double productDiscountSilver = 0.1;
	
	public static double getSeriveDiscountRate( String type) {
		if ( type == "Premium") {
			return serviceDiscountPremium;
		} 
		else if ( type == "Gold"){
			return serviceDiscountGold;	
		}
		else if ( type == "Silver"){
			return serviceDiscountSilver;	
		}
		else {
			throw new IllegalArgumentException("Wrong service type specified");
		}
		// Able to use switch case
				
	}
	
	public static double getProductDiscountRate( String type) {
		if ( type == "Premium") {
			return productDiscountPremium;
		} 
		else if ( type == "Gold"){
			return productDiscountGold;	
		}
		else if ( type == "Silver"){
			return productDiscountSilver;	
		}
		else {
			throw new IllegalArgumentException("Wrong service type specified");
		}
				
	}
	
	
	
}