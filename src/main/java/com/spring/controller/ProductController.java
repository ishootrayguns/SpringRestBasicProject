package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.spring.model.Product;
import com.spring.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	//End point
	@GetMapping("/")
	public String welcome() {
		return "Hello from Spring Rest";
	}
	
	@PutMapping(value = "/addproduct", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity addNewProduct(@RequestBody Product p, UriComponentsBuilder ucBuilder) {
		if(productService.addProduct(p)) {
			return new ResponseEntity<>(HttpStatus.CREATED);
		}
		return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	}
	
	@GetMapping(value="/products", produces = "application/json")
	public ResponseEntity<List<Product>> getAllProducts() {
		if(productService.getAllProducts() == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(productService.getAllProducts(), HttpStatus.OK);
	}
}
