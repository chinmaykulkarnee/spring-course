package com.upgrad.course.repository;

import com.upgrad.course.entity.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BookRepository extends JpaRepository<Book, Integer> {

    // TODO: define query using @Query annotation to select books in the order of descending price
    @Query(value = "SELECT b FROM Book b ORDER BY b.price DESC")
    // TODO: update this method to return books with paginated request and response
    Page<Book> findAllBooksWithPagination(Pageable pageable);
}
