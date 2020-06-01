package com.upgrad.course.repository;

import com.upgrad.course.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Integer> {

    // TODO: override findAll method to return List instead of Iterable


    // TODO: define new method to find books by name
}
