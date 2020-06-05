package com.upgrad.course.school;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class OnlineClassroom {

    // TODO: Inject course bean with name springCourse using property based autowiring
    @Autowired
    @Qualifier("springCourse")
    private Course course;

    private Student student;
    private Teacher teacher;

    // TODO: Inject student and teacher using constructor based autowiring
    @Autowired
    public OnlineClassroom(Student student, Teacher teacher) {
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
        return this.course.getName();
    }
}
