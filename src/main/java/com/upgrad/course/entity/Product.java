package com.upgrad.course.entity;

import javax.persistence.*;

@Entity
// TODO: define 2 named queries using @NamedQueries and @NamedQuery annotations
// 1. query for findAll products
// 2. query for findByName product
public class Product {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private Integer price;

    public Product() {
        //Default constructor needed for JPA.
    }

    public Product(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
    }
}
