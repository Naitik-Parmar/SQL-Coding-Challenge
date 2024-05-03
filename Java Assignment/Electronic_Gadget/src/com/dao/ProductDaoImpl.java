package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.model.Product;
import com.utility.DBConnection;

public class ProductDaoImpl implements ProductDao{

	@Override
	public List<Product> getCustomerDetails() throws SQLException {
		Connection con=DBConnection.dbConnect();
		String sql="select * from product";
		PreparedStatement pstmt=con.prepareStatement(sql);
		ResultSet rst=pstmt.executeQuery();
		List<Product> list=new ArrayList<>();
		while(rst.next()==true) {
			int id=rst.getInt("product_id");
			String product_name=rst.getString("product_name");
			String description=rst.getString("description");
			Double price=rst.getDouble("price");
			Product product=new Product(id,product_name,description,price);
			list.add(product);
		}
		DBConnection.dbClose();
		return list;
	}

	@Override
	public void updateProductInfo(Product product) throws SQLException {
		// TODO Auto-generated method stub
		Connection con=DBConnection.dbConnect();
		String sql="update product SET  description = ? , price = ?  WHERE product_id = ?";
		PreparedStatement pstmt=con.prepareStatement(sql);
		pstmt.setString(1, product.getDescription());
		pstmt.setDouble(2,product.getPrice());
		pstmt.setInt(3, product.getProduct_id());
		
		pstmt.executeUpdate();
		DBConnection.dbClose();
	}

	@Override
	public boolean isProductInStock(int id) throws SQLException {
		// TODO Auto-generated method stub
		Connection con=DBConnection.dbConnect();
		String sql="select quantity_in_stock from inventory where product_id =?";
		PreparedStatement pstmt=con.prepareStatement(sql);
		pstmt.setInt(1, id);
		ResultSet rst=pstmt.executeQuery();
		boolean status=rst.next();
		DBConnection.dbClose();
		return status;
	}
	
}
