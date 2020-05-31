package com.upgrad.course.service;


import java.util.Collection;
import java.util.List;

import com.upgrad.course.dao.ProductDao;
import com.upgrad.course.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Component
public class ProductService {

    private final ProductDao productDao;

    // TODO: autowire ProductDao
    public ProductService(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Transactional
    public void add(Product product) {
        productDao.persist(product);
    }

    public void addAll(Collection<Product> products) {
        for (Product product : products) {
            productDao.persist(product);
        }
    }

    public List<Product> listAll() {
        return productDao.findAll();
    }

    public Product getDetails(String name) {
        return productDao.find(name);
    }

    public void deleteAll() {
        productDao.deleteAll();
    }
}
