package com.upgrad.course.library;

import com.upgrad.course.library.inventory.HistoryBooksInventory;
import com.upgrad.course.library.inventory.StudyBooksInventory;
import com.upgrad.course.library.sections.BookSection;
import com.upgrad.course.library.sections.HistorySection;
import com.upgrad.course.library.sections.StudySection;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

public class LibraryTest {

    @Test
    public void shouldReturnTotalBooksGivenDifferentTypeOfSections() {
        HistorySection historySection = new HistorySection(new HistoryBooksInventory());
        StudySection studySection = new StudySection(new StudyBooksInventory());
        ArrayList<BookSection> bookSections = new ArrayList<>();
        bookSections.add(historySection);
        bookSections.add(studySection);

        Library library = new Library(bookSections);

        Assert.assertEquals(5, library.getTotalBooks());
    }

    @Test
    public void shouldReturnTotalBooksGivenSameTypeOfSections() {
        StudySection studySection1 = new StudySection(new StudyBooksInventory());
        StudySection studySection2 = new StudySection(new StudyBooksInventory());
        ArrayList<BookSection> bookSections = new ArrayList<>();
        bookSections.add(studySection1);
        bookSections.add(studySection2);

        Library library = new Library(bookSections);

        Assert.assertEquals(4, library.getTotalBooks());
    }

    @Test
    public void shouldReturnTotalBooksAs0GivenNoSections() {
        Library library = new Library(Collections.emptyList());

        Assert.assertEquals(0, library.getTotalBooks());
    }
}