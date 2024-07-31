package com.telusko.model;


import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;


@Entity
public class QuestionTable {
	
	@Id
	@Column(name="Quetion_Id")
	private Integer qId;
	
	private String qName;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<AnswerTable> answerList;

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

	public List<AnswerTable> getAnswerList() {
		return answerList;
	}

	public void setAnswerList(List<AnswerTable> answerList) {
		this.answerList = answerList;
	}

	@Override
	public String toString() {
		return "QuestionTable [qId=" + qId + ", qName=" + qName + ", answerList=" + answerList + "]";
	}

	
	

	

	
	
	

}
