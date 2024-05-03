package com.dto;

public class OrdersDto1 {
	private int order_id;
	private String order_date;
	private int customer_id;
	private int product_id;
	private String product_name;
	private int quantity;
	private double price;

	public OrdersDto1(int order_id, String order_date, int customer_id, int product_id, String product_name,
			int quantity, double price) {
		super();
		this.order_id = order_id;
		this.order_date = order_date;
		this.customer_id = customer_id;
		this.product_id = product_id;
		this.product_name = product_name;
		this.quantity = quantity;
		this.price = price;
	}

	public OrdersDto1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	public String getOrder_date() {
		return order_date;
	}

	public void setOrder_date(String order_date) {
		this.order_date = order_date;
	}

	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "OrdersDto1 [order_id=" + order_id + ", order_date=" + order_date + ", customer_id=" + customer_id
				+ ", product_id=" + product_id + ", product_name=" + product_name + ", quantity=" + quantity
				+ ", price=" + price + "]";
	}

}
