package com.app;



import java.util.Scanner;

import com.model.Clazz;
import com.model.School;
import com.model.Student;
import com.model.Teacher;


public class Management {

	
	public static void main(String[] args) {
		System.out.println("Welcome to School management system");
		
		School school = new School();
		school.name = "PTIT";
		
		
		Scanner sc = new Scanner(System.in);
			
		System.out.println("How many teacher do you want to input??");
		int numOfTeachers = sc.nextInt();

		
		
		school.teachers = new Teacher[numOfTeachers];
		
		for( int i = 0; i < numOfTeachers; i++ ) {
			school.teachers[i] = new Teacher();
			school.teachers[i].inputInfo();
		}
		
		/**
		 * Classes
		 */
		System.out.println("How many class in this school?");
		int numOfClasses = sc.nextInt();
		school.clazzes = new Clazz[numOfClasses];
		
		for( int i = 0; i < numOfClasses; i++ ) {
			school.clazzes[i] = new Clazz();
			school.clazzes[i].inputInfo();
	
		}

		System.out.println("How many student do you want to input??");
		int numOfStudents = sc.nextInt();
		
		school.students = new Student[numOfStudents];
		
		for( int i = 0; i < numOfStudents; i++ ) {
			school.students[i] = new Student();
			school.students[i].inputInfo();
			
			System.out.println("Which class this student belong to?");
			
			String className = sc.next();
			
			
			for (Clazz clazz : school.clazzes) {
				if( clazz.name.equalsIgnoreCase(className)  ) {
					school.students[i].clazz = clazz;
				}
			}
		}
		
		school.getInfo();
		
		
	}
}