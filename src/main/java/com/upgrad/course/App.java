package com.upgrad.course;

import com.upgrad.course.entity.Product;
import com.upgrad.course.service.ProductService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Optional;

public class App {
    public static void main( String[] args ) {
        System.out.println( "Hello JPA!" );
    }

    ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
    ProductService productService = ctx.getBean(ProductService.class);

    public void addProduct(String name, Integer price) {
        productService.add(new Product(name, price));
    }

    public Optional<Product> getProductDetails(String name) {
        return productService.getDetails(name)
                .stream()
                .findFirst();
    }

    public List<Product> getAllProducts() {
        return productService.listAll();
    }

    public List<Product> getProductsWithPriceGreaterThan(Integer price) {
        return productService.getProductsByPriceGreaterThan(price);
    }

    public void deleteAll() {
        productService.deleteAll();
    }
}
