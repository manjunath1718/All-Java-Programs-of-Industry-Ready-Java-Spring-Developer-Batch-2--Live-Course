package com.telusko.service;

public class CustomerDto {
	
	String id;
	Integer cxNo;
	String name;
	String city;
	
	
	public CustomerDto() {
		super();
		
	}
	public CustomerDto(Integer cxNo, String name, String city) {
		super();
		this.cxNo = cxNo;
		this.name = name;
		this.city = city;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Integer getCxNo() {
		return cxNo;
	}
	public void setCxNo(Integer cxNo) {
		this.cxNo = cxNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Customer [ cxNo=" + cxNo + ", name=" + name + ", city=" + city + "]";
	}
	

}