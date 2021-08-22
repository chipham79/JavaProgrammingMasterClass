
public class DecimalComparator {
	public static void main(String[] args) {
		System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
		System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
		System.out.println(areEqualByThreeDecimalPlaces(-3.175, 3.175));
	}
	
	public static boolean areEqualByThreeDecimalPlaces(double a, double b ) {
		
		int num1 = (int) (a * 1000);
		int num2 = (int) (b * 1000);
		
		if (num1 == num2) {
			return true;
		}
		return false;
	}
}
