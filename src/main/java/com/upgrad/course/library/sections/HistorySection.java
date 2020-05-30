package com.upgrad.course.library.sections;

import com.upgrad.course.library.inventory.HistoryBooksInventory;

public class HistorySection {

    // TODO: Add a constructor

    // TODO: HistorySection class is tightly coupled with HistoryBooksInventory
    // Make it loosely coupled by using principle of dependency injection
    public int getTotalBooks() {
        HistoryBooksInventory historyBooksInventory = new HistoryBooksInventory();
        return historyBooksInventory.getBooks().length;
    }
}
