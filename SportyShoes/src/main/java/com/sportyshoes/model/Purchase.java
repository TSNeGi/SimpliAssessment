package com.sportyshoes.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.*;

@Entity
@Table
public class Purchase {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "purchase_id")
	private int purchase_id;

	@Column(name = "purchase_name")
	private int purchase_name;

	@Column(name = "purchase_user")
	private int purchase_user;

	@Column(name = "purchase_price")
	private int purchase_price;
	
	@Column(name = "purchase_date")
	private Date purchase_date;
	
	@Column(name="purchase_category")
	private String purchase_category;
	
	

	public Purchase(int purchase_id, int purchase_name, int purchase_user, int purchase_price, Date purchase_date,
			String purchase_category) {
		super();
		this.purchase_id = purchase_id;
		this.purchase_name = purchase_name;
		this.purchase_user = purchase_user;
		this.purchase_price = purchase_price;
		this.purchase_date = purchase_date;
		this.purchase_category = purchase_category;
	}



	public String getPurchase_category() {
		return purchase_category;
	}

	public void setPurchase_category(String purchase_category) {
		this.purchase_category = purchase_category;
	}

	public int getPurchase_id() {
		return purchase_id;
	}

	public void setPurchase_id(int purchase_id) {
		this.purchase_id = purchase_id;
	}

	public int getPurchase_name() {
		return purchase_name;
	}

	public void setPurchase_name(int purchase_name) {
		this.purchase_name = purchase_name;
	}

	public int getPurchase_user() {
		return purchase_user;
	}

	public void setPurchase_user(int purchase_user) {
		this.purchase_user = purchase_user;
	}

	public int getPurchase_price() {
		return purchase_price;
	}

	public void setPurchase_price(int purchase_price) {
		this.purchase_price = purchase_price;
	}

	
	
	public Date getPurchase_date() {
		return purchase_date;
	}

	public void setPurchase_date(Date purchase_date) {
		this.purchase_date = purchase_date;
	}

	public Purchase() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public String toString() {
		return "Purchase [purchase_id=" + purchase_id + ", purchase_name=" + purchase_name + ", purchase_user="
				+ purchase_user + ", purchase_price=" + purchase_price + ", purchase_date=" + purchase_date
				+ ", purchase_category=" + purchase_category + "]";
	}

	
	

}
