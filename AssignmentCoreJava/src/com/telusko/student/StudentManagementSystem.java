package com.telusko.student;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class StudentManagementSystem {

	HashMap<Integer,Student> hm=new HashMap<>();
	static int id=1;
	Scanner sc=new Scanner(System.in);
	public void addStudent() {

		System.out.println("Enter Student Name");
		String name=sc.next();
		System.out.println("Enter Student Age");
		int age=sc.nextInt();
		System.out.println("Enter Student Grade");
		char grade=sc.next().charAt(0);

		hm.put(id,new Student(id++, name, age, grade));

		System.out.println("Insert Student details Successful!");

	}
	public void updateStudent() {
		System.out.println("Enter Student Id to Update Student details");
		int id=sc.nextInt();
		System.out.println("Enter Student Name");
		String name=sc.next();
		System.out.println("Enter Student Age");
		int age=sc.nextInt();
		System.out.println("Enter Student Grade");
		char grade=sc.next().charAt(0);

		Set<Entry<Integer, Student>> list = hm.entrySet();
		for(Entry<Integer, Student> s:list) {
			if(s.getKey()==id) {
				s.getValue().setName(name);
				s.getValue().setAge(age);
				s.getValue().setGrade(grade);
			}
		}
		System.out.println("Updated Student Details Successful!");

	}
	public void removeStudent() {

		System.out.println("Enter Student Id to Remove Student details");
		int id=sc.nextInt();
		hm.remove(id);

		System.out.println("Removed Student Details!");

	}
	public void displayStudent() {

		Set<Entry<Integer, Student>> list = hm.entrySet();
		for(Entry<Integer, Student> s:list) {
			System.out.println(s.getValue());			
		}
	}


}
