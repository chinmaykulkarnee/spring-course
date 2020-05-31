package com.upgrad.course.dao;

import com.upgrad.course.model.Student;

import java.util.List;

public interface StudentDAO {

    int create(String name, Integer age);

    Student getStudent(String name);

    List<Student> listStudents();

    int delete(Integer id);

    int update(Integer id, Integer age);

    void deleteAll();
}
