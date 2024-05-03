package com.controller;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.model.Product;
import com.service.ProductService;

public class ProductController {
	public static void main(String[] args) {
		ProductService productService = new ProductService();
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.println("==============Product Ops=================");
			System.out.println("Press 1. Get Product Details");
			System.out.println("Press 2. Update Product Information");
			System.out.println("Press 3. Check Product In Stock");
			System.out.println("Press 0. To Exit");
			
			int input=sc.nextInt();
			if(input==0) {
				System.out.println("Exiting Product Module");
				break;
			}
			switch(input) {
			case 1:
				try {
					List<Product> list=productService.getCustomerDetails();
					for(Product p:list) {
						System.out.println(p);
					}
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 2:
				System.out.println("Enter Product Id : ");
				int product_id=sc.nextInt();
				System.out.println("Enter Description : ");
				sc.nextLine();
				String description=sc.nextLine();
				System.out.println("Enter Price : ");
				Double price=sc.nextDouble();
				Product product=new Product(product_id,"",description,price);
				try {
					productService.updateProductInfo(product);
					System.out.println("Updated Successfully...");
				} catch (SQLException e) {
					System.out.println(e.getMessage());
					e.getMessage();
				}
				break;
			case 3:
				System.out.println("Enter product id");
				int id=sc.nextInt();
				
				try {
					boolean status=productService.isProductInStock(id);
					if(status)
						System.out.println("Yes,Product is in Stock !!");
					else
						System.out.println("Not in Stock !!");
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
			}
		}
		
		sc.close();
	}
}
