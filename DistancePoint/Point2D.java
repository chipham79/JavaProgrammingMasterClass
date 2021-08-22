package DistancePoint;

public class Point2D extends Point {

	public Point2D(int x, int y) {
		super(x, y);
	}

			
	@Override
	public double calculateDistancePoint(Point d) {
		double val = Math.pow((this.x - d.x), 2) + Math.pow((this.y - d.y), 2);
		return Math.sqrt(val);
	}

	
}
	


