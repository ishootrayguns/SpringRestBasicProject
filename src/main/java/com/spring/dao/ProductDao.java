package com.spring.dao;

import java.util.List;

import com.spring.model.Product;

public interface ProductDao {
	public boolean addProduct(Product p);
	public boolean updateProduct(int productNo, Product p);
	public boolean deleteProduct(int productNo);
	public Product getProductByNo(int productNo);
	public List<Product> getAllProducts();
}
