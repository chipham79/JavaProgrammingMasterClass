
public class OverloadingMethod {
	   public static void main(String[] args) {
	    	calcFeetandInchesToCentimeters(6, 0);
	    	calcFeetandInchesToCentimeters(7, 5);
	    	double centimerter = calcFeetandInchesToCentimeters(-1, 5);
	    	if ( centimerter < 0.0) {
	    		System.out.println("Invalid Paramaters");
	    	}
	    	calcFeetandInchesToCentimeters(100);
	    }	
	    
	    public static int calculateScore(int score) {
	    	System.out.println("Unname player scored " + score + " poitn");
	    	return score * 1000;
	    }
	    public static int calculateScore(String playerName, int score) {
	    	System.out.println("Player " + playerName  + " scored " + score + " poitn");
	    	return score * 1000;
	    }
	    
	    public static double calcFeetandInchesToCentimeters(double feet, double inches) {
	    	if ( (feet < 0) || ( (inches < 0) && (inches > 12) ) ) {
	    		return -1;
	    	}
	    		
	    	double centimeters = feet * 30.48;
	    	centimeters += inches * 2.54;
	    	System.out.println(String.format("%s feet + %s inches = %s centimers", feet, inches, centimeters));
	    	return centimeters;
	    }
	    
	    public static double calcFeetandInchesToCentimeters(double inches) {
	    	if ( inches < 0) {
	    		return -1;
	    	}
	    	double feet = (int) inches / 12;
	    	double remainingInches = (int) inches % 12;
	    	System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches");
	    	return calcFeetandInchesToCentimeters(feet, inches);
	    }
}
