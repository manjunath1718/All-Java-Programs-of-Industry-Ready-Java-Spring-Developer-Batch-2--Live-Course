package com.telusko.contact;

import java.util.Scanner;

public class LaunchApp {

	public static void main(String[] args) {
		Services services=new Services();
		Scanner sc=new Scanner(System.in);
		while(true) {
			
			System.out.println("=========================================");
			System.out.println("1:Press 1 to Add Contact details");
			System.out.println("2:Press 2 to Disply Contact details");
			System.out.println("3:Press 3 to Remove Contact details");			
			System.out.println("4:Press 4 to Exit");

			System.out.println("Enter Choice");
			int choice=sc.nextInt();
			System.out.println("=========================================");

			switch(choice) {

			case 1->services.addContacts();
			case 2->services.retrieveDetailsByName();
			case 3->services.removeContacts();
			case 4->System.exit(0);

			default->System.out.println("Invalid Choice");

			}

		}

	}

}
