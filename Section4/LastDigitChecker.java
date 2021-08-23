package Section4;

public class LastDigitChecker {
	public static void main(String[] args) {
		System.out.println(hasSameLastDigit(41, 22, 71));
		System.out.println(hasSameLastDigit(23, 32, 42));
		System.out.println(hasSameLastDigit(9, 99, 999));
	}
	
	public static boolean hasSameLastDigit(int num1, int num2, int num3) {
		if ( isValid(num1)  && isValid(num2) && isValid(num3) ) {
			int lastDigitNum1 = num1 % 10;
			int lastDigitNum2 = num2 % 10;
			int lastDigitNum3 = num3 % 10;
			
			if ( (lastDigitNum1 == lastDigitNum2) || (lastDigitNum1 == lastDigitNum3) || (lastDigitNum2 == lastDigitNum3)  ) {
				return true;
			}
		}
		
		return false;
	}
	
	public static boolean isValid(int number) {
		if ( (number >= 10) && (number <= 1000) ) {
			return true;
		}
		return false;
	}
}
