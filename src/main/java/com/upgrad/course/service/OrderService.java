package com.upgrad.course.service;

import com.upgrad.course.entity.Order;
import com.upgrad.course.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;

@Component
public class OrderService {

    private final OrderRepository orderRepository;

    @Autowired
    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Transactional
    public void add(Order order) {
        orderRepository.save(order);
    }

    @Transactional
    public List<Order> listAll() {
        return orderRepository.findAll();
    }

    @Transactional
    public List<Order> getDetailsByUserId(String userId) {
        return orderRepository.findByUserId(userId);
    }

    @Transactional
    public void deleteAll() {
        orderRepository.deleteAllInBatch();
    }
}
