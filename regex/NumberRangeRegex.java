package regex;

public class NumberRangeRegex {
	/* 
	 * Create a RegEx pattern to represent following number ranges
	 * 0-99 => "[0-9][0-9]?"
	 * 0-1000 => "[0-9][0-9]?[0-9]?|1000"
	 * 99-9999 => "99|[1-9][0-9][0-9][0-9]?"
	 * 25-75 => "2[5-9]|[3-6][0-9]|7[0-5]"
	 * 220-240
	 * */
	public static void main(String[] args) {
		String pattern = "2[2-3][0-9]|240";
		String str = "";
		
		System.out.println(str.matches(pattern));
	}
}
