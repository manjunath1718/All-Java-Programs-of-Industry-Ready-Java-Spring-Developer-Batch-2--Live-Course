package com.telusko.SpringDataJpaProject01.entity;

import java.time.LocalDate;
import java.util.Arrays;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

@Entity
public class JobSeeker {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	Integer id;
	String name;
	LocalDate dob;
	@Lob
	char[] textFile;
	@Lob
	@Column(length = 100000)
	byte[] image;
	
	public JobSeeker(String name, LocalDate dob, char[] textFile, byte[] image) {
		super();
		this.name = name;
		this.dob = dob;
		this.textFile = textFile;
		this.image = image;
	}
	public JobSeeker() {
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
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public char[] getTextFile() {
		return textFile;
	}
	public void setTextFile(char[] textFile) {
		this.textFile = textFile;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	@Override
	public String toString() {
		return "JobSeeker [id=" + id + ", name=" + name + ", dob=" + dob + ", textFile=" + Arrays.toString(textFile)
				+ ", image=" + Arrays.toString(image) + "]";
	}
	
	
	

}
