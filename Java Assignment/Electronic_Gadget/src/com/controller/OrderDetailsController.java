package com.controller;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.model.Order_details;
import com.service.OrderDetailsService;

public class OrderDetailsController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OrderDetailsService orderDetailsService = new OrderDetailsService();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("====================Order Ops============================");
			System.out.println("Press 1. Update Quantity");
			System.out.println("Press 2. Get Complete Order_Details Information");
			System.out.println("Press 0. To Exit");

			int input = sc.nextInt();
			if (input == 0) {
				System.out.println("Exiting Order Module..");
				break;
			}
			
			switch(input) {
			case 1:
				System.out.println("Enter order_details_id : ");
				int id = sc.nextInt();

				System.out.println("Enter Updated Quantity : ");
				int quantity = sc.nextInt();

				try {
					orderDetailsService.updateQuantity(id, quantity);
					System.out.println("Updated Successfully...");
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 2:
				try {
					List<Order_details> list=orderDetailsService.getOrderDetailInfo();
					for(Order_details o:list) {
						System.out.println(o);
					}
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
				break;
			}
		}
		sc.close();
	}

}
