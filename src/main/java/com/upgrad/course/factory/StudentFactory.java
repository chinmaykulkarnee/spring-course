package com.upgrad.course.factory;

import com.upgrad.course.school.Student;

import java.util.Set;

public class StudentFactory {
    private Set<Student> students;

    public void setStudents(Set<Student> students) {
        this.students = students;
    }

    public Set<Student> getStudents() {
        return students;
    }
}
