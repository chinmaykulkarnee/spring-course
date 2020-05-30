package com.upgrad.course.library.sections;

import com.upgrad.course.library.inventory.StudyBooksInventory;

public class StudySection {

    // TODO: Add a constructor

    // TODO: StudySection class is tightly coupled with StudyBooksInventory
    // Make it loosely coupled by using principle of dependency injection
    public int getTotalBooks() {
        StudyBooksInventory studyBooksInventory = new StudyBooksInventory();
        return studyBooksInventory.getBooks().length;
    }
}
