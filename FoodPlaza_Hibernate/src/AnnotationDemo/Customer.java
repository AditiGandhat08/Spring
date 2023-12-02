package AnnotationDemo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Customer_hibernate")// if not given the name by default it'll get classname
public class Customer {
	private int cid;
	private String name,email,password;
	private int contact;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="CustomerId")
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getContact() {
		return contact;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}
	public Customer(String name, String email, String password, int contact) {
		super();
		
		this.name = name;
		this.email = email;
		this.password = password;
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", name=" + name + ", email=" + email + ", password=" + password + ", contact="
				+ contact + "]";
	}
	

}
