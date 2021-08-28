package oop2.composition;

public class Case {
	private String model;
	private String manufacture;
	private String powerSupply;
	private Dimemsions dimemsions;
	
	public Case(String model, String manufacture, String powerSupply, Dimemsions dimemsions) {
		this.model = model;
		this.manufacture = manufacture;
		this.powerSupply = powerSupply;
		this.dimemsions = dimemsions;
	}
	
	public void pressPowerButton() {
		System.out.println("Power button pressed");
	}

	public String getModel() {
		return model;
	}

	public String getManufacture() {
		return manufacture;
	}

	public Dimemsions getDimensions() {
		return dimemsions;
	}

	public String getPowerSupply() {
		return powerSupply;
	}
	
	
}
