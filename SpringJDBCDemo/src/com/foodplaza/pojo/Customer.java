package com.foodplaza.pojo;

public class Customer {
	private int cid,contact;
	private String name,emailid,Address,password;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public int getContact() {
		return contact;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}
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
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Customer(int cid, String name, String emailid, String password, String address, int contact) {
		super();
		this.cid = cid;
		this.name = name;
		this.emailid = emailid;
		this.password = password;
		Address = address;
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", name=" + name + ", emailid=" + emailid + ", password=" + password
				+ ", contact=" + contact + ", Address=" + Address + "]";
	}
	
	

}
