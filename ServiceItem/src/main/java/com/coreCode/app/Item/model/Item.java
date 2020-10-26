package com.coreCode.app.Item.model;

import lombok.Data;

@Data
public class Item {
	
	private Integer cantidad;
	private Product product;

	public double getCantidad() {
		return product.getPrice() * cantidad.doubleValue();
	}
}
