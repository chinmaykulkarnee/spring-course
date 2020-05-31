package com.upgrad.course.dao;

import com.upgrad.course.model.Student;

import java.util.List;
import javax.sql.DataSource;

public interface StudentDAO {

    void setDataSource(DataSource ds);

    int create(String name, Integer age);

    Student getStudent(String name);

    List<Student> listStudents();

    int delete(Integer id);

    int update(Integer id, Integer age);

    void deleteAll();
}
