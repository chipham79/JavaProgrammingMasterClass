package array_list_autoboxing_unboxing.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ChallengeSortArray {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		Integer[] myIntergers = getIntergers(5);
		Integer[] sorted = sortIntegers(myIntergers);
		printArray(sorted);
		
		Integer[] sorted1 = sortIntegers(sorted, sorted.length );
		printArray(sorted1);
	}

	public static Integer[] getIntergers(int capacity) {
		Integer[] array = new Integer[capacity];
		System.out.println("Enter " + capacity + " intergers value:\r");
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}

		return array;
	}

	public static void printArray(Integer[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println("Element " + i + " content " + array[i]);
		}

	}
	
	public static Integer[] sortIntegers(Integer[] array, int number) {
		// Sorting int Array in descending order
		Integer[] intArray = getIntergers(number);
		Arrays.sort(intArray, Collections.reverseOrder());
	    return intArray;
	}

	public static Integer[] sortIntegers(Integer[] myIntergers) {
		/*
		 * int[] sortedArray = new int[array.length];
		 * 
		 * for(int i=0; i < array.length; i++) { sortedArray[i] = array[i]; }
		 */
		Integer[] sortedArray = Arrays.copyOf(myIntergers, myIntergers.length);
		

		 boolean flag = true; int temp; 
		 while(flag) { 
			 flag = false; 
			 for(int i=0; i < sortedArray.length - 1; i++) { 
				 if(sortedArray[i] < sortedArray[i+1]) { 
					 temp = sortedArray[i]; 
					 sortedArray[i] = sortedArray[i+1]; 
					 sortedArray[i+1] = temp;
					 flag = true; 
					 } 
				 } 
			 }
		
		return sortedArray;
	}
}
