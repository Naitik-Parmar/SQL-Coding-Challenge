package com.service;

import java.sql.SQLException;
import java.util.List;

import com.model.Customer;
import com.dao.CustomerDao;
import com.dao.CustomerDaoImpl;
import com.dto.CustomerDto;

public class CustomerService {
	
	CustomerDao dao=new CustomerDaoImpl();

	public List<CustomerDto> calculateTotalOrders() throws SQLException{
		// TODO Auto-generated method stub
		return dao.calculateTotalOrders();
	}

	public List<Customer> getCustomerDetails() throws SQLException{
		// TODO Auto-generated method stub
		return dao.getCustomerDetails();
	}


	public void updateCustomerInfo(Customer customer) throws SQLException {
		// TODO Auto-generated method stub
		dao.updateCustomerInfo(customer);
	}

}
