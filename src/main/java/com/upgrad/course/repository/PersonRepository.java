package com.upgrad.course.repository;

import com.upgrad.course.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonRepository extends JpaRepository<Person, Integer> {

    // TODO: override findAll method to return List instead of Iterable

    // TODO: define new method to find persons by first name
}
