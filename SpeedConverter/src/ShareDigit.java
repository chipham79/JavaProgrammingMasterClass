
public class ShareDigit {
	public static void main(String[] args) {
		System.out.println(hasShareDigit(12, 23));
		System.out.println(hasShareDigit(9, 99));
		System.out.println(hasShareDigit(15, 55));
	}
	
	
	public static boolean hasShareDigit(int num1, int num2) {
		if (( (num1 >= 10) & (num1 <= 99) ) && ( (num2 >=10) && (num2 <=99) )) {
			for( int i = num1; i > 0; i /= 10) {
				for (int u = num2; u > 0; u /= 10) {
					if ( (i % 10) == ( u % 10)) {
						return true;
					}
				}
			}
		}
		
		return false;
	}
}
