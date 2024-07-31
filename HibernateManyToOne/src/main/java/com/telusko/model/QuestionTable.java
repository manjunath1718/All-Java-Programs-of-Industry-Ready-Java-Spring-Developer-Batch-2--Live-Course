package com.telusko.model;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;



@Entity
public class QuestionTable {
	
	@Id
	@Column(name="Quetion_Id")
	private Integer qId;
	
	private String qName;
	
	
	public QuestionTable() {
		
		System.out.println("Zero Parameter Constructor of Question");
	}

	public Integer getqId() {
		return qId;
	}

	public void setqId(Integer qId) {
		this.qId = qId;
	}

	public String getqName() {
		return qName;
	}

	public void setqName(String qName) {
		this.qName = qName;
	}

	@Override
	public String toString() {
		return "QuestionTable [qId=" + qId + ", qName=" + qName + "]";
	}

	

	
	

	

	
	
	

}
