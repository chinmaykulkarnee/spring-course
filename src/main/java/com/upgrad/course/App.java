package com.upgrad.course;

import com.upgrad.course.dao.StudentJDBCTemplate;
import com.upgrad.course.model.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class App {
    public static void main( String[] args ) {
        System.out.println( "Hello JDBC!" );
    }

    ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
    StudentJDBCTemplate studentJDBCTemplate = (StudentJDBCTemplate)context.getBean("studentJDBCTemplate");

    public int createStudent(String name, Integer age) {
        return studentJDBCTemplate.create(name, age);
    }

    public Student getStudentDetails(String name) {
        return studentJDBCTemplate.getStudent(name);
    }

    public int updateStudentAge(Integer id, Integer age) {
        return studentJDBCTemplate.update(id, age);
    }

    public int deleteStudent(Integer id) {
        return studentJDBCTemplate.delete(id);
    }

    public List<Student> getStudents() {
        return studentJDBCTemplate.listStudents();
    }

    public void deleteAll() {
        studentJDBCTemplate.deleteAll();
    }
}
