package com.upgrad.course.school;

public class ClassA {

    // TODO: Inject wooden bench using property based autowiring
    private Bench bench;

    private Student student;
    private Teacher teacher;

    // TODO: Inject student and teacher using constructor based autowiring

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
