
public class LeapYear {
	public static void main(String[] args) {
		System.out.println(isLeapYear(-1600));
		System.out.println(isLeapYear(1600));
		System.out.println(isLeapYear(2017));
		System.out.println(isLeapYear(2000));
		System.out.println(isLeapYear(1800));
		System.out.println(isLeapYear(1924));
	}
	
	public static boolean isLeapYear(int year) {
		/* boolean status = false;
		if ( (year >= 1 && year <= 9999)) {
			if ( (year % 4) == 0) {
				if ( (year % 100) == 0) {
					if ( (year % 400) == 0) {
						status =  true;
					}
					else {
						status = false;
					}
				}
				else {
					status = true;
				}
			}
			else {
				status = false;
			}
		}
		return status;  */
		
		if (year < 1 || year > 9999){ 
            return false;
        }
 
        int divFour = (year % 4);
        int divOneHun = (year % 100);
        int divFourHun = (year % 400);
 
 
        return (divFour == 0 && divOneHun != 0 ) || (divFourHun == 0)  ? true : false;
        
        
		/*
		 * if((year >= 1) && (year <= 9999)) { if(year%4 == 0) { if(((year%100 == 0) &&
		 * (year%400 == 0)) || (year%100 != 0)) { return true; } } } return false;
		 */
    }
	
}
