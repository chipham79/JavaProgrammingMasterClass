
public class NumberPalindrome {
	public static void main(String[] args) {
		System.out.println("Test");
		System.out.println(isPalindrome(-1221));
		System.out.println(isPalindrome(707));
		System.out.println(isPalindrome(11212));
		System.out.println(-1221/10);
	}
	
	private static boolean isPalindrome(int number) {
		
		int reverse = 0;
		int temp = number;
		int lastDigit = 0;
		// run loop until num becomes 0
		while ( number != 0) {
			
			// get last digit from num
			lastDigit = number % 10;
			
			// Increase place value of reverse by one
			reverse = (reverse * 10) + lastDigit;
			
			// Remove the last digit of the number
			number = number / 10;	
			
		}

		return (temp == reverse);
		
	}
}
