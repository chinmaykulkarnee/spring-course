package com.upgrad.course;

import com.upgrad.course.library.Library;
import com.upgrad.course.library.inventory.HistoryBooksInventory;
import com.upgrad.course.library.inventory.StudyBooksInventory;
import com.upgrad.course.library.sections.HistorySection;
import com.upgrad.course.library.sections.NewsPaperSection;
import com.upgrad.course.library.sections.StudySection;

public class App {
    public static void main( String[] args ) {
        System.out.println( "Library Application!" );

        HistorySection historySection = new HistorySection(new HistoryBooksInventory());
        StudySection studySection = new StudySection(new StudyBooksInventory());
        NewsPaperSection newsPaperSection = new NewsPaperSection();

        Library library = new Library(historySection, studySection, newsPaperSection);
        System.out.println(library.getTotalBooks());
        System.out.println(library.getNewsPaper());
    }
}
