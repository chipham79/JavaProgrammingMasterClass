package array_list_autoboxing_unboxing.array;

import java.util.Scanner;

public class MinimumElement {
	private static Scanner scanner = new Scanner(System.in);
	
	private static int[] readElements(int count) {
		int[] array = new int[count];
		for(int i = 0; i < array.length; i++) {
			System.out.println("Enter the number in array: ");
			array[i] = scanner.nextInt();
			scanner.nextLine();
		}
		return array;
	}
	
	private static int findMin(int[] array) {
		int minInterger = array[0];
		for(int i = 0; i < array.length; i++) {
			minInterger = Math.min(minInterger, array[i]);
		}
/*		int min=Integer.MAX_VALUE;
        for(int i=0; i<array.length; i++){
            int value = array[i];
            if(value < min){
                min = value;*/
		
		return minInterger;
	}
	
	private static int readInteger() {
		System.out.println("Enter count: ");
		int count = scanner.nextInt();
		return count;
	}
	
	public static void main(String[] args) {
		int count = readInteger();
		
		int[] array = readElements(count);
		System.out.println("Min = " + findMin(array));
	}
}
