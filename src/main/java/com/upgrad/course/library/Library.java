package com.upgrad.course.library;

import com.upgrad.course.library.sections.HistorySection;
import com.upgrad.course.library.sections.StudySection;

public class Library {

    // TODO: Add a constructor to have list of sections as a parameter

    // TODO: Library class is tightly coupled with HistorySection and StudySection
    //  Make it loosely coupled by using principle of dependency injection
    //  Note: Use sections list to calculate the total books across all the sections
    public int getTotalBooks() {
        StudySection studySection = new StudySection();
        HistorySection historySection = new HistorySection();
        return studySection.getTotalBooks() + historySection.getTotalBooks();
    }
}
