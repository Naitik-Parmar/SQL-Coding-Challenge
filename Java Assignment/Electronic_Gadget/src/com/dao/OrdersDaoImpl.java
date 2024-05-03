package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dto.OrdersDto;
import com.dto.OrdersDto1;
import com.utility.DBConnection;

public class OrdersDaoImpl implements OrdersDao{

	@Override
	public List<OrdersDto> calculateTotalAmount() throws SQLException {
		// TODO Auto-generated method stub
		Connection con=DBConnection.dbConnect();
		String sql="select o.order_id, sum(p.price * od.quantity) as total_amount "
				+ "from orders o join order_details od on o.order_id = od.order_id"
				+ " join product p on od.product_id = p.product_id"
				+ " group by o.order_id";
		PreparedStatement pstmt=con.prepareStatement(sql);
		ResultSet rst=pstmt.executeQuery();
		List<OrdersDto> list=new ArrayList<OrdersDto>();
		while(rst.next()) {
			int order_id=rst.getInt("order_id");
			double total_amount=rst.getDouble("total_amount");
			OrdersDto o=new OrdersDto(order_id,total_amount);
			list.add(o);
		}
		DBConnection.dbClose();
		return list;
	}

	@Override
	public List<OrdersDto1> getOrderDetails() throws SQLException {
		// TODO Auto-generated method stub
		Connection con=DBConnection.dbConnect();
		String sql="SELECT o.order_id,o.order_date,o.customer_id,p.product_id,p.product_name,od.quantity,p.price"
				+ " FROM Orders o JOIN order_details od ON o.order_id = od.order_id "
				+ " JOIN product p ON od.product_id = p.product_id;";
		PreparedStatement pstmt=con.prepareStatement(sql);
		ResultSet rst=pstmt.executeQuery();
		List<OrdersDto1> list=new ArrayList<OrdersDto1>();
		while(rst.next()) {
			int order_id=rst.getInt("order_id");
			String order_date=rst.getString("order_date");
			int customer_id=rst.getInt("customer_id");
			int product_id=rst.getInt("product_id");
			String product_name=rst.getString("product_name");
			int quantity=rst.getInt("quantity");
			double price=rst.getDouble("price");
			OrdersDto1 o1=new OrdersDto1(order_id,order_date,customer_id,product_id,product_name,quantity,price);
			list.add(o1);
		}
		DBConnection.dbClose();
		return list;
	}

}
