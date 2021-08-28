package oop2.composition;

public class Motherboard {
	private String model;
	private String manufactured;
	private int ramSlots;
	private int cardSlots;
	private String bios;
	public Motherboard(String model, String manufactured, int ramSlots, int cardSlots, String bios) {
		super();
		this.model = model;
		this.manufactured = manufactured;
		this.ramSlots = ramSlots;
		this.cardSlots = cardSlots;
		this.bios = bios;
	}
	
	public void loadProgram(String programName) {
		System.out.println("Program " + programName + " is now loading...");
	}
	
	public String getModel() {
		return model;
	}
	public String getManufactured() {
		return manufactured;
	}
	public int getRamSlots() {
		return ramSlots;
	}
	public int getCardSlots() {
		return cardSlots;
	}
	public String getBios() {
		return bios;
	}
	
	

}
