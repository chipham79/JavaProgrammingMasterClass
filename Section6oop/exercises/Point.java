package Section6oop.exercises;

public class Point {
	private int x;
	private int y;
	
	public Point( ) {
		this(0, 0);
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public double distance( ) {
		Point point = new Point();
		double val = Math.pow( (this.x - point.x), 2) + Math.pow(this.y - point.y, 2);
		return Math.sqrt(val);
	}
	
	public double distance(int x, int y) {
		Point point = new Point(x, y);
		double val = Math.pow(this.x - point.x, 2) + Math.pow(this.y - point.y, 2);
		return Math.sqrt(val);
	}
	
	public double distance( Point point) {
		double val = Math.pow(this.x - point.x, 2) + Math.pow(this.y - point.y, 2);
		return Math.sqrt(val);
	}
	
	public static void main(String[] args) {
		Point first = new Point(6, 5);
		Point second = new Point(3, 1);
		
		System.out.println("distance(0,0) = " + first.distance());
		System.out.println("distance(second) = " + first.distance(second));
		System.out.println("distance(point) = " + first.distance(2,2));
		
		Point point = new Point();
		System.out.println("distance()= " + point.distance());
		
	}
}
