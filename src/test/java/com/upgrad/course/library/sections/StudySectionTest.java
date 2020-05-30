package com.upgrad.course.library.sections;

import com.upgrad.course.library.inventory.StudyBooksInventory;
import org.junit.Assert;
import org.junit.Test;

public class StudySectionTest {

    @Test
    public void historySectionShouldBeLooselyCoupledWithInventory() {
        StudySection studySection = new StudySection(new StudyBooksInventory());
        Assert.assertEquals(3, studySection.getTotalBooks());
    }
}