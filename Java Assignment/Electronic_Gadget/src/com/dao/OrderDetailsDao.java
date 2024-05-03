package com.dao;

import java.sql.SQLException;
import java.util.List;

import com.model.Order_details;

public interface OrderDetailsDao {
	void updateQuantity(int id,int quantity) throws SQLException;
	List<Order_details> getOrderDetailInfo() throws SQLException;
}
