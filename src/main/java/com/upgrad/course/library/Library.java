package com.upgrad.course.library;

import com.upgrad.course.library.sections.BookSection;

import java.util.List;

public class Library {

    private List<BookSection> sections;

    // TODO: Add a constructor to have list of sections as a parameter
    public Library(List<BookSection> sections) {
        this.sections = sections;
    }

    // TODO: Library class is tightly coupled with HistorySection and StudySection
    //  Make it loosely coupled by using principle of dependency injection
    //  Note: Use sections list to calculate the total books across all the sections
    public int getTotalBooks() {
        int total = 0;
        for (BookSection section : sections) {
            total += section.getTotalBooks();
        }
        return total;
    }
}
