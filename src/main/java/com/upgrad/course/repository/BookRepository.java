package com.upgrad.course.repository;

import com.upgrad.course.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Integer> {

    // TODO: define query using @Query annotation to select books in the order of descending price
    // TODO: update this method to return books with paginated request and response
    List<Book> findAllBooksWithPagination();
}
