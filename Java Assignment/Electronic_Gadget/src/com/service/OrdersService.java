package com.service;

import java.sql.SQLException;
import java.util.List;

import com.dao.OrdersDao;
import com.dao.OrdersDaoImpl;
import com.dto.OrdersDto;
import com.dto.OrdersDto1;

public class OrdersService {
	
	OrdersDao dao=new OrdersDaoImpl();

	public List<OrdersDto> calculateTotalAmount() throws SQLException {
		// TODO Auto-generated method stub
		return dao.calculateTotalAmount();
	}

	

	public List<OrdersDto1> getOrderDetails() throws SQLException {
		// TODO Auto-generated method stub
		return dao.getOrderDetails();
	}

}
