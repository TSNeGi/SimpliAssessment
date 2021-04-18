package com.sportyshoes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sportyshoes.model.Purchase;
import com.sportyshoes.repository.PurchaseRepository;

@Service("purchaseService")
public class PurchaseServiceImpl implements PurchaseService {

	@Autowired
	private PurchaseRepository purchaseRepository;
	
	@Override
	public void addPurchase(Purchase purchase) {
		this.purchaseRepository.saveAndFlush(purchase);
	}

	@Override
	public List<Purchase> filterByDate(String date) {
		return this.purchaseRepository.filterPurchaseByDate(date);
	}

	@Override
	public List<Purchase> filterByCategory(String category) {
		return this.purchaseRepository.filterPurchaseByCategory(category);
	}

	@Override
	public List<Purchase> getAllPurchase() {
		return this.purchaseRepository.findAll();
	}

	
	
}
