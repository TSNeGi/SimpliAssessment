package com.sportyshoes.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.sportyshoes.model.Purchase;

@Repository("purchaseRepository")
public interface PurchaseRepository extends JpaRepository<Purchase, Integer> {

	@Query(
			value = "SELECT * from Purchase where TO_DATE(purchase_date) = ?1",
			nativeQuery = true)
	List<Purchase> filterPurchaseByDate(String date);
	
	@Query(
			value = "SELECT * from Purchase where purchase_category = ?1",
			nativeQuery = true)
	List<Purchase> filterPurchaseByCategory(String category);
	
}
