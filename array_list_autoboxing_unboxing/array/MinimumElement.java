package array_list_autoboxing_unboxing.array;

import java.util.Scanner;

public class MinimumElement {
	private static Scanner scanner = new Scanner(System.in);
	
	public static int[] readIntergers(int count) {
		int[] array = new int[count];
		System.out.println("Enter the number in array: ");
		for(int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
			scanner.nextLine();
		}
		return array;
	}
	
	public static int findMin(int[] array) {
		// int min = Integer.MAX_INTERGERS
		int minInterger = array[0];
		for(int i = 0; i < array.length; i++) {
			minInterger = Math.min(minInterger, array[i]);
			// int value = array[i];
			// if(value < min) {
			//	min = value		
			//}
		}
		return minInterger;
	}
	
	public static void main(String[] args) {
		System.out.println("Enter count: ");
		int count = scanner.nextInt();
		
		int[] array = readIntergers(count);
		System.out.println("Min = " + findMin(array));
	}
}
