package circle;

public class Cylinder extends Circle{
	private double height;
	// Constructor with default color, radius and height
	public Cylinder() {
		super();
		height = 1.0;
	}
	
	//Constructor with default radius, color but give height
	public Cylinder(double h) {
		super();
		this.height = h;
	}
	
	//Constructor with default color but give radius, height
	public Cylinder(double radius, double h) {
		super(radius); // call superclass constructor Circle(r)
		this.height = h;
	}
	
	public double getHeight( ) {
		return this.height;
	}
	
/*	public double getVolume( ) {
		return getArea() * height;
	}*/
	
	@Override
	public double getArea() {
		return Math.PI * this.getRadius() * this.getRadius() * height;
	}
	
}
