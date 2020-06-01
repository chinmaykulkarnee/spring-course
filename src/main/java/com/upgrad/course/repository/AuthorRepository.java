package com.upgrad.course.repository;

import com.upgrad.course.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Integer> {
    Optional<Author> findByRegistrationNumber(Long registrationNumber);
}
