package com.model;

import java.util.Objects;

public class Orders {
	private int order_id;
	private String order_date;
	private double total_amount;
	private int customer_id;

	public Orders(int order_id, String order_date, double total_amount, int customer_id) {
		super();
		this.order_id = order_id;
		this.order_date = order_date;
		this.total_amount = total_amount;
		this.customer_id = customer_id;
	}

	public Orders() {
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

	public double getTotal_amount() {
		return total_amount;
	}

	public void setTotal_amount(double total_amount) {
		this.total_amount = total_amount;
	}

	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	@Override
	public String toString() {
		return "Orders [order_id=" + order_id + ", order_date=" + order_date + ", total_amount=" + total_amount
				+ ", customer_id=" + customer_id + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(customer_id, order_date, order_id, total_amount);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Orders other = (Orders) obj;
		return customer_id == other.customer_id && Objects.equals(order_date, other.order_date)
				&& order_id == other.order_id
				&& Double.doubleToLongBits(total_amount) == Double.doubleToLongBits(other.total_amount);
	}

}
