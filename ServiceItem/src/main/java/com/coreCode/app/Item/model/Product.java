package com.coreCode.app.Item.model;

import java.util.Date;

import lombok.Data;

@Data
public class Product {
	
	private Long idProduct;
	private String name;
	private Double price;	
	private Date date;
	private String status;

}
