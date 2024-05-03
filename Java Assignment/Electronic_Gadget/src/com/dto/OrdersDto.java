package com.dto;

public class OrdersDto {
	private int order_id;
	private double total_amount;

	public OrdersDto(int order_id, double total_amount) {
		super();
		this.order_id = order_id;
		this.total_amount = total_amount;
	}

	public OrdersDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	public double getTotal_amount() {
		return total_amount;
	}

	public void setTotal_amount(double total_amount) {
		this.total_amount = total_amount;
	}

	@Override
	public String toString() {
		return "OrdersDto [order_id=" + order_id + ", total_amount=" + total_amount + "]";
	}

}
