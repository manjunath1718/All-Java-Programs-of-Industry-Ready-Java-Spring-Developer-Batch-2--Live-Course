package com.telusko.dish;

public class Dish {
	
	String name;
	double price;
	public Dish() {
		
	}
	public Dish(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Dish [name=" + name + ", price=" + price + "]";
	}
	
	

}
