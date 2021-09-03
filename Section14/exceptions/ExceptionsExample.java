package Section14.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionsExample {
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		/*
		 * int x = 100; int y = 0; 
		 * System.out.println(divideLBYL(x, y));
		 * System.out.println(divdeByZero(x, y));
		 */
		int a = getIntEAFP();
		System.out.println("x is " + a);
		
	}
	
	private static int getInt() {
		return scanner.nextInt();
	}
	
	private static int getIntLBYL() {
		boolean isValid = true;
		System.out.println("Pleas enter an integer: ");
		String input = scanner.next();
		for(int i = 0; i < input.length(); i++) {
			if(!Character.isDigit(input.charAt(i))) {
				isValid = false;
				break;
			}
		}
		if(isValid) {
			return Integer.parseInt(input);
		}
		return 0;
	}
	
	private static int getIntEAFP() {
		System.out.println("Pleas enter an integer: ");
		try {
			return scanner.nextInt();
		}
		catch (InputMismatchException e) {
			return 0;
		}
	}
	
	private static int divideLBYL(int x, int y) {
		if(y != 0) {
			return x /y;
		}
		else {
			return 0;
		}
	}
	
	private static int divdeByZero( int x , int y) {
		try {
			return x / y;
		} 
		catch (ArithmeticException e) {
			return 0;
		}
	}
}
