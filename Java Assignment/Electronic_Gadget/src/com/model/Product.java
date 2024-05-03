package com.model;

import java.util.Objects;

public class Product {
	private int product_id;
	private String product_name;
	private String description;
	private double price;

	public Product(int product_id, String product_name, String description, double price) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
		this.description = description;
		this.price = price;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [product_id=" + product_id + ", product_name=" + product_name + ", description=" + description
				+ ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(description, price, product_id, product_name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(description, other.description)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& product_id == other.product_id && Objects.equals(product_name, other.product_name);
	}

}
