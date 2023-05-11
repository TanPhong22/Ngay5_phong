package com.Ngay3.Ngay3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Ngay3.Ngay3.model.Product;
import com.Ngay3.Ngay3.model.ProductRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class ProductService {
	@Autowired
	private ProductRepository productRepository;
	public List<Product> findAll(){
		return productRepository.findAll();
	}
	public Product get(Integer ID) {
		return productRepository.findById(ID).get();
	}
}
