package com.upgrad.course.repository;

import com.upgrad.course.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Integer> {

    // TODO: override findAll method to return List instead of Iterable
    @Override
    List<Order> findAll();

    // TODO: define new method to find orders by userId
    List<Order> findByUserId(String userId);
}
