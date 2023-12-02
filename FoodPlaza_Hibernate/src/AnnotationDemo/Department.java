package AnnotationDemo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Department_hibernate")
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int deptId;
	private String deptname;
	private int noOfEmployee;
	
	@OneToOne(targetEntity = Institute.class)
	private Institute ins;
	
	
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	public int getNoOfEmployee() {
		return noOfEmployee;
	}
	public void setNoOfEmployee(int noOfEmployee) {
		this.noOfEmployee = noOfEmployee;
	}
	public Institute getIns() {
		return ins;
	}
	public void setIns(Institute ins) {
		this.ins = ins;
	}
	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptname=" + deptname + ", noOfEmployee=" + noOfEmployee + ", ins="
				+ ins + "]";
	}
	
	

}
