package com.telusko.dish;

import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Services {

	HashMap<Integer,Dish> hm=new HashMap<>();
	static int id=1;
	Scanner sc=new Scanner(System.in);
	Scanner str=new Scanner(System.in);

	public void addDish() {

		System.out.println("Enter Dish Name");
		String name=str.nextLine();

		System.out.println("Enter Dish Price");
		double price=sc.nextDouble();

		hm.put(id++,new Dish(name,price));

		System.out.println("Dish added Successful!");
	}

	public void updateDish() {
		boolean flag=false;
		System.out.println("Enter Dish Name");
		String name=str.nextLine();

		System.out.println("Enter Dish Price to Update");
		double price=sc.nextDouble();
		for(Dish d:hm.values()) {
			if(d.getName().equalsIgnoreCase(name)) {
				d.setPrice(price);
				flag = true;
			}
		}
		if(flag) {
			System.out.println("Dish Price Updated Successfull!");
		}else {
			System.out.println("Dish Price Updateding Unsuccessfull!");
		}

	}
	public void removeDish()  {

		try {
			System.out.println("Enter Dish Name");
			String name=str.nextLine();
			
			for(Entry<Integer, Dish> d:hm.entrySet()) {
				if(d.getValue().getName().equalsIgnoreCase(name)) {
					hm.remove(d.getKey());
					System.out.println("Dish Removed From menu");
				}
			}

		}catch(ConcurrentModificationException  e) {
			e.printStackTrace();
		}
				

	}

	public void menu() {

		for(Dish d:hm.values()) {
			System.out.println(d.getName()+"       "+d.getPrice());
		}

	}


}
