package com.upgrad.course.library.inventory;

// TODO: Implement interface to remove tight coupling
public class StudyBooksInventory implements BookInventory {

    String [] books = {"book1", "book2"};

    @Override
    public String[] getBooks() {
        return books;
    }
}
