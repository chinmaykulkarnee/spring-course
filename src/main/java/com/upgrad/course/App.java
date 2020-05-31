package com.upgrad.course;

import com.upgrad.course.entity.Item;
import com.upgrad.course.entity.Order;
import com.upgrad.course.service.ItemService;
import com.upgrad.course.service.OrderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Optional;

public class App {
    public static void main( String[] args ) {
        System.out.println( "Hello JPA!" );
    }

    ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
    ItemService itemService = ctx.getBean(ItemService.class);
    OrderService orderService = ctx.getBean(OrderService.class);


    public void addOrder(String userId) {
        Order order = new Order(userId);
        orderService.add(order);
    }

    public void addItem(String name, Long price, Order order) {
        Item item = new Item(name, price);
        item.setOrder(order);
        itemService.add(item);
    }

    public Optional<Item> getItemDetail(String name) {
        return itemService.getDetails(name)
                .stream()
                .findFirst();
    }

    public Optional<Order> getOrderDetails(String userId) {
        return orderService.getDetailsByUserId(userId)
                .stream()
                .findFirst();
    }

    public List<Item> getAllItems() {
        return itemService.listAll();
    }

    public List<Order> getAllOrders() {
        return orderService.listAll();
    }

    public void deleteAllOrders() {
        orderService.deleteAll();
    }

    public void deleteAllItems() {
        itemService.deleteAll();
    }
}
