package com.upgrad.course.school;

public class OnlineClassroom {

    // TODO: Inject course bean with name springCourse using property based autowiring
    private Course course;

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
        return this.course.getName();
    }
}
