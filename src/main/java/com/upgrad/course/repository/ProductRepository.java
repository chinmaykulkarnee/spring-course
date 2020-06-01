package com.upgrad.course.repository;

import com.upgrad.course.entity.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

// TODO: define ProductRepository extending CrudRepository with appropriate parameters for entity and key
public interface ProductRepository extends CrudRepository<Product, Integer> {

    // TODO: define new method to find products by name
    List<Product> findByName(String name);

    // TODO: define new method to find products by price greater than given price
    List<Product> findByPriceGreaterThan(Integer price);

    // TODO: override existing findAll method to return List instead of Iterable
    @Override
    List<Product> findAll();
}
