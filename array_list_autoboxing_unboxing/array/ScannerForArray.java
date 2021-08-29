package array_list_autoboxing_unboxing.array;

import java.util.Scanner;

public class ScannerForArray {
	
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		int[] myIntergers = getIntergers(5);
		for(int i=0; i < myIntergers.length; i++) {
			System.out.println("Element " + i + " , value was " + myIntergers[i]);
		}
		
		System.out.println("The average is " + getAverage(myIntergers));
	}
	
	public static int[] getIntergers(int number) {
		System.out.println("Enter " + number + " interger values. \r");
		int[] values = new int[number];
		
		for(int i=0 ; i < values.length; i++) {
			values[i] = scanner.nextInt();
		}
		
		return values;
	}
	
	public static double getAverage(int[] array) {
		int sum = 0;
		for(int i =0; i < array.length; i++) {
			sum += array[i];
		}
		
		return (double) ( sum / array.length);
	}
}
