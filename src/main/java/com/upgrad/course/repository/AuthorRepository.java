package com.upgrad.course.repository;

import com.upgrad.course.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

// TODO: extend JpaRepository with correct parameters for entity and key
public interface AuthorRepository extends JpaRepository<Author, Integer> {

    // TODO: override findAll method to return List instead of Iterable
    @Override
    List<Author> findAll();

    // TODO: define new method to find authors by name
    List<Author> findByName(String name);
}
