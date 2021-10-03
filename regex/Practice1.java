package regex;

public class Practice1 {
	/*
	 * Create a RegEx pattern to represent following websites
	 * www.dezlearn.com
	 * www.dezlearn.us
	 * www.dez.com
	 * www.dez.us
	 * */
	
	public static void main(String[] args) {
		String pattern = "www\\.(dezlearn|dez)\\.(com|us)";
		String str = "www.dezlearn.us";
		
		System.out.println(str.matches(pattern));
	}
}
