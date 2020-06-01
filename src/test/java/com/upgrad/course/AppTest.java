package com.upgrad.course;

import com.upgrad.course.entity.Item;
import com.upgrad.course.entity.Order;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Optional;

public class AppTest {

    App underTest = new App();

    @Before
    public void clean() {
        underTest.deleteAllItems();
        underTest.deleteAllOrders();
    }

    @Test
    public void shouldAddPersonAndPassportToDb() {
        underTest.addOrder("Harry");

        Optional<Order> mayBeOrder = underTest.getOrderDetails("Harry");
        Assert.assertTrue(mayBeOrder.isPresent());
        Order order = mayBeOrder.get();
        Assert.assertEquals("Harry", order.getUserId());

        underTest.addItem("Cake", 20L, order);
        Optional<Item> mayBeItem = underTest.getItemDetail("Cake");
        Assert.assertTrue(mayBeItem.isPresent());
        Item item = mayBeItem.get();
        Assert.assertEquals("Cake", item.getName());
        Assert.assertEquals(20, (long) item.getPrice());

        Optional<Order> mayBeOrderAfter = underTest.getOrderDetails("Harry");
        Assert.assertTrue(mayBeOrderAfter.isPresent());
        Order orderWithItem = mayBeOrderAfter.get();
        Assert.assertTrue(orderWithItem.getItems().contains(new Item("Cake", 20L)));
    }
}
