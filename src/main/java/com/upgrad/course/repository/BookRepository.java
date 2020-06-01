package com.upgrad.course.repository;

import com.upgrad.course.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
    Optional<Book> findBookByName(String name);
}
