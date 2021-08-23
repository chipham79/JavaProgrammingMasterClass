package Section4;

public class EvenDigitSum {
	public static void main(String[] args) {
		System.out.println(getEvenDigitSum(123456789));
		System.out.println(getEvenDigitSum(252));
		System.out.println(getEvenDigitSum(-22));
		System.out.println(getEvenDigitSum(231));
	}
	public static int getEvenDigitSum(int number) {
		if (number < 0) {
			return -1;
		}
		int sum = 0;
		while (number != 0) {
			int lastDigit = number % 10;
			if (lastDigit % 2 == 0) {
				sum += lastDigit;
			}
			
			// drop the least-significant digit
			number /= 10; 
		}
		return sum;
	}
}
