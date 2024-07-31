package com.telusko.SpringDataJpaProject01.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class CustomerInfo {

	@Id
	@GeneratedValue
	Integer id;
	String name;
	String city;
	LocalDateTime dob;
	LocalDate regDate;
	LocalTime regtime;
	
	public CustomerInfo(String name, String city, LocalDateTime dob, LocalDate regDate, LocalTime regtime) {
		super();
		this.name = name;
		this.city = city;
		this.dob = dob;
		this.regDate = regDate;
		this.regtime = regtime;
	}

	public CustomerInfo() {
		super();
		
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public LocalDateTime getDob() {
		return dob;
	}

	public void setDob(LocalDateTime dob) {
		this.dob = dob;
	}

	public LocalDate getRegDate() {
		return regDate;
	}

	public void setRegDate(LocalDate regDate) {
		this.regDate = regDate;
	}

	public LocalTime getRegtime() {
		return regtime;
	}

	public void setRegtime(LocalTime regtime) {
		this.regtime = regtime;
	}

	@Override
	public String toString() {
		return "CustomerInfo [id=" + id + ", name=" + name + ", city=" + city + ", dob=" + dob + ", regDate=" + regDate
				+ ", regtime=" + regtime + "]";
	}
	
	
}
