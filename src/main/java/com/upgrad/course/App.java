package com.upgrad.course;

import com.upgrad.course.entity.Product;
import com.upgrad.course.repository.ProductRepository;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Optional;

public class App {
    public static void main( String[] args ) {
        System.out.println( "Hello JPA!" );
    }

    ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
    ProductRepository productRepository = ctx.getBean(ProductRepository.class);

    public void addProduct(String name, Integer price) {
        productRepository.save(new Product(name, price));
    }

    public Optional<Product> getProductDetails(String name) {
        return productRepository.findByName(name)
                .stream()
                .findFirst();
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public List<Product> getProductsWithPriceGreaterThan(Integer price) {
        return productRepository.findByPriceGreaterThan(price);
    }

    public void deleteAll() {
        productRepository.deleteAll();
    }
}
