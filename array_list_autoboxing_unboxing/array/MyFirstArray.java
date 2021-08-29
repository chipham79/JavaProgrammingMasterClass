package array_list_autoboxing_unboxing.array;

public class MyFirstArray {
	public static void main(String[] args) {
		int[] myIntArray = new int[10]; // or {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
		// assign value myIntArray[5] = 40;
		
		for(int i = 0; i < myIntArray.length; i++) {
			myIntArray[i] = i*10;
		}
		printArray(myIntArray);

	}
	
	public static void printArray(int[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.println("Element " + i + " , value is " + array[i]);
		}
	}
}
