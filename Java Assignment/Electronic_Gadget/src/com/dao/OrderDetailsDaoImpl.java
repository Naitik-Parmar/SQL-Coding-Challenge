package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.model.Order_details;
import com.utility.DBConnection;

public class OrderDetailsDaoImpl implements OrderDetailsDao{

	@Override
	public void updateQuantity(int id,int quantity) throws SQLException {
		// TODO Auto-generated method stub
		Connection con=DBConnection.dbConnect();
		String sql="update order_details set quantity=? where order_details_id=?";
		PreparedStatement pstmt=con.prepareStatement(sql);
		pstmt.setInt(1, quantity);
		pstmt.setInt(2, id);
		pstmt.executeUpdate();
		DBConnection.dbClose();
	}

	@Override
	public List<Order_details> getOrderDetailInfo() throws SQLException {
		// TODO Auto-generated method stub
		Connection con=DBConnection.dbConnect();
		String sql="select * from order_details";
		PreparedStatement pstmt=con.prepareStatement(sql);
		ResultSet rst=pstmt.executeQuery();
		
		List<Order_details> list=new ArrayList<Order_details>();
		while(rst.next()) {
			int order_details_id=rst.getInt("order_details_id");
			int quantity=rst.getInt("quantity");
			int order_id=rst.getInt("order_id");
			int product_id=rst.getInt("product_id");
			Order_details o=new Order_details(order_details_id,quantity,order_id,product_id);
			list.add(o);
		}
		DBConnection.dbClose();
		return list;
	}
}
