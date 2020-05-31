package com.upgrad.course.dao;

import com.upgrad.course.mapper.StudentMapper;
import com.upgrad.course.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.List;

// TODO: mark class for component auto scanning
@Component
public class StudentJDBCTemplate implements StudentDAO {
    private JdbcTemplate jdbcTemplateObject;

    // TODO: autowire datasource bean using setter injection
    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplateObject = new JdbcTemplate(dataSource);
    }

    public int create(String name, Integer age) {
        String SQL = "insert into Student (name, age) values (?, ?)";
        return jdbcTemplateObject.update( SQL, new Object[]{name, age});
    }

    // TODO: implement getStudent method which takes name parameter using jdbcTemplateObject
    public Student getStudent(String name) {
        String SQL = "select * from Student where name = ?";
        return (Student) jdbcTemplateObject.queryForObject(SQL, new Object[]{name}, new StudentMapper());
    }

    public List<Student> listStudents() {
        String SQL = "select * from Student";
        List <Student> students = jdbcTemplateObject.query(SQL, new StudentMapper());
        return students;
    }

    // TODO: implement delete method using jdbcTemplateObject (hint: refer create method)
    public int delete(Integer id) {
        String SQL = "delete from Student where id = ?";
        return jdbcTemplateObject.update(SQL, new Object[]{id});
    }

    // TODO: implement update method using jdbcTemplateObject (hint: refer create method)
    public int update(Integer id, Integer age){
        String SQL = "update Student set age = ? where id = ?";
        return jdbcTemplateObject.update(SQL, new Object[]{age,id});
    }

    public void deleteAll() {
        String SQL = "delete from Student";
        jdbcTemplateObject.update(SQL);
    }
}
