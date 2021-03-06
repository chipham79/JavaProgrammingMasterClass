package Section4;

public class GreatestCommonDivisor {
	public static void main(String[] args) {
		System.out.println(getGreatestCommonDivisor(25, 15));
		System.out.println(getGreatestCommonDivisor(12, 30));
		System.out.println(getGreatestCommonDivisor(9, 18));
		System.out.println(getGreatestCommonDivisor(81, 153));
		System.out.println(getGreatestCommonDivisor(1010, 10));
	}
	
	public static int getGreatestCommonDivisor( int first, int second) {
		if ( (first < 10) || (second < 10) ) {
			return -1;
		}
		while (second != 0) {
			if ( first > second) {
				first = first - second;
			} 
			else {
			second = second - first; 
			}
		}
		return first;
		
	}
}
