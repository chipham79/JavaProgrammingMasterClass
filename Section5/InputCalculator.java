package Section5;

import java.util.Scanner;

public class InputCalculator {
	public static void main(String[] args) {
		inputThenPrintSumAndAverage();
	}
    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        
        while(true){
        	System.out.println("Enter a number: ");
        	
        	boolean isAnInt = scanner.hasNextInt();
            if ( isAnInt) {
            	sum += scanner.nextInt();
                count++;
                // scanner.nextLine(); // not really needed because we don't need to print an alert for invalid number
            } 
            else {
            	break;
            }
        	
        }
        System.out.println("SUM = " + sum + " AVG = " + Math.round((double) sum/count));
        scanner.close();
    }
}

