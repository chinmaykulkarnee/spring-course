package com.upgrad.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;

// TODO: extend JpaRepository with correct parameters for entity and key
public interface ItemRepository extends JpaRepository<> {

    // TODO: override findAll method to return List instead of Iterable

    // TODO: define new method to find items by name
}
