package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.model.Product;
import com.spring.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	//End point
	//Handler Method
	@GetMapping("/")
	public String welcome() {
		return "Hello from Spring Rest";
	}
	
	@PutMapping(value = "/addproduct")
	public ResponseEntity addNewProduct(@RequestBody Product p) {
		if(productService.addProduct(p)) {
			return new ResponseEntity<>(HttpStatus.CREATED);
		}
		return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	}
	
	@GetMapping("/{no}")
	public ResponseEntity<Product> getProductByNo(@PathVariable ("no")  int productNo ) {
		Product product = productService.getProductByNo(productNo);
		if(product == null) {
			return new ResponseEntity<Product>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Product>(product, HttpStatus.OK);
	}
	
	@PutMapping("/")
	public ResponseEntity<Product> getProductByNoFromParam(@RequestParam ("no") int productNo ) {
		Product product = productService.getProductByNo(productNo);
		if(product == null) {
			return new ResponseEntity<Product>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Product>(product, HttpStatus.OK);
	}
	
	@GetMapping(value="/products", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Product>> getAllProducts() {
		if(productService.getAllProducts() == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(productService.getAllProducts(), HttpStatus.OK);
	}
	
	@GetMapping("/update/{no}")
	public ResponseEntity updateProduct(@RequestBody Product p, @PathVariable("no") int productNo) {
		if(productService.updateProduct(productNo, p)) {
			return new ResponseEntity(HttpStatus.OK);
		}
		return new ResponseEntity(HttpStatus.NOT_FOUND);
	}
	
	//End point for delete a product
}
