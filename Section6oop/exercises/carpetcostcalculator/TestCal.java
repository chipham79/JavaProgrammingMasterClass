package Section6oop.exercises.carpetcostcalculator;

public class TestCal {
	public static void main(String[] args) {
		Carpet carpet = new Carpet(3.5);
		Floor floor = new Floor(2.75, 4.0);
		Calculator cal = new Calculator(floor, carpet);
		
		System.out.println("total = " + cal.getTotalCost());
		
		carpet = new Carpet(1.5);
		floor = new Floor(5.4, 4.5);
		cal = new Calculator(floor, carpet);
		
		System.out.println("Total = " + cal.getTotalCost());
	}
}
