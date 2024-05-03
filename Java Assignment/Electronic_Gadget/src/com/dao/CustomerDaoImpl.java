package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dto.CustomerDto;
import com.model.Customer;
import com.utility.DBConnection;

public class CustomerDaoImpl implements CustomerDao{

	@Override
	public List<CustomerDto> calculateTotalOrders() throws SQLException {
		// TODO Auto-generated method stub
		Connection con=DBConnection.dbConnect();
		String sql="select c.*,count(o.order_id) as total_orders\r\n"
				+ "from customer c \r\n"
				+ "join orders o on c.customer_id = o.customer_id\r\n"
				+ "join order_details od on o.order_id = od.order_id\r\n"
				+ "where c.customer_id = 1";
		PreparedStatement pstmt=con.prepareStatement(sql);
		
		ResultSet rst=pstmt.executeQuery();
		List<CustomerDto> list=new ArrayList<>();
		while(rst.next()==true) {
			int id=rst.getInt("customer_id");
			String first_name=rst.getString("first_name");
			String last_name=rst.getString("last_name");
			int total_orders=rst.getInt("total_orders");
			CustomerDto customer=new CustomerDto(id,first_name,last_name,total_orders);
			list.add(customer);
		}
		DBConnection.dbClose();
		return list;
	}

	@Override
	public List<Customer> getCustomerDetails() throws SQLException {
		// TODO Auto-generated method stub
		Connection con=DBConnection.dbConnect();
		String sql="select * from customer";
		PreparedStatement pstmt=con.prepareStatement(sql);
		ResultSet rst=pstmt.executeQuery();
		List<Customer> list=new ArrayList<>();
		while(rst.next()==true) {
			int id=rst.getInt("customer_id");
			String first_name=rst.getString("first_name");
			String last_name=rst.getString("last_name");
			String email=rst.getString("email");
			String phone=rst.getString("phone");
			String address=rst.getString("address");
			Customer customer=new Customer(id,first_name,last_name,email,phone,address);
			list.add(customer);
		}
		DBConnection.dbClose();
		return list;
	}

	@Override
	public void updateCustomerInfo(Customer customer) throws SQLException {
		// TODO Auto-generated method stub
		Connection con=DBConnection.dbConnect();
		String sql="update customer SET first_name = ?, last_name = ?, email = ?, phone = ?, address = ? WHERE customer_id = ?";
		PreparedStatement pstmt=con.prepareStatement(sql);
		pstmt.setString(1,customer.getFirst_name());
		pstmt.setString(2, customer.getLast_name());
		pstmt.setString(3, customer.getEmail());
		pstmt.setString(4, customer.getPhone());
		pstmt.setString(5, customer.getAddress());
		pstmt.setInt(6, customer.getCustomer_id());
		pstmt.executeUpdate();
		DBConnection.dbClose();
	}

}
