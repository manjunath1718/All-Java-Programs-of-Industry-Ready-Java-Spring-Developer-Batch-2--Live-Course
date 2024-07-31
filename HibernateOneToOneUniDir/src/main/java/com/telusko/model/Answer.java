package com.telusko.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Answer {

	@Id
	@Column(name="answer_Id")
	private Integer aId;

	private String aName;

	public Answer() {
		System.out.println("Zero Param Constructor of Answer");
	}

	public Integer getaId() {
		return aId;
	}

	public void setaId(Integer aId) {
		this.aId = aId;
	}

	public String getaName() {
		return aName;
	}

	public void setaName(String aName) {
		this.aName = aName;
	}

	@Override
	public String toString() {
		return "Answer [aId=" + aId + ", aName=" + aName + "]";
	}
	
	
	

}
