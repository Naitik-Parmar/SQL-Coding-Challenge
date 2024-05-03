package com.dao;

import java.sql.SQLException;
import java.util.List;

import com.dto.OrdersDto;
import com.dto.OrdersDto1;

public interface OrdersDao {
	List<OrdersDto> calculateTotalAmount() throws SQLException;
	List<OrdersDto1> getOrderDetails() throws SQLException;
}
