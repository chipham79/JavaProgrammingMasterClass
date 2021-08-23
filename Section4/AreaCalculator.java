package Section4;

public class AreaCalculator {
	public static final double PI = Math.PI;
	
	public static void main(String[] args) {
		System.out.println(area(8.5));
		System.out.println(area(-1));
		System.out.println(area(5.0, 4.0));
		System.out.println(area(-1.0, 4.0));
	}
	
	public static double area(double radius) {
		if ( radius < 0 ) {
			return -1;
		}
		
		double areaOfCircle =  radius * radius * PI;
		return areaOfCircle;
	}
	
	public static double area(double x, double y) {
		if ( (x < 0) || (y < 0) ) {
			return -1;
		}
		double areaOfrectangle =  x * y;
		return areaOfrectangle;
	}
	
}
