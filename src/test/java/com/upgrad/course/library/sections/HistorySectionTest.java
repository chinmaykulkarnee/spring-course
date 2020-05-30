package com.upgrad.course.library.sections;

import com.upgrad.course.library.inventory.HistoryBooksInventory;
import org.junit.Assert;
import org.junit.Test;

public class HistorySectionTest {

    @Test
    public void historySectionShouldBeLooselyCoupledWithInventory() {
        HistorySection historySection = new HistorySection(new HistoryBooksInventory());
        Assert.assertEquals(3, historySection.getTotalBooks());
    }
}