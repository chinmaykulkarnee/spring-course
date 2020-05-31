package com.upgrad.course.repository;

import com.upgrad.course.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

// TODO: extend JpaRepository with correct parameters for entity and key
public interface ItemRepository extends JpaRepository<Item, Integer> {

    // TODO: override findAll method to return List instead of Iterable
    @Override
    List<Item> findAll();

    // TODO: define new method to find items by name
    List<Item> findByName(String name);
}
