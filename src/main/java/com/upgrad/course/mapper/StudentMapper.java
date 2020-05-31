package com.upgrad.course.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.upgrad.course.model.Student;
import org.springframework.jdbc.core.RowMapper;

public class StudentMapper implements RowMapper {
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
        Student student = new Student();

        // TODO: map id, name, age fields using ResultSet
        student.setId(rs.getInt("id"));
        student.setName(rs.getString("name"));
        student.setAge(rs.getInt("age"));

        return student;
    }
}
