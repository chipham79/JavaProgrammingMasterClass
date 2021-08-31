package array_list_autoboxing_unboxing.array;

import java.util.Arrays;

public class ReverseArray {
	public static void main(String[] args) {
		int[] array = {1, 5, 3, 7, 9, 11, 15};
		System.out.println("Array = " + Arrays.toString(array));
		
		reverse(array);
		System.out.println("Reverse Array = " + Arrays.toString(array));
		
		otherMethodReverse(array);
	}
	
	
	
	private static void reverse(int[] array) {
		int lastElement = (array.length - 1);
		int halfLength = (array.length / 2);
		
		for(int i = 0; i < halfLength; i++) {
			int temp = array[i];
			array[i] = array[lastElement - i];
			array[lastElement - i] = temp;
		}
	}
	
	private static void otherMethodReverse(int[] array) {
        System.out.println("Array = " + Arrays.toString(array));
		int lastElement = (array.length - 1);
		int[] reverseArray = new int[array.length];
		for(int i = 0; i < array.length; i++) {
			reverseArray[i] = array[lastElement - i];
		}
		System.out.println("Reversed array = " + Arrays.toString(reverseArray));
	}
}
