package com.controller;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.dto.OrdersDto;
import com.dto.OrdersDto1;
import com.service.OrdersService;

public class OrdersController {
	public static void main(String[] args) {
		OrdersService ordersService = new OrdersService();
		
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.println("====================Order Ops============================");
			System.out.println("Press 1. Get Total Amount Of Order");
			System.out.println("Press 2. Get Complete Details of Order");
			System.out.println("Press 0. To Exit");
			
			int input=sc.nextInt();
			if(input==0) {
				System.out.println("Exiting Order Module..");
				break;
			}
			switch(input) {
			case 1:
				try {
					List<OrdersDto> list = ordersService.calculateTotalAmount();
					for(OrdersDto o:list) {
						System.out.println(o);
					}
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 2:
				try {
					List<OrdersDto1> list = ordersService.getOrderDetails();
					for(OrdersDto1 o:list) {
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
