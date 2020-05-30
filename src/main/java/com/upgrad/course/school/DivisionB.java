package com.upgrad.course.school;

import com.upgrad.course.factory.BenchFactory;
import com.upgrad.course.factory.StudentFactory;
import java.util.Set;

// TODO: mark this class as an auto scan component for bean creation
public class DivisionB {
    private StudentFactory studentFactory;
    private BenchFactory benchFactory;
    private Teacher teacher;

    // TODO: autowire dependencies using annotation

    public Set<Student> getStudents() {
        return this.studentFactory.getStudents();
    }

    public int getBenchCount() {
        return this.benchFactory.getBenchCount();
    }

    public Teacher getTeacher() {
        return teacher;
    }
}
