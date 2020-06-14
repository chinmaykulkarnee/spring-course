package com.upgrad.course.library.sections;

import com.upgrad.course.library.inventory.StudyBooksInventory;

// TODO: Define and Implement interface to remove tight coupling
//  Note: Make sure to name the interface as BookSection otherwise tests will fail
public class StudySection {

    // TODO: Add a constructor with inventory interface parameter

    // TODO: StudySection class is tightly coupled with StudyBooksInventory
    //  Make it loosely coupled by using principle of dependency injection
    public int getTotalBooks() {
        StudyBooksInventory studyBooksInventory = new StudyBooksInventory();
        return studyBooksInventory.getBooks().length;
    }
}
