package com.upgrad.course.dao;

import com.upgrad.course.mapper.StudentMapper;
import com.upgrad.course.model.Student;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

// TODO: mark class for component auto scanning
public class StudentJDBCTemplate implements StudentDAO {
    private JdbcTemplate jdbcTemplateObject;

    // TODO: autowire datasource bean using setter injection and initialize jdbcTemplateObject

    public int create(String name, Integer age) {
        String SQL = "insert into Student (name, age) values (?, ?)";
        return jdbcTemplateObject.update( SQL, new Object[]{name, age});
    }

    // TODO: implement getStudent method which takes name parameter using jdbcTemplateObject
    public Student getStudent(String name) {
        return null;
    }

    public List<Student> listStudents() {
        String SQL = "select * from Student";
        List <Student> students = jdbcTemplateObject.query(SQL, new StudentMapper());
        return students;
    }

    // TODO: implement delete method using jdbcTemplateObject (hint: refer create method)
    public int delete(Integer id) {
        return -1;
    }

    // TODO: implement update method using jdbcTemplateObject (hint: refer create method)
    public int update(Integer id, Integer age){
        return -1;
    }

    public void deleteAll() {
        String SQL = "delete from Student";
        jdbcTemplateObject.update(SQL);
    }
}
