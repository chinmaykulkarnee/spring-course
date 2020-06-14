package com.upgrad.course.library.sections;

import com.upgrad.course.library.inventory.HistoryBooksInventory;

// TODO: Define and Implement interface BookSection to remove tight coupling
//  Note: Make sure to name the interface as BookSection otherwise tests will fail
public class HistorySection {

    // TODO: Add a constructor with inventory interface parameter

    // TODO: HistorySection class is tightly coupled with HistoryBooksInventory
    //  Make it loosely coupled by using principle of dependency injection and use of interface
    public int getTotalBooks() {
        HistoryBooksInventory historyBooksInventory = new HistoryBooksInventory();
        return historyBooksInventory.getBooks().length;
    }
}
