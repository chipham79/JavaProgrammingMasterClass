package discountsystem;

public class Customer {
	private String name;
	private boolean member;
	private String memberType; 
	
	public Customer(String name, boolean member, String memberType) {
		this.name = name;
		this.member = member;
		this.memberType = memberType;
		
	}
	
	public boolean isMember() {
		return this.member;
	}
		
	public String getName() {
		return this.name; 
	}
	
	public String getMemberType() {
		return this.memberType;
	}
	
	public void setMember( boolean member) {
		this.member = member;
		
	}
	
	public void setMemberType(String type) {
		this.memberType = type;
	}
	
	public String toString( ) {
		return "Customer is " + this.name + 
				", member type is " + this.memberType;
		
	}
	
	
	
}
