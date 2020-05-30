package com.upgrad.course.library;

import com.upgrad.course.library.inventory.HistoryBooksInventory;
import com.upgrad.course.library.inventory.StudyBooksInventory;
import com.upgrad.course.library.sections.HistorySection;
import com.upgrad.course.library.sections.NewsPaperSection;
import com.upgrad.course.library.sections.StudySection;
import org.junit.Assert;
import org.junit.Test;

public class LibraryTest {

    @Test
    public void libraryShouldBeLooselyCoupledFromItsDependencies() {
        HistorySection historySection = new HistorySection(new HistoryBooksInventory());
        StudySection studySection = new StudySection(new StudyBooksInventory());
        NewsPaperSection newsPaperSection = new NewsPaperSection();

        Library library = new Library(historySection, studySection, newsPaperSection);

        Assert.assertEquals(6, library.getTotalBooks());
        Assert.assertEquals("news-paper-1", library.getNewsPaper());
    }
}