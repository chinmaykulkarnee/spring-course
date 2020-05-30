package com.upgrad.course;

import org.springframework.context.ApplicationContext;

public class App {
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
    }

    // TODO: change return type of method to return Employee
    public Object getEmployee() {

        // TODO: initialize ApplicationContext to read bean definitions from beans.xml using ClassPathXmlApplicationContext
        ApplicationContext ctx = null;

        // TODO: get bean of Employee class using ApplicationContext
        ctx.getBean(Object.class);

        // TODO: return bean of Employee class
        return null;
    }
}
