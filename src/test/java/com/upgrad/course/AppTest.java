package com.upgrad.course;

import com.upgrad.course.model.Student;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

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

    @Test
    public void shouldGetAllStudentSuccessfully() {
        underTest.createStudent("Harry", 16);
        underTest.createStudent("Ron", 16);
        underTest.createStudent("Hermione", 16);

        List<Student> result = underTest.getStudents();

        Assert.assertEquals(3, result.size());
    }

    @Test
    public void shouldUpdateStudentAge() {
        underTest.createStudent("Harry", 16);
        Student created = underTest.getStudentDetails("Harry");

        underTest.updateStudentAge(created.getId(), 20);

        Student updated = underTest.getStudentDetails("Harry");
        Assert.assertSame(20, updated.getAge());
    }

    @Test
    public void shouldDeleteStudentSuccessfully() {
        underTest.createStudent("Harry", 16);
        Student created = underTest.getStudentDetails("Harry");

        int result = underTest.deleteStudent(created.getId());

        Assert.assertEquals(1, result);
    }
}
