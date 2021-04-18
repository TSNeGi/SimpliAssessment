package com.sportyshoes.service;

import java.util.List;



import com.sportyshoes.model.Purchase;

public interface PurchaseService {

	public void addPurchase(Purchase purchase);
	public List<Purchase> filterByDate(String date);
	public List<Purchase> filterByCategory(String category);
	public List<Purchase> getAllPurchase();
}