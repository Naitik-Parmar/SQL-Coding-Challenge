package com.controller;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.dto.CustomerDto;
import com.model.Customer;
import com.service.CustomerService;

public class CustomerController {
	public static void main(String[] args) {
		CustomerService customerService = new CustomerService();
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.println("====================Customer Ops============================");
			System.out.println("Press 1. Total Orders Placed by a Customer");
			System.out.println("Press 2. Gell All Customer Details");
			System.out.println("Press 3. Update Customer Information");
			System.out.println("Press 0. To Exit");
			
			int input=sc.nextInt();
			if(input==0) {
				System.out.println("Exiting Customer Module..");
				break;
			}
			switch(input) {
			case 1:
				try {
					List<CustomerDto> list =customerService.calculateTotalOrders();
					for(CustomerDto c:list) {
						System.out.println(c);
					}
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 2:
				try {
					List<Customer> list=customerService.getCustomerDetails();
					for(Customer c:list) {
						System.out.println(c);
					}
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 3:
				System.out.println("Enter Customer Id : ");
				int customer_id=sc.nextInt();
				System.out.println("Enter First Name : ");
				sc.nextLine();
				String first_name=sc.nextLine();
				System.out.println("Enter Last Name : ");
				String last_name=sc.nextLine();
				System.out.println("Enter Email : ");
				String email=sc.nextLine();
				System.out.println("Enter Phone No. : ");
				String phone=sc.nextLine();
				System.out.println("Enter Address : ");
				String address=sc.nextLine();

				Customer customer=new Customer(customer_id,first_name,last_name,email,phone,address);
				try {
					customerService.updateCustomerInfo(customer);
					System.out.println("Updated Successfully...");
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
				break;
			}
		}
		sc.close();
	}
}
