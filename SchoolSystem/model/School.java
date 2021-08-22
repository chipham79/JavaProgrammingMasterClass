package SchoolSystem.model;

import java.util.Iterator;

public class School {

	public String name;
	
	public Teacher[] teachers;
	
	public Student[] students;
	
	public Clazz[] clazzes;
	
	public Security security;

	
	
	public void getInfo() {
		System.out.println("Number of teachers:" + this.teachers.length );
		
		for (Teacher teacher : this.teachers) {
			teacher.getInfo();
			
		}
		

		System.out.println("Number of student:" + this.students.length );
		
		for (Student student : this.students) {
			student.getInfo();
			
		}
	}
}
