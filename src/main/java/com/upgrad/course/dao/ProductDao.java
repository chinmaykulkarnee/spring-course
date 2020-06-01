package com.upgrad.course.dao;

import com.upgrad.course.entity.Product;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@Component
public class ProductDao {

    // TODO: Inject EntityManager using special annotation @PersistenceContext
    private EntityManager em;

    // TODO: use Transactional annotation to allow operation with EntityManager
    // TODO: use EntityManager method to save product to database
    public void persist(Product product) {

    }

    // TODO: use Transactional annotation to allow operation with EntityManager
    // TODO: use EntityManager createNamedQuery method to get product by name from the database
    public Product find(String name) {
        return null;
    }

    // TODO: use Transactional annotation to allow operation with EntityManager
    // TODO: use EntityManager createNamedQuery method to get products from the database
    public List<Product> findAll() {
        return null;
    }

    @Transactional
    public void deleteAll() {
        em.createQuery("DELETE FROM Product")
                .executeUpdate();
    }
}
