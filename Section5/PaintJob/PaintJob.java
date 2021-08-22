package Section5.PaintJob;

public class PaintJob {
	public static void main(String[] args) {
		System.out.println(getBucketCount(3.4, 2.1, 1.5, 2));
		System.out.println(getBucketCount(2.75, 3.25, 2.5, 1));
		
		
		System.out.println(getBucketCount(3.4, 2.1, 1.5));
		
		
		System.out.println(getBucketCount(3.26, 0.75));
	}
	public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets  ) {
		if ( (width <= 0) || (height <= 0) || (areaPerBucket <= 0) || (extraBuckets < 0) ) {
			return -1;
		}
		double areaWall = width * height;
		double numberOfBucket = Math.ceil((areaWall / areaPerBucket));
		int needBucket = (int) (numberOfBucket - extraBuckets);
		return needBucket;
	}
	
	public static int getBucketCount( double width, double height, double areaPerBucket ) {
		/*
		 * if ( (width <= 0) || (height <= 0) || (areaPerBucket <= 0) ) { return -1; }
		 * double areaWall = width * height; double numberOfBucket = Math.ceil((areaWall
		 * / areaPerBucket)); return (int) numberOfBucket;
		 */
		return getBucketCount(width, height, areaPerBucket, 0);
	}
	
	public static int getBucketCount( double area, double areaPerBucket ) {
		/*
		 * if ( ( area <= 0 ) || ( areaPerBucket <= 0 ) ) { return -1; } double
		 * numberOfBucket = Math.ceil((area / areaPerBucket)); return (int)
		 * numberOfBucket;
		 */
		return getBucketCount(area, 1, areaPerBucket, 0);
		
	}
}
