package com.upgrad.course;

import com.upgrad.course.school.Student;
import org.junit.Assert;
import org.junit.Test;

import java.util.Set;

public class AppTest {

    App underTest = new App();

    @Test
    public void shouldInitializeDivisionBStudents() {
        Set<Student> students = underTest.getDivisionBStudents();
        Assert.assertEquals(3, students.size());
        Assert.assertTrue(students.contains(new Student("Harry", "student1")));
        Assert.assertTrue(students.contains(new Student("Hermione", "student3")));
        Assert.assertTrue(students.contains(new Student("Ron", "student2")));
    }

    @Test
    public void shouldInitializeDivisionBBenchCount() {
        Assert.assertEquals(2, underTest.getDivisionBBenchCount());
    }

    @Test
    public void shouldInitializeDivisionBTeacher() {
        Assert.assertNotNull(underTest.getTeacher());
    }
}
