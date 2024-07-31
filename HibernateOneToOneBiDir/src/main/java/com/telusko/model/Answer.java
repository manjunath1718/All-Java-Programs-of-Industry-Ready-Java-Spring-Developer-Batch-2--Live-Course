package com.telusko.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Answer {

	@Id
	@Column(name="answer_Id")
	private Integer aId;

	private String aName;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Question question;

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

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	@Override
	public String toString() {
		return "Answer [aId=" + aId + ", aName=" + aName + ", question=" + question + "]";
	}

	
	
	
	

}
