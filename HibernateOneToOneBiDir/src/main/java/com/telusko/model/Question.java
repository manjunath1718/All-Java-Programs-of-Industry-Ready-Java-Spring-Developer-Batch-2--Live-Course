package com.telusko.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Question {
	
	@Id
	@Column(name="Quetion_Id")
	private Integer qId;
	
	private String qName;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Answer answer;

	public Question() {
		
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

	public Answer getAnswer() {
		return answer;
	}

	public void setAnswer(Answer answer) {
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "Question [qId=" + qId + ", qName=" + qName + ", answer=" + answer + "]";
	}
	
	
	

}
