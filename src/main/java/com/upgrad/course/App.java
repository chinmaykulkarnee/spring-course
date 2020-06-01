package com.upgrad.course;

import com.upgrad.course.dao.ProductDao;
import com.upgrad.course.entity.Product;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class App {
    public static void main( String[] args ) {
        System.out.println( "Hello JPA!" );
    }

    ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
    ProductDao productDao = ctx.getBean(ProductDao.class);

    public void addProduct(String name, Integer price) {
        productDao.persist(new Product(name, price));
    }

    public Product getProductDetails(String name) {
        return productDao.find(name);
    }

    public List<Product> getAllProducts() {
        return productDao.findAll();
    }

    public void deleteAll() {
        productDao.deleteAll();
    }
}
