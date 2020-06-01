package com.upgrad.course.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
// TODO: give custom table name as "person"
@Table(name = "person")
public class Person {

    @Id
    @GeneratedValue
    private Integer id;

    private String firstName;

    private String lastName;

    // TODO: add correct annotation for one-to-one mapping with cascade type all to delete mapped passports
    // TODO: add correct annotation for setting up join column giving it custom name as "passport_id" and do not allow null values
    private Passport passport;

    public Person() {
        //Default constructor needed for JPA.
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Passport getPassport() {
        return passport;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }

    @Override
    public String toString() {
        return "Person [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(firstName, person.firstName) &&
                Objects.equals(lastName, person.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}
