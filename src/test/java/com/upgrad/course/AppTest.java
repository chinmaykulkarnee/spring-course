package com.upgrad.course;

import com.upgrad.course.entity.Product;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Optional;

public class AppTest {

    App underTest = new App();

    @Before
    public void clean() {
        underTest.deleteAll();
    }

    @Test
    public void shouldAddProductToDb() {
        underTest.addProduct("Ice-cream", 10);

        Optional<Product> mayBeProduct = underTest.getProductDetails("Ice-cream");
        Assert.assertTrue(mayBeProduct.isPresent());
        Product product = mayBeProduct.get();
        Assert.assertSame(10, product.getPrice());
        Assert.assertEquals("Ice-cream", product.getName());
    }

    @Test
    public void shouldGetProductDetailsFromDb() {
        underTest.addProduct("Chocolate", 2);

        Optional<Product> mayBeProduct = underTest.getProductDetails("Chocolate");

        Assert.assertTrue(mayBeProduct.isPresent());
        Product product = mayBeProduct.get();
        Assert.assertSame(2, product.getPrice());
        Assert.assertEquals("Chocolate", product.getName());
    }

    @Test
    public void shouldGetAllProductsFromDb() {
        underTest.addProduct("Candy", 1);
        underTest.addProduct("Cake", 25);

        List<Product> products = underTest.getAllProducts();

        Assert.assertSame(2, products.size());
        Assert.assertTrue(products.contains(new Product("Candy", 1)));
        Assert.assertTrue(products.contains(new Product("Cake", 25)));
    }

    @Test
    public void shouldGetProductsWithPriceGreaterThanSomePriceFromDb() {
        underTest.addProduct("Candy", 1);
        underTest.addProduct("Bread", 10);
        underTest.addProduct("Cake", 25);

        List<Product> products = underTest.getProductsWithPriceGreaterThan(8);

        Assert.assertSame(2, products.size());
        Assert.assertTrue(products.contains(new Product("Bread", 10)));
        Assert.assertTrue(products.contains(new Product("Cake", 25)));
    }
}
