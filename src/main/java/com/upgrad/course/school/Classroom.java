package com.upgrad.course.school;

import com.upgrad.course.factory.BenchFactory;
import com.upgrad.course.factory.StudentFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Set;

// TODO: mark this class as an auto scan component for bean creation
@Component
public class Classroom {
    private StudentFactory studentFactory;
    private BenchFactory benchFactory;
    private Teacher teacher;

    // TODO: autowire dependencies using annotation
    @Autowired
    public Classroom(StudentFactory studentFactory, BenchFactory benchFactory, Teacher teacher) {
        this.studentFactory = studentFactory;
        this.benchFactory = benchFactory;
        this.teacher = teacher;
    }

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
