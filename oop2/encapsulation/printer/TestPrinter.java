package oop2.encapsulation.printer;

public class TestPrinter {
	public static void main(String[] args) {
		Printer printer = new Printer(50, true);
		System.out.println("Initial page count = " + printer.getPagesPrinted());
		
		int pagesPrinted = printer.printPages(7);
		System.out.println("Pages was printed " + pagesPrinted + " new total print count for printer " + printer.getPagesPrinted() );
		pagesPrinted = printer.printPages(2);
		System.out.println("Pages was printed " + pagesPrinted + " new total print count for printer " + printer.getPagesPrinted() );
	}
}
