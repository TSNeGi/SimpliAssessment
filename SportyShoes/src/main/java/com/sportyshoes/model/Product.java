package com.sportyshoes.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "product_id")
	
	private int product_id;
	
	@Column(name = "product_name")
	private String product_name;
	
	@Column(name = "product_category")
	private String product_category;
	
	@Column(name = "product_price")
	private int product_price;

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

	public String getProduct_category() {
		return product_category;
	}

	public void setProduct_category(String product_category) {
		this.product_category = product_category;
	}

	public int getProduct_price() {
		return product_price;
	}

	public void setProduct_price(int product_price) {
		this.product_price = product_price;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(String product_name, String product_category, int product_price) {
		super();
		this.product_name = product_name;
		this.product_category = product_category;
		this.product_price = product_price;
	}

	@Override
	public String toString() {
		return "Product [product_id=" + product_id + ", product_name=" + product_name + ", product_category="
				+ product_category + ", product_price=" + product_price + "]";
	}


	
	
	
	

}
