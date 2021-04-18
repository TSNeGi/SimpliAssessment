package com.sportyshoes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Sort;
import com.sportyshoes.model.Product;
import com.sportyshoes.repository.ProductRepository;


@Service("productService")
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;

	@Override
	public void addProduct(Product product) {
		this.productRepository.saveAndFlush(product);
		
	}

	@Override
	public void updateProduct(int id, Product product) {
		product.setProduct_id(id);
		this.productRepository.save(product);
	}

	@Override
	public void deleteProduct(int id) {
		this.productRepository.deleteById(id);
	}

	@Override
	public List<Product> getAllProducts() {
		return this.productRepository.findAll(Sort.by(Sort.Direction.ASC, "productName"));
	}

	@Override
	public Product getProductById(int id) {
		return this.productRepository.getOne(id);
	}

	
}
