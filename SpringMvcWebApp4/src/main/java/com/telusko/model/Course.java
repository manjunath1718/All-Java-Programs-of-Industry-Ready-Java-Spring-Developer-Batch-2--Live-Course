package com.telusko.model;

public class Course {

	Integer id;
	String name;
	Double cost;
	
	public Course(Integer id, String name, Double cost) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getCost() {
		return cost;
	}
	public void setCost(Double cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", cost=" + cost + "]";
	}
	
	
}