package com.upgrad.course.library.sections;

import com.upgrad.course.library.inventory.BookInventory;

// TODO: Implement interface to remove tight coupling
public class HistorySection implements BookSection {

    private BookInventory historyBooksInventory;

    // TODO: Add a constructor with inventory interface parameter
    public HistorySection(BookInventory historyBooksInventory) {
        this.historyBooksInventory = historyBooksInventory;
    }

    // TODO: HistorySection class is tightly coupled with HistoryBooksInventory
    //  Make it loosely coupled by using principle of dependency injection and use of interface
    @Override
    public int getTotalBooks() {
        return this.historyBooksInventory.getBooks().length;
    }
}
