package com.telusko.model;

import org.hibernate.generator.Generator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="StudentTable")
public class Student {

	@Id
	@GeneratedValue(generator = "my_seq",strategy=GenerationType.IDENTITY)
	@SequenceGenerator(name="my_seq",sequenceName="My_OwnSeq",initialValue=100,allocationSize=2)
	private int sid;
		
	private String sname;	
    
	private String scity;
	

	public Student() {
		System.out.println("Zero parameterized constructor");
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getScity() {
		return scity;
	}

	public void setScity(String scity) {
		this.scity = scity;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", scity=" + scity + "]";
	}
	
	
	
    
	
}
