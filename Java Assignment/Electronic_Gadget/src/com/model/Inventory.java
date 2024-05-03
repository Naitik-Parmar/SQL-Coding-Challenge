package com.model;

public class Inventory {
	private int inventory_id;
	private int quantityInStock;
	private int lastStockUpdate;
	private int product_id;

	@Override
	public String toString() {
		return "Inventory [inventory_id=" + inventory_id + ", quantityInStock=" + quantityInStock + ", lastStockUpdate="
				+ lastStockUpdate + ", product_id=" + product_id + "]";
	}

	public int getInventory_id() {
		return inventory_id;
	}

	public void setInventory_id(int inventory_id) {
		this.inventory_id = inventory_id;
	}

	public int getQuantityInStock() {
		return quantityInStock;
	}

	public void setQuantityInStock(int quantityInStock) {
		this.quantityInStock = quantityInStock;
	}

	public int getLastStockUpdate() {
		return lastStockUpdate;
	}

	public void setLastStockUpdate(int lastStockUpdate) {
		this.lastStockUpdate = lastStockUpdate;
	}

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public Inventory() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Inventory(int inventory_id, int quantityInStock, int lastStockUpdate, int product_id) {
		super();
		this.inventory_id = inventory_id;
		this.quantityInStock = quantityInStock;
		this.lastStockUpdate = lastStockUpdate;
		this.product_id = product_id;
	}
}
