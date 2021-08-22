package com.model;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Clazz {

	public String name;
	public int size;
	public String time;
		
	public int getSize() {
		return size;
	}
	
	public void inputInfo() {
		boolean status = true;
			
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter class name: ");
		this.name = sc.nextLine();		

		while (status) {
			try {
				System.out.println("Enter class size: ");
				this.size = sc.nextInt();
				if (size < 0) {
					System.out.println("Please enter a positive number");
				} else
					status = false;
			} catch (InputMismatchException e) {
				System.out.println("Please enter a valid number");
				sc.next();
				}
		}				
	}
}
