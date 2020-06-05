package com.upgrad.course;

import com.upgrad.course.school.Classroom;
import com.upgrad.course.school.Student;
import com.upgrad.course.school.Teacher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Set;

public class App {
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
    }

    ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

    public Set<Student> getDivisionBStudents() {
        Classroom classroom = (Classroom) context.getBean("classroom");
        return classroom.getStudents();
    }

    public int getDivisionBBenchCount() {
        Classroom classroom = (Classroom) context.getBean("classroom");
        return classroom.getBenchCount();
    }

    public Teacher getTeacher() {
        Classroom classroom = (Classroom) context.getBean("classroom");
        return classroom.getTeacher();
    }
}
