package oop2.composition;

public class MainTest {
	public static void main(String[] args) {
		Dimemsions dimemsions = new Dimemsions(20, 20, 5);
		Case theCase = new Case("22B", "Dell", "240", dimemsions);
		
		Monitor theMoniter = new Monitor("27 inch", "Acer", 27, new Resolution(2540, 1440));
		
		Motherboard theMotherboard = new Motherboard("BJ-200", "Aus", 4, 6, "v2.5");
		
		PC thePC = new PC(theCase, theMoniter, theMotherboard);
		thePC.powerUp();
	}
}
