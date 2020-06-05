package com.upgrad.course;

import com.upgrad.course.school.OnlineClassroom;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

    public String getStudentDetails() {
        OnlineClassroom onlineClassroom = context.getBean(OnlineClassroom.class);
        return onlineClassroom.getStudentDetails();
    }

    public String getTeacherDetails() {
        OnlineClassroom onlineClassroom = context.getBean(OnlineClassroom.class);
        return onlineClassroom.getTeacherDetails();
    }

    public String getBenchType() {
        OnlineClassroom onlineClassroom = context.getBean(OnlineClassroom.class);
        return onlineClassroom.getBenchType();
    }
}
