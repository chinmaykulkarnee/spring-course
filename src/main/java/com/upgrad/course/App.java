package com.upgrad.course;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
        ApplicationContext ctx = new ClassPathXmlApplicationContext( "beans.xml" );

        Employee employee = ctx.getBean(Employee.class);

        System.out.println(employee);
    }

    public Employee getEmployee() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext( "beans.xml" );
        return ctx.getBean(Employee.class);
    }
}
