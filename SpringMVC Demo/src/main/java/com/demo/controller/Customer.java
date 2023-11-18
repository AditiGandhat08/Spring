package com.demo.controller;

public class Customer {
	
	private String name, emailid, password,address;
	private int contact;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getContact() {
		return contact;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", emailid=" + emailid + ", password=" + password + ", address=" + address
				+ ", contact=" + contact + "]";
	}
	public Customer() {
		super();
	}
	
	

}
