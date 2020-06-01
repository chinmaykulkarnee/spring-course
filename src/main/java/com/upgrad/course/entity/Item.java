package com.upgrad.course.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Item {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private Long price;

    // TODO: add correct annotation for many-to-one mapping
    // TODO: add correct annotation for setting up join column giving it custom name as "order_id" and do not allow null values
    private Order order;

    public Item() {
        //Default constructor needed for JPA.
    }

    public Item(String name, Long price) {
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

    public void setName(String number) {
        this.name = number;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "Item [id=" + id + ", number=" + name + ", price=" + price + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Objects.equals(name, item.name) &&
                Objects.equals(price, item.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}
