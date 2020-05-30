package com.upgrad.course.library.sections;

import com.upgrad.course.library.inventory.StudyBooksInventory;

public class StudySection {

    private StudyBooksInventory studyBooksInventory;

    // TODO: Add a constructor
    public StudySection(StudyBooksInventory studyBooksInventory) {
        this.studyBooksInventory = studyBooksInventory;
    }

    // TODO: StudySection class is tightly coupled with StudyBooksInventory
    // Make it loosely coupled by using principle of dependency injection
    public int getTotalBooks() {
        return this.studyBooksInventory.getBooks().length;
    }
}
