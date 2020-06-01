package com.upgrad.course;

import com.upgrad.course.entity.Product;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class AppTest {

    App underTest = new App();

    @Before
    public void clean() {
        underTest.deleteAll();
    }

    @Test
    public void shouldAddProductToDb() {
        underTest.addProduct("Ice-cream", 10);

        Product product = underTest.getProductDetails("Ice-cream");
        Assert.assertSame(10, product.getPrice());
        Assert.assertEquals("Ice-cream", product.getName());
    }

    @Test
    public void shouldGetProductDetailsFromDb() {
        underTest.addProduct("Chocolate", 2);

        Product product = underTest.getProductDetails("Chocolate");

        Assert.assertSame(2, product.getPrice());
        Assert.assertEquals("Chocolate", product.getName());
    }
}
