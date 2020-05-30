package com.upgrad.course.library.sections;

import com.upgrad.course.library.inventory.HistoryBooksInventory;

public class HistorySection {

    private HistoryBooksInventory historyBooksInventory;

    // TODO: Add a constructor
    public HistorySection(HistoryBooksInventory historyBooksInventory) {
        this.historyBooksInventory = historyBooksInventory;
    }

    // TODO: HistorySection class is tightly coupled with HistoryBooksInventory
    // Make it loosely coupled by using principle of dependency injection
    public int getTotalBooks() {
        return this.historyBooksInventory.getBooks().length;
    }
}
