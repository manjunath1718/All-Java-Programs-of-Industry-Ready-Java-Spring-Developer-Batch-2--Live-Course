package com.telusko.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class AnswerTable {

	@Id
	@Column(name="answer_Id")
	private Integer aId;

	private String aName;

	@ManyToOne(cascade = CascadeType.ALL)
	private QuestionTable question;
	
	public AnswerTable() {
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

	public QuestionTable getQuestion() {
		return question;
	}

	public void setQuestion(QuestionTable question) {
		this.question = question;
	}

	@Override
	public String toString() {
		return "AnswerTable [aId=" + aId + ", aName=" + aName + ", question=" + question + "]";
	}

	
	

	
	
	
	

}
