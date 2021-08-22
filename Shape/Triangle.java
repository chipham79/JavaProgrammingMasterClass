package Practice;

import java.util.Scanner;

public class Triangle extends Shape {
	double canh1, canh2, canh3;
	double chieuCao;
	double canhHuyen;
	
	
	public Triangle(double canh1, double canh2, double canh3 , double chieuCao, double canhHuyen) {
		this.canh1 = canh1;
		this.canh2 = canh2;
		this.canh3 = canh3;
		this.chieuCao = chieuCao;
		this.canhHuyen = canhHuyen;
		
	}
	
	
	public static double calCircum(double canh1, double canh2, double canh3 ) {
		return ( canh1 + canh2 + canh3);
	}
	
	public static double calArea(double chieuCao, double canhHuyen) {
		return ( (chieuCao + canhHuyen) / 2 );
	}

	@Override
	public double calCircum() {
		
		return  ( this.canh1 + this.canh2 + this.canh3);
	}

	@Override
	public double calArea() {
		return ( (this.chieuCao + this.canhHuyen) / 2 );
	}
	
	public void inputInfo( ) {
		System.out.println("Nhap canh 1");
		
		Scanner scanner = new Scanner(System.in);
		
		canh1 = scanner.nextDouble();
		
		System.out.println("Nhap canh 2");
		canh2 = scanner.nextDouble();
		
		System.out.println("Nhap canh 3");
		canh3 = scanner.nextDouble();
		
		System.out.println("Nhap chieu cao");
		chieuCao = scanner.nextDouble();
		
		System.out.println("Nhap canh huyen");
		canhHuyen = scanner.nextDouble();
	}
}
