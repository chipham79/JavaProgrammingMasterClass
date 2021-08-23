package circle;

public class TestCylinder {
	public static void main(String[] args) {
		Cylinder c = new Cylinder();
		System.out.println("Radius " + c.getRadius());
		
		System.out.println("Color " + c.getColor());
		
		System.out.println("Height " + c.getHeight());
		
		System.out.println("Volum " + c.getArea());
		
		
		Cylinder c1 = new Cylinder(5);
		System.out.println("Radius " + c1.getRadius());
		
		System.out.println("Color " + c1.getColor());
		
		System.out.println("Height " + c1.getHeight());
		
		System.out.println("Volum " + c1.getArea());
		
		Cylinder c2 = new Cylinder(3, 5);
		c2.setColor("Black");
		
		System.out.println("Radius " + c2.getRadius());
		
		System.out.println("Color " + c2.getColor());
		
		System.out.println("Height " + c2.getHeight());
		
		System.out.println("Volum " + c2.getArea());
		
	}
}
