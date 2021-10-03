package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Practice2 {
	/* 
	 * Create a RegEx pattern to extract all prices from a string
	 * */
	public static void main(String[] args) {
		String str = "Your total cost is $100.25 after $0.99 sake discount and $12.09 coupon1 discount and $0.00 coupon2 discount";
		String pattern = "[\\$](\\d+\\.\\d{1,2})";
		
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(str);
		
		while(m.find()) {
			System.out.println(m.group());
		}
	}
}
