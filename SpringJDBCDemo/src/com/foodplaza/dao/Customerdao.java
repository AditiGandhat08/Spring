package com.foodplaza.dao;

import java.util.List;
import com.foodplaza.pojo.Customer;

interface Customerdao {
	boolean addCustomer(Customer customer);
	boolean updateCustomerByEmail(Customer customer);
	boolean deleteCustomerByemail(Customer cid);
	List<Customer>getAllCustomer();
	Customer searchCustomerByemail(int cid);

	}



