package com.dao;

import java.sql.SQLException;
import java.util.List;

import com.model.Product;

public interface ProductDao {
	List<Product> getCustomerDetails() throws SQLException;
	void updateProductInfo(Product product) throws SQLException;
	boolean isProductInStock(int id) throws SQLException;
}
