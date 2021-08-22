package com.model;

import java.util.Scanner;


public class Student {
	
	
	private String id;
	
	private String name;
	
	public Clazz clazz;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void study() {
		
		
	}
	
	public void inputInfo() {
		try {
		
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter student id: ");
			this.id = sc.nextLine();	
			
			System.out.println("Enter student name: ");
			this.name = sc.nextLine();
			
		}
		catch (Exception e) {
			System.out.println("Please input an valid value");
		}
			
	}
		
	
	
	public void getInfo() {
		System.out.println("Student name: " + this.name + ", Student ID: " + this.id );
		boolean isCheckClazzNull = this.clazz != null;
		if (isCheckClazzNull) 
			System.out.println("Class: " + this.clazz.name);
		else
			System.out.println("Clase does not exists");
	}
}

