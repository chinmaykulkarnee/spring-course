package com.upgrad.course.library;

import com.upgrad.course.library.sections.HistorySection;
import com.upgrad.course.library.sections.NewsPaperSection;
import com.upgrad.course.library.sections.StudySection;

public class Library {

    // TODO: Add a constructor

    // TODO: Library class is tightly coupled with HistorySection and StudySection
    // Make it loosely coupled by using principle of dependency injection
    public int getTotalBooks() {
        HistorySection historySection = new HistorySection();
        StudySection studySection = new StudySection();

        return historySection.getTotalBooks() + studySection.getTotalBooks();
    }

    // TODO: Library class is tightly coupled with NewsPaperSection
    // Make it loosely coupled by using principle of dependency injection
    public String getNewsPaper() {
        NewsPaperSection newsPaperSection = new NewsPaperSection();

        return newsPaperSection.getNewsPaper(1);
    }
}
