package Section14.stacktrace;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Example {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		try {
			int result = divide();
			System.out.println(result);
		} catch ( ArithmeticException | NoSuchElementException e) {
			System.out.println(e.toString());
			System.out.println("Unable to perform division, autopilot shutting down..");
		}
	}
	
	private static int divide() { 
		int x, y;
		try {
			x = getInt();
			y = getInt();
			
			System.out.println("x is " + x + ", y is " + y);
			return x/y;
		} 
		catch (NoSuchElementException e){
			throw new NoSuchElementException("No suitable input");
		}
		
		catch (ArithmeticException e) {
			throw new ArithmeticException("Attpemt to divide by zero");
		}		
		
	}
	
	private static int getInt() {
		System.out.println("Please enter an integer: ");
		while(true) {
			try {
				return scanner.nextInt();
			} catch (InputMismatchException e) {
				// go round again. Read past the end of the line in the input first
				scanner.nextLine();
				System.out.println("Please enter a number using only the digits 0 to 9");
			}
		}
		
	}
}
