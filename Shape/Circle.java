package Shape;

import java.util.Scanner;

public class Circle extends Shape {
	double duongKinh;
	double banKinh;
	
	public Circle(double banKinh) {
		this.banKinh = banKinh;
		this.duongKinh = banKinh * 2 ;
	}
	
	@Override
	public double calCircum() {
		return ( this.duongKinh * Math.PI);
	}

	@Override
	public double calArea() {
		return (  this.banKinh *  this.banKinh * Math.PI );
	}
	
	public double getDuongKinh() {
		return this.duongKinh;
	}
	
	public double getBanKinh() {
		return this.banKinh;
	}
	
	public double setDuongKinh() {
		return this.duongKinh;
	}
	
	public double setBanKinh() {
		return this.banKinh;
	}
	
	public void inputDuongKinh() {
		System.out.println("Nhap duong kinh");
		
		Scanner scanner = new Scanner(System.in);
		
		duongKinh = scanner.nextDouble();
	}
		
	public void inputBanKinh() {
		System.out.println("Nhap Ban kinh");
		
		Scanner scanner = new Scanner(System.in);
		
		banKinh = scanner.nextDouble();
	
		
	}
	
	
}
