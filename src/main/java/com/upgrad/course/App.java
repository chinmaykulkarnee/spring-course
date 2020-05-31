package com.upgrad.course;

import com.upgrad.course.entity.Product;
import com.upgrad.course.service.ProductService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class App {
    public static void main( String[] args ) {
        System.out.println( "Hello JPA!" );
    }

    ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
    ProductService productService = ctx.getBean(ProductService.class);

    public void addProduct(String name, Integer price) {
        productService.add(new Product(name, price));
    }

    public Product getProductDetails(String name) {
        return productService.getDetails(name);
    }

    public List<Product> getAllProducts() {
        return productService.listAll();
    }

    public void deleteAll() {
        productService.deleteAll();
    }
}
