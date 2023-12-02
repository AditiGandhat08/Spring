package com.demo;

public class Employee {

	private int eid;
	private String name,des;
	private double salary;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDes() {
		return des;
	}
	public void setDes(String des) {
		this.des = des;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employee(int eid, String name, String des, double salary) {
		super();
		this.eid = eid;
		this.name = name;
		this.des = des;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", des=" + des + ", salary=" + salary + "]";
	}
	public Employee() {
		super();
	}
	
	
}
