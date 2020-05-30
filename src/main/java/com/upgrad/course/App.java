package com.upgrad.course;

import com.upgrad.course.school.DivisionB;
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
        DivisionB divisionB = (DivisionB) context.getBean("divisionB");
        return divisionB.getStudents();
    }

    public int getDivisionBBenchCount() {
        DivisionB divisionB = (DivisionB) context.getBean("divisionB");
        return divisionB.getBenchCount();
    }

    public Teacher getTeacher() {
        DivisionB divisionB = (DivisionB) context.getBean("divisionB");
        return divisionB.getTeacher();
    }
}
