package com.DAO;

import java.util.List;
import AnnotationDemo.Customer;

public interface Customerdao {
	public boolean addCustomer(Customer cus);
	public boolean updateCustomerById(Customer cus);
	public boolean  deleteCustomerById(int cid);
	List<Customer>getAllCustomer();
	Customer searchCustomerById(int cusId);
}


