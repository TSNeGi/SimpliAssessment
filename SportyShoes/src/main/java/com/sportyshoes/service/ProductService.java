package com.sportyshoes.service;

import java.util.List;



import com.sportyshoes.model.Product;

public interface ProductService {

	public List<Product> getAllProducts();
	public Product getProductById(int id);
	public void addProduct(Product product);
	public void updateProduct(int id, Product product);
	public void deleteProduct(int id);
	
}
