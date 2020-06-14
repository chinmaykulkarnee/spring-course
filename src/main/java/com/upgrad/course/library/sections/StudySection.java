package com.upgrad.course.library.sections;

import com.upgrad.course.library.inventory.BookInventory;

// TODO: Implement interface to remove tight coupling
public class StudySection implements BookSection {

    private BookInventory studyBooksInventory;

    // TODO: Add a constructor with inventory interface parameter
    public StudySection(BookInventory studyBooksInventory) {
        this.studyBooksInventory = studyBooksInventory;
    }

    // TODO: StudySection class is tightly coupled with StudyBooksInventory
    //  Make it loosely coupled by using principle of dependency injection
    @Override
    public int getTotalBooks() {
        return this.studyBooksInventory.getBooks().length;
    }
}
