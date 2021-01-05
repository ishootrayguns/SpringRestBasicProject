package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.ProductDao;
import com.spring.model.Product;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao productDao;
	
	@Override
	public boolean addProduct(Product p) {
		return productDao.addProduct(p);
	}

	@Override
	public boolean updateProduct(int productNo, Product p) {
		return productDao.updateProduct(productNo, p);
	}

	@Override
	public boolean deleteProduct(int productNo) {
		return productDao.deleteProduct(productNo);
	}

	@Override
	public Product getProductByNo(int productNo) {
		return productDao.getProductByNo(productNo);
	}

	@Override
	public List<Product> getAllProducts() {
		return productDao.getAllProducts();
	}
}
