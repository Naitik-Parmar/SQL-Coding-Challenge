package com.dao;

import java.sql.SQLException;
import java.util.List;

import com.dto.CustomerDto;
import com.model.Customer;

public interface CustomerDao {
	List<CustomerDto> calculateTotalOrders() throws SQLException;
	List<Customer> getCustomerDetails() throws SQLException;
	void updateCustomerInfo(Customer customer) throws SQLException;
}
