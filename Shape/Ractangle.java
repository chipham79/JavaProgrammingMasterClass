package Shape;

import java.util.Scanner;

public class Ractangle extends Shape {
	double chieuDai;
	double chieuRong;
	
	public Ractangle(double chieuDai, double chieuRong) {
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
	}
	
	@Override
	public double calCircum() {
		return ( (this.chieuDai + this.chieuRong) * 2);
	}

	@Override
	public double calArea() {
		return ( this.chieuDai * this.chieuRong );
	}
	
	public void inputInfo() {
		System.out.println("Nhap chieu dai");
		
		Scanner scanner = new Scanner(System.in);
		
		chieuDai = scanner.nextDouble();
		
		System.out.println("Nhap chieu rong");
		
		chieuRong = scanner.nextDouble();
		
	}
	
}
