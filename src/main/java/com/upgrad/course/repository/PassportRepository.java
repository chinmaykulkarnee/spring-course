package com.upgrad.course.repository;

import com.upgrad.course.entity.Passport;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

// TODO: extend JpaRepository with correct parameters for entity and key
public interface PassportRepository extends JpaRepository<> {

    // TODO: override findAll method to return List instead of Iterable

    // TODO: define new method to find passports by number
}
