package com.upgrad.course.library.inventory;

// TODO: Implement interface to remove tight coupling
public class HistoryBooksInventory implements BookInventory {

    String [] books = {"book1", "book2", "book3"};

    @Override
    public String[] getBooks() {
        return books;
    }
}
