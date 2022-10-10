package com.masai;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Demo {
	
	public static void main(String[] args) {
		StudentMarkComp mcomp = new StudentMarkComp();
		List<Student> students = new ArrayList<>();
		
		students.add(new Student(10, "Gopal", "Puri", 500));
		students.add(new Student(11, "Radhe", "Badrinath", 580));
		students.add(new Student(12, "Hari", "Dwarika", 310));
		students.add(new Student(13, "Gobinda", "Ayodhya", 620));
		students.add(new Student(14, "Shyam", "Brundaban", 420));
		students.add(new Student(10, "Gopal", "Puri", 500));
		
		
		Set<Student> uniqueStudents = new LinkedHashSet<>(students);
//		Set<Student> uniqueStudents = new TreeSet<>(mcomp);
		
		students = new ArrayList<>(uniqueStudents);
		
		Collections.sort(students,mcomp);
		
		
		for (Student student : students) {
			System.out.println("Roll : "+student.getRoll()+" , Name : "+student.getName()+" , Address : "+student.getAddress()+" , Marks : "+student.getMarks());
		}
		
		
	}

}
