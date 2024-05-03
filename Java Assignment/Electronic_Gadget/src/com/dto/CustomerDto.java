package com.dto;

public class CustomerDto {
	private int customer_id;
	private String first_name;
	private String last_name;
	private int total_orders;

	public CustomerDto(int customer_id, String first_name, String last_name, int total_orders) {
		super();
		this.customer_id = customer_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.total_orders = total_orders;
	}

	public CustomerDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public int getTotal_orders() {
		return total_orders;
	}

	public void setTotal_orders(int total_orders) {
		this.total_orders = total_orders;
	}

	@Override
	public String toString() {
		return "CustomerDto [customer_id=" + customer_id + ", first_name=" + first_name + ", last_name=" + last_name
				+ ", total_orders=" + total_orders + "]";
	}

}
