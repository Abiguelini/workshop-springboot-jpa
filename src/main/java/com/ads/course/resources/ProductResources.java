package com.ads.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ads.course.entities.Product;
import com.ads.course.services.ProductService;

@RestController
@RequestMapping(value = "/producties")

public class ProductResources {

	@Autowired
	private ProductService service;

	@GetMapping
	public ResponseEntity<List<Product>> findALl() {
		List<Product> list = service.findAll();
		return ResponseEntity.ok().body(list);

	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Product> findById(@PathVariable Integer id) {
		Product obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
