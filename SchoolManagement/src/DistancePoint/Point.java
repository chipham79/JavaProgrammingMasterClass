package DistancePoint;

public abstract class Point {
	public int x;
	public int y;
	public int z;
	
	
	public Point() {
		
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	
	public int getX( ) {
		return this.x;
	}
	
	public int getY( ) {
		return this.y;
	}
	
	public int setX( int x ) {
		return this.x;
	}
	
	public int setY( int y ) {
		return this.y;
	}
	
	public abstract double calculateDistancePoint(Point d);
}
