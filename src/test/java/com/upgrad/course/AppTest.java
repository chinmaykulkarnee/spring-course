package com.upgrad.course;

import org.junit.Assert;
import org.junit.Test;

public class AppTest {

    App underTest = new App();

    @Test
    public void shouldInitializeDivisionBTeacher() {
        Assert.assertNotNull(underTest.getTeacher());
    }
}
