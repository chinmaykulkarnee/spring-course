package com.upgrad.course.school;

public class Student {
    private String name;
    private String id;

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getDetails() {
        return "Student [name : " + this.name + " id: " + this.id + "]";
    }
}
