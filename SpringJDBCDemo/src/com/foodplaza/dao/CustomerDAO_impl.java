package com.foodplaza.dao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import com.foodplaza.pojo.Customer;

public class CustomerDAO_impl implements Customerdao{
private JdbcTemplate template;
	
	public JdbcTemplate getTemplate() {
		return template;
	}
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	@Override
	public boolean addCustomer(Customer customer) {
		String sql="insert into customerag(eid,name,emailid,password,address,contact) values(?,?,?,?,?,?)";
		int row=template.update(sql,customer.getCid(),customer.getName(),customer.getEmailid(),customer.getPassword(),customer.getAddress(),customer.getContact());
		return row>0;
	}

	@Override
	public boolean updateCustomerByEmail(Customer customer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteCustomerByemail(Customer cid) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer searchCustomerByemail(int cid) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
