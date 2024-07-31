package com.telusko.dish;

import java.util.Scanner;
import java.util.UUID;

public class Solution {

	public static void main(String[] args) {
		Services services=new Services();
		
		while(true) {
			Scanner sc=new Scanner(System.in);
			System.out.println("=========================================");
			System.out.println("1:Press 1 to Add Dish to Menu");
			System.out.println("2:Press 2 to Update Dish Price");
			System.out.println("3:Press 3 to Remove Dish from Menu");
			System.out.println("4:Press 4 to See Menu");
			System.out.println("5:Press 5 to Exit");

			System.out.println("Enter Choice");
			int choice=sc.nextInt();
			System.out.println("=========================================");
			
			switch(choice) {

			case 1->services.addDish();
			case 2->services.updateDish();
			case 3->services.removeDish();
			case 4->services.menu();
			case 5->System.exit(0);
			default->System.out.println("Invalid Choice");

			}

		}

	}

}
