package com.upgrad.course;

import org.junit.Assert;
import org.junit.Test;

public class AppTest {

    App underTest = new App();

    @Test
    public void shouldInitializeClassAWithCorrectStudent() {
        Assert.assertEquals("Student [name : Harry Potter id: student1]", underTest.getStudentDetails());
    }

    @Test
    public void shouldInitializeClassAWithCorrectTeacher() {
        Assert.assertEquals("Teacher [name : Albus Dumbledore]", underTest.getTeacherDetails());
    }

    @Test
    public void shouldInitializeClassAWithCorrectWoodenBench() {
        Assert.assertEquals("Spring", underTest.getBenchType());
    }
}
