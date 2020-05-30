package com.upgrad.course.library;

import com.upgrad.course.library.sections.HistorySection;
import com.upgrad.course.library.sections.NewsPaperSection;
import com.upgrad.course.library.sections.StudySection;

public class Library {

    private HistorySection historySection;
    private StudySection studySection;
    private NewsPaperSection newsPaperSection;

    // TODO: Add a constructor
    public Library(HistorySection historySection, StudySection studySection, NewsPaperSection newsPaperSection) {
        this.historySection = historySection;
        this.studySection = studySection;
        this.newsPaperSection = newsPaperSection;
    }

    // TODO: Library class is tightly coupled with HistorySection and StudySection
    // Make it loosely coupled by using principle of dependency injection
    public int getTotalBooks() {
        return this.historySection.getTotalBooks() + this.studySection.getTotalBooks();
    }

    // TODO: Library class is tightly coupled with NewsPaperSection
    // Make it loosely coupled by using principle of dependency injection
    public String getNewsPaper() {
        return this.newsPaperSection.getNewsPaper(1);
    }
}
