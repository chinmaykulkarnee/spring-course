package com.upgrad.course.school;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class ClassA {

    // TODO: Inject wooden bench using property based autowiring
    @Autowired
    @Qualifier("woodenBench")
    private Bench bench;

    private Student student;
    private Teacher teacher;

    // TODO: Inject student and teacher using constructor based autowiring
    @Autowired
    public ClassA(Student student, Teacher teacher) {
        this.student = student;
        this.teacher = teacher;
    }

    public String getStudentDetails() {
        return this.student.getDetails();
    }

    public String getTeacherDetails() {
        return this.teacher.getDetails();
    }

    public String getBenchType() {
        return this.bench.getType();
    }
}
