package com.upgrad.course;

import com.upgrad.course.juice.Juice;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
    }

    public String getOrangeJuice() {
        Juice orangeJuice = (Juice) context.getBean("orangeJuice");
        return orangeJuice.get();
    }

    public String getStrawberryJuice() {
        Juice strawberryJuice = (Juice) context.getBean("strawberryJuice");
        return strawberryJuice.get();
    }

    public String getBananaJuice() {
        Juice bananaJuice = (Juice) context.getBean("bananaJuice");
        return bananaJuice.get();
    }
}
