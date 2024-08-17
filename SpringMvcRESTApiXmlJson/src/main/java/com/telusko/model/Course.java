package com.telusko.model;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Course {

	Integer cid;
	String cname;
	Double cprice;
	
	public Course() {
		
	}
	public Course(Integer cid, String cname, Double cprice) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cprice = cprice;
	}
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Double getCprice() {
		return cprice;
	}
	public void setCprice(Double cprice) {
		this.cprice = cprice;
	}
	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + ", cprice=" + cprice + "]";
	}
	
	
}
