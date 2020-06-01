package com.upgrad.course.dao;

import com.upgrad.course.entity.Product;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Component
public class ProductDao {

    // TODO: Inject EntityManager using special annotation @PersistenceContext
    @PersistenceContext
    private EntityManager em;

    // TODO: use Transactional annotation to allow operation with EntityManager
    @Transactional
    // TODO: use EntityManager method to save product to database
    public void persist(Product product) {
        em.persist(product);
    }

    // TODO: use Transactional annotation to allow operation with EntityManager
    @Transactional
    // TODO: use EntityManager createNamedQuery method to get product by name from the database
    public Product find(String name) {
        TypedQuery<Product> query = em.createNamedQuery("Product.findByName", Product.class);
        return query
                .setParameter("name", name)
                .getSingleResult();
    }

    // TODO: use Transactional annotation to allow operation with EntityManager
    @Transactional
    // TODO: use EntityManager createNamedQuery method to get products from the database
    public List<Product> findAll() {
        TypedQuery<Product> query = em.createNamedQuery("Product.findAll", Product.class);
        return query.getResultList();
    }

    @Transactional
    public void deleteAll() {
        em.createQuery("DELETE FROM Product")
                .executeUpdate();
    }
}
