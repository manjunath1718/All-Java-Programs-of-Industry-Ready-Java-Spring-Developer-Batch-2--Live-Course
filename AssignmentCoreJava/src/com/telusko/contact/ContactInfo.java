package com.telusko.contact;

public class ContactInfo {

	private static final boolean Long = false;
	String name;
	Long phoneNo;
	String email;
	public ContactInfo() {

	}
	public ContactInfo(String name, Long phoneNo, String email) {
		super();
		this.name = name;
		this.phoneNo = phoneNo;
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(Long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "ContactInfo [name=" + name + ", phoneNo=" + phoneNo + ", email=" + email + "]";
	}
	


}
