package com.upgrad.course;

import com.upgrad.course.juice.BananaJuice;
import com.upgrad.course.juice.OrangeJuice;
import com.upgrad.course.juice.StrawberryJuice;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
    }

    public String getOrangeJuice() {
        OrangeJuice orangeJuice = (OrangeJuice) context.getBean("orangeJuice");
        return orangeJuice.get();
    }

    public String getStrawberryJuice() {
        StrawberryJuice orangeJuice = (StrawberryJuice) context.getBean("strawberryJuice");
        return orangeJuice.get();
    }

    public String getBananaJuice() {
        BananaJuice orangeJuice = (BananaJuice) context.getBean("bananaJuice");
        return orangeJuice.get();
    }
}
