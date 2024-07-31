package com.telusko.beans;

public class Employee {

	private Integer id;

	private String name;

	private Double salary;

	private String addr;

	public Employee() {
		super();
		System.out.println("Emp Bean is created");
	}

	public Employee(Integer id, String name, Double salary, String addr) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.addr = addr;
		System.out.println("Emploee bean is created using param constructor");
	}

	public String taskEmployee()
	{
		return "Every Employee acts productive but in reality all of them less productive";
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", addr=" + addr + "]";
	}

}
