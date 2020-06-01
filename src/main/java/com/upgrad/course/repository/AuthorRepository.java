package com.upgrad.course.repository;

import com.upgrad.course.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AuthorRepository extends JpaRepository<Author, Integer> {

    // TODO: define query using @Query annotation to find authors by matching partial name
    @Query("SELECT u FROM Author u WHERE u.name like %:partialName%")
    List<Author> findByNameLike(@Param("partialName") String partialName);

    // TODO: define native query using @Query annotation to find authors with matching registration numbers from given list
    @Query(
            value = "SELECT * FROM Author u WHERE u.registrationNumber IN :registrationNumbers",
            nativeQuery = true
    )
    List<Author> findByRegistrationNumberList(@Param("registrationNumbers") List<Long> registrationNumbers);
}
