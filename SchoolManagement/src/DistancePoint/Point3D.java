package DistancePoint;

public class Point3D extends Point{
	public int z;
	
	public Point3D( int x, int y, int z) {	
		super(x, y);
		this.z = z;
	}
	
	@Override
	public double calculateDistancePoint(Point d) {

		double val = Math.pow((this.x - d.x), 2) + Math.pow((this.y - d.y), 2) + Math.pow((this.z - d.z), 2);
		
		return Math.sqrt(val);
	}
	
}
