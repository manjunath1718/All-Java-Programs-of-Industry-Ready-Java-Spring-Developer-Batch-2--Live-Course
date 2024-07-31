package com.telusko.model;

import java.util.Arrays;

import org.hibernate.generator.Generator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="StudentTable")
public class Student {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int sid;
		
	private String sname;
	 
	private String scity;
	
	@Lob
	@Column(length = 100000)
	private byte[] image;
	
	@Lob
	@Column(length = 100000)
	private char[] textFile;

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

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public char[] getTextFile() {
		return textFile;
	}

	public void setTextFile(char[] textFile) {
		this.textFile = textFile;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", scity=" + scity +
				", image=" + Arrays.toString(image)
				+ ", textFile=" + Arrays.toString(textFile) + "]";
	}

	
	

	
	
	
	
    
	
}
