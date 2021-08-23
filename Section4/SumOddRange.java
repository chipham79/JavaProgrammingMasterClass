package Section4;

public class SumOddRange {
	public static void main(String[] args) {
		System.out.println(isOdd(-5));
		System.out.println(sumOdd(1, 100));
		System.out.println(sumOdd(-1, 100));
		System.out.println(sumOdd(100, 100));
		System.out.println(sumOdd(13, 13));
		System.out.println(sumOdd(100, -100));
		System.out.println(sumOdd(100, 1000));
	}
	
	public static boolean isOdd(int num) {
		if (num > 0) {
			if(num % 2 != 0) {
				return true;
			}
			return false;
		}
		return false;
	}
	public static int sumOdd(int start, int end) {
		int sum = 0;
		if ( (end < start) || ( end < 0) || ( start < 0) ) {
			return -1;
		}
		for(int i = start; i <= end; i++) {
			if(isOdd(i)) {
				sum += i;
			}
		}
		return sum;
	}
}
