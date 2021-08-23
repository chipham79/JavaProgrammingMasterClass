package circle;

public class TestCricle {
	public static void main(String[] args) {
		Circle c = new Circle(5, "Black");
		Circle c1 = new Circle();
		
		System.out.println(c.getRadius());
		System.out.println(c.getArea());
		System.out.println(c.getColor());
		System.out.println(c1.getColor());
		
		c1.setColor("Pink");
		c1.setRadius(4);
		
		System.out.println(c1.getColor());
		System.out.println(c1.getRadius());
		System.out.println(c1.getArea());
		
		System.out.println(c1.toString());
	}
}
