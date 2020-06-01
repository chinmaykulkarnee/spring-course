package com.upgrad.course.dao;

import com.upgrad.course.entity.Product;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Component
public class ProductDao {

    // TODO: Inject EntityManager using special annotation @PersistenceContext
    private EntityManager em;

    // TODO: use EntityManager method to save product to database
    @Transactional
    public void persist(Product product) {
    }

    // TODO: use EntityManager method to get product by name from the database (hint: use query parameters as ?1)
    public Product find(String name) {
        return null;
    }

    // TODO: use EntityManager method to get products from the database
    public List<Product> findAll() {
        return null;
    }

    @Transactional
    public void deleteAll() {
        em.createQuery("DELETE FROM Product")
                .executeUpdate();
    }
}
