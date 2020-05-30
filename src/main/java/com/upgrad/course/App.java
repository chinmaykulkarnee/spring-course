package com.upgrad.course;

import com.upgrad.course.library.Library;

public class App {
    public static void main( String[] args ) {
        System.out.println( "Library Application!" );

        Library library = new Library();
        System.out.println(library.getTotalBooks());
        System.out.println(library.getNewsPaper());
    }
}
