package com.model;

import java.util.Objects;

public class Order_details {
	private int order_details_id;
	private int quantity;
	private int order_id;
	private int product_id;

	public Order_details(int order_details_id, int quantity, int order_id, int product_id) {
		super();
		this.order_details_id = order_details_id;
		this.quantity = quantity;
		this.order_id = order_id;
		this.product_id = product_id;
	}

	public Order_details() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getOrder_details_id() {
		return order_details_id;
	}

	public void setOrder_details_id(int order_details_id) {
		this.order_details_id = order_details_id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	@Override
	public String toString() {
		return "Order_details [order_details_id=" + order_details_id + ", quantity=" + quantity + ", order_id="
				+ order_id + ", product_id=" + product_id + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(order_details_id, order_id, product_id, quantity);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order_details other = (Order_details) obj;
		return order_details_id == other.order_details_id && order_id == other.order_id
				&& product_id == other.product_id && quantity == other.quantity;
	}

}
