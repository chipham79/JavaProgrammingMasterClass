
public class BarkingDog {
	public static void main(String[] args) {
		System.out.println(shouldWakeUp(true, 1));
		System.out.println(shouldWakeUp(false, 2));
		System.out.println(shouldWakeUp(true, 8));
		System.out.println(shouldWakeUp(true, -1));
		System.out.println(shouldWakeUp(true, 22));
	}
	
	
	public static boolean shouldWakeUp( boolean isBraking, int hourOfDay) {
		
		if ( !isBraking ) {
			isBraking = false;
		}
		else if ( (hourOfDay < 0) || (hourOfDay > 23) ) {
			isBraking = false; 
		}
		else if ( (hourOfDay < 8) || (hourOfDay > 22) ) {
			isBraking = true;
		}
		else {
			isBraking = false;
		}
		
		
		return isBraking;
	}
}
