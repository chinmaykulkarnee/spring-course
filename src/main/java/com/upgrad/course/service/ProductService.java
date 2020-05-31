package com.upgrad.course.service;

import com.upgrad.course.entity.Product;
import com.upgrad.course.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;

@Component
public class ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    // TODO: implement method to save product to the database
    @Transactional
    public void add(Product product) {
    }

    // TODO: implement method to get all the products from the database
    @Transactional
    public List<Product> listAll() {
    }

    // TODO: implement method to get details of the product by name from the database
    @Transactional
    public List<Product> getDetails(String name) {
    }

    // TODO: implement method to get list of products greater than given price from the database
    @Transactional
    public List<Product> getProductsByPriceGreaterThan(Integer price) {
    }

    @Transactional
    public void deleteAll() {
        productRepository.deleteAll();
    }
}
