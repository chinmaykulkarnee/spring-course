package com.upgrad.course.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;

    private Long price;

    // TODO: add correct annotation for many-to-many mapping
    // Note: you need to add fetch = FetchType.EAGER and cascade = CascadeType.REMOVE (for testing purpose)
    @ManyToMany(
            fetch = FetchType.EAGER,
            cascade = CascadeType.REMOVE
    )
    // TODO: add annotation for creating join table with join columns from both side
    @JoinTable(
            name = "book_author",
            joinColumns = @JoinColumn(name = "book_id"),
            inverseJoinColumns = @JoinColumn(name = "author_id")
    )
    // TODO: correctly define field for representing authors of this book
    private List<Author> authors;

    public Book() {
        //Default constructor needed for JPA.
    }

    public Book(String name, Long price) {
        this.name = name;
        this.price = price;
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

    public void setName(String name) {
        this.name = name;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    @Override
    public String toString() {
        return "Book [id=" + id + ", name=" + name + ", price=" + price + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(name, book.name) &&
                Objects.equals(price, book.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}
