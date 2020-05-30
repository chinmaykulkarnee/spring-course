package com.upgrad.course;

import com.upgrad.course.school.ClassA;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

    public String getStudentDetails() {
        ClassA classA = (ClassA) context.getBean("classA");
        return classA.getStudentDetails();
    }

    public String getTeacherDetails() {
        ClassA classA = (ClassA) context.getBean("classA");
        return classA.getTeacherDetails();
    }

    public String getBenchType() {
        ClassA classA = (ClassA) context.getBean("classA");
        return classA.getBenchType();
    }
}
