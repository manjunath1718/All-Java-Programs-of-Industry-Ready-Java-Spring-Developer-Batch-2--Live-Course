package com.telusko.student;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		StudentManagementSystem sms=new StudentManagementSystem();
		while(true) {
			Scanner sc=new Scanner(System.in);
			System.out.println("=========================================");
			System.out.println("1:Press 1 to Add Student details");
			System.out.println("2:Press 2 to Update Student details");
			System.out.println("3:Press 3 to Remove Student details");
			System.out.println("4:Press 4 to Disply Student details");
			System.out.println("5:Press 5 to Exit");

			System.out.println("Enter Choice");
			int choice=sc.nextInt();
			System.out.println("=========================================");
			
			switch(choice) {

			case 1->sms.addStudent();
			case 2->sms.updateStudent();
			case 3->sms.removeStudent();
			case 4->sms.displayStudent();
			case 5->System.exit(0);
			default->System.out.println("Invalid Choice");

			}

		}


	}

}
