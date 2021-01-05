package com.spring.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import com.spring.model.Product;

@Repository
public class ProductDaoImpl implements ProductDao{

	private List<Product> allProducts = new ArrayList<Product>();
	
	@Override
	public boolean addProduct(Product p) {
		allProducts.add(p);
		return true;
	}

	@Override
	public boolean updateProduct(int productNo, Product p) {
		for(Product product : allProducts) {
			if(product.getProductNo() == productNo) {
				allProducts.remove(product);
				allProducts.add(p);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean deleteProduct(int productNo) {
		for(Product product : allProducts) {
			if(product.getProductNo() == productNo) {
				allProducts.remove(product);
				return true;
			}
		}
		return false;
	}

	@Override
	public Product getProductByNo(int productNo) {
		for(Product product : allProducts) {
			if(product.getProductNo() == productNo) {
				return product;
			}
		}
		return null;
	}

	@Override
	public List<Product> getAllProducts() {
		return allProducts;
	}
}
