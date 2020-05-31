package com.upgrad.course;

import com.upgrad.course.entity.Product;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

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
}
