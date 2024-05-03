package com.service;

import java.sql.SQLException;
import java.util.List;

import com.dao.ProductDao;
import com.dao.ProductDaoImpl;
import com.model.Product;

public class ProductService {
	
	ProductDao dao=new ProductDaoImpl();

	public List<Product> getCustomerDetails() throws SQLException{
		// TODO Auto-generated method stub
		return dao.getCustomerDetails();
	}

	public void updateProductInfo(Product product) throws SQLException {
		// TODO Auto-generated method stub
		dao.updateProductInfo(product);
	}

	public boolean isProductInStock(int id) throws SQLException {
		// TODO Auto-generated method stub
		return dao.isProductInStock(id);
	}
	
}
