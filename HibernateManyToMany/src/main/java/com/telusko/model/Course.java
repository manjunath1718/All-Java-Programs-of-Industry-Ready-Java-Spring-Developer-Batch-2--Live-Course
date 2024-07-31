package com.telusko.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Course {
	
	@Id
	Integer cId;
	
	String cName;

	public Course() {
		System.out.println("Zero Param Constructor of Course");
	}

	public Integer getcId() {
		return cId;
	}

	public void setcId(Integer cId) {
		this.cId = cId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	@Override
	public String toString() {
		return "Course [cId=" + cId + ", cName=" + cName + "]";
	}
	
	
	

}
