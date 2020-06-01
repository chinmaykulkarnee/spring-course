package com.upgrad.course.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
public class Author {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private Long registrationNumber;

    // TODO: add correct annotation for many-to-many mapping with correct mappedBy properties
    // Note: you need to add fetch = FetchType.EAGER (for testing purpose)
    // TODO: correctly define field for representing books of this author

    public Author() {
        //Default constructor needed for JPA.
    }

    public Author(String name, Long registrationNumber) {
        this.name = name;
        this.registrationNumber = registrationNumber;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String number) {
        this.name = number;
    }

    public Long getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(Long registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Author [id=" + id + ", number=" + name + ", registrationNumber=" + registrationNumber + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(name, author.name) &&
                Objects.equals(registrationNumber, author.registrationNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, registrationNumber);
    }
}
