package DistancePoint;

public class App {
	public static void main(String[] args) {
		Point2D p1 = new Point2D(5, 10);
		Point2D p2 = new Point2D(3, 2);
		
		System.out.println("Khoang cach giua 2 diem tren mat phang OXY " + p1.calculateDistancePoint(p2));
		
		Point3D p3 = new Point3D(1, 2, 3);
		Point3D p4 = new Point3D(4, 5, 6);
		
		System.out.println("Khoang cach giua 3 diem tren mat phang OXYZ " + p3.calculateDistancePoint(p4));
		

		
		
	}
}	
