//Has-A relation
package com.demo;
class Address{
	private int flatno;
	private String bname,city;
	
	public int getFlatno() {
		return flatno;
	}
	public void setFlatno(int flatno) {
		this.flatno = flatno;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [flatno=" + flatno + ", bname=" + bname + ", city=" + city + "]";
	}
	
}
public class Employee {
	private int eid,contact;
	private String name;
	private Address address;
	
	

	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", contact=" + contact + ", name=" + name + ", address=" + address + "]";
	}
	public static void main(String[] args) {
		Address add=new Address();
		add.setBname("Golden Height");
		add.setFlatno(101);
		add.setCity("Navi Mumbai");
		
		Employee e=new Employee();
		e.setContact(1212212);
		e.setEid(19922);
		e.setName("Aditi");
		e.setAddress(add);
		System.out.println(e);
	}

}

//class Address{
//	int flatno,pincode;
//	String bname,city;
//	public int banme;
//	public Address(int flatno, int pincode, String bname, String city) {
//		super();
//		this.flatno = flatno;
//		this.pincode = pincode;
//		this.bname = bname;
//		this.city = city;
//	}
//	
//}
//
//public class Employee{
//	int eid,contact;
//	String ename;
//	Address add;
//	
//
//	public Employee(int eid, int contact, String ename) {
//	super();
//	this.eid = eid;
//	this.contact = contact;
//	this.ename = ename;
//	this.add = add;
//}
//	
//	void display() {
//	System.out.println(eid+ename+contact);
//	System.out.println(add.flatno+add.banme+add.city+add.pincode);
//}
//
//	public static void main(String[] args) {
//		Address a=new Address(101,400709,"XYT","ABC");
//		Employee e=new Employee(1,49990,"Ram");
//		e.display();
//	}
//}









































