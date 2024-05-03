package com.service;

import java.sql.SQLException;
import java.util.List;

import com.dao.OrderDetailsDao;
import com.dao.OrderDetailsDaoImpl;
import com.model.Order_details;

public class OrderDetailsService {

	OrderDetailsDao dao=new OrderDetailsDaoImpl();
	
	public void updateQuantity(int id, int quantity) throws SQLException {
		// TODO Auto-generated method stub
		dao.updateQuantity(id, quantity);
	}

	public List<Order_details> getOrderDetailInfo() throws SQLException {
		// TODO Auto-generated method stub
		return dao.getOrderDetailInfo();
	}

}
