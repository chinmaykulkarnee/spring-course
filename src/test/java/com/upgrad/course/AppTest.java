package com.upgrad.course;

import com.upgrad.course.model.Student;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AppTest {

    App underTest = new App();

    @Before
    public void clean() {
        underTest.deleteAll();
    }

    @Test
    public void shouldCreateNewStudentSuccessfully() {
        int result = underTest.createStudent("Harry", 16);

        Assert.assertEquals(1, result);
    }

    @Test
    public void shouldGetStudentSuccessfully() {
        underTest.createStudent("Harry", 16);

        Student result = underTest.getStudentDetails("Harry");

        Assert.assertEquals("Harry", result.getName());
        Assert.assertSame(16, result.getAge());
    }
}
