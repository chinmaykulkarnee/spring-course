package com.upgrad.course;

import com.upgrad.course.entity.Item;
import com.upgrad.course.entity.Order;
import com.upgrad.course.repository.ItemRepository;
import com.upgrad.course.repository.OrderRepository;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Optional;

public class App {
    public static void main( String[] args ) {
        System.out.println( "Hello JPA!" );
    }

    ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
    ItemRepository itemRepository = ctx.getBean(ItemRepository.class);
    OrderRepository orderRepository = ctx.getBean(OrderRepository.class);


    public void addOrder(String userId) {
        Order order = new Order(userId);
        orderRepository.save(order);
    }

    public void addItem(String name, Long price, Order order) {
        Item item = new Item(name, price);
        item.setOrder(order);
        itemRepository.save(item);
    }

    public Optional<Item> getItemDetail(String name) {
        return itemRepository.findByName(name)
                .stream()
                .findFirst();
    }

    public Optional<Order> getOrderDetails(String userId) {
        return orderRepository.findByUserId(userId)
                .stream()
                .findFirst();
    }

    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    public void deleteAllOrders() {
        orderRepository.deleteAll();
    }

    public void deleteAllItems() {
        itemRepository.deleteAll();
    }
}