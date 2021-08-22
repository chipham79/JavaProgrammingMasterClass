
public class NumberToWords {
	public static void main(String[] args) {
		System.out.println(getDigitCount(0));
		System.out.println(getDigitCount(123));
		System.out.println(getDigitCount(-12));
		System.out.println(getDigitCount(5200));
		
		System.out.println("------------");
		
		System.out.println(reverse(-121));
		System.out.println(reverse(1212));
		System.out.println(reverse(1234));
		System.out.println(reverse(100));
		
		System.out.println("------------");
		
		numberToWords(123);
		numberToWords(-12);
	}
	
	public static void numberToWords( int number) {
		if ( number < 0) {
			System.out.println("Invalid value");
		}
		while ( number != 0) {
			int digit = number % 10;
			
			switch (digit) {
			case 0: {
				System.out.println("Zero");
				break;
				}
			case 1: {
				System.out.println("One");
				break;
				}
			case 2: {
				System.out.println("Two");
				break;
				}
			case 3: {
				System.out.println("Three");
				break;
				}
			case 4: {
				System.out.println("Four");
				break;
				}
			case 5: {
				System.out.println("Five");
				break;
				}
			case 6: {
				System.out.println("Six");
				break;
				}
			case 7: {
				System.out.println("Seven");
				break;
				}
			case 8: {
				System.out.println("Eight");
				break;
				}
			case 9: {
				System.out.println("Night");
				break;
				}
			}
			number /= 10;
			
		}
		
		
		System.out.println(reverse(number));
		

		
		
}
	public static int reverse(int number) {
		int reverse = 0;
		int lastDigit = 0;
		while ( number != 0) {
			lastDigit = number % 10;
			// Increase place value of reverse by one
			reverse = (reverse * 10) + lastDigit;
						
			// Remove the last digit of the number
			number = number / 10;	
		}
		return reverse;
	}
	
	public static int getDigitCount( int number) {
		if ( number < 0) {
			return -1;
		}
		if (number == 0) {
			return 1;
		}

		int count = 0;
		while (number > 0) {
			number /= 10; 
			count++;

		}
		return count;
	}
}
