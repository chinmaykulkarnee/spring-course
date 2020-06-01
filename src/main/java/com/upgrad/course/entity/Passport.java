package com.upgrad.course.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
// TODO: give custom table name as "passport"
@Table(name = "passport")
public class Passport {

    @Id
    @GeneratedValue
    private Integer id;

    private String number;

    // TODO: add correct annotation for one-to-one mapping with mappedBy property pointing to "passport"
    @OneToOne(mappedBy = "passport")
    private Person person;

    public Passport() {
        //Default constructor needed for JPA.
    }

    public Passport(String number) {
        this.number = number;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Passport [id=" + id + ", number=" + number + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return Objects.equals(number, passport.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }
}
