package com.upgrad.course;

import com.upgrad.course.bakery.OnlineBakery;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
    }

    public OnlineBakery setUpOnlineBakery() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        return (OnlineBakery) context.getBean("onlineBakery");
    }
}
