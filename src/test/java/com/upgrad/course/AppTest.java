package com.upgrad.course;

import com.upgrad.course.entity.Author;
import com.upgrad.course.entity.Book;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.data.domain.Page;

import java.util.*;
import java.util.stream.Collectors;

public class AppTest {

    App underTest = new App();

    @Before
    public void clean() {
        underTest.deleteAllBooks();
        underTest.deleteAllAuthors();
    }

    @Test
    public void shouldGetBooksWitPaginationToDb() {
        underTest.addBookWithAuthors("Hogwarts Book", 100L, Collections.singletonList(new Author("J.K. Rowling", 112233L)));
        underTest.addBookWithAuthors("Hogwarts Book Part 2", 200L, Collections.singletonList(new Author("Albert Dumbledore", 332211L)));

        Page<Book> booksPaginated = underTest.getBooksWithPagination();
        Assert.assertEquals(2, booksPaginated.getTotalElements());
        List<Book> books = booksPaginated.get().collect(Collectors.toList());

        // checks ordering by price
        booksPaginated.get().findFirst()
                .ifPresent(b -> Assert.assertEquals(b, new Book("Hogwarts Book Part 2", 200L)));
        Assert.assertTrue(books.contains(new Book("Hogwarts Book", 100L)));
    }

    @Test
    public void shouldGetBooksFromAuthorsToDb() {
        ArrayList<Author> authors = new ArrayList<>();
        authors.add(new Author("J.K. Rowling", 112233L));
        authors.add(new Author("Albert Dumbledore", 332211L));

        underTest.addBookWithAuthors("Hogwarts Book", 100L, authors);
        underTest.addBookWithAuthors("Hogwarts Book Part 2", 200L, authors);

        List<Author> authorsByName = underTest.getAuthorsByName("Rowling");
        System.out.println(authorsByName);
        Assert.assertTrue(authorsByName.contains(new Author("J.K. Rowling", 112233L)));

        ArrayList<Long> regNumbers = new ArrayList<>();
        regNumbers.add(112233L);
        regNumbers.add(332211L);
        List<Author> authorsByRegistrationNumbers = underTest.getAuthorsByRegistrationNumbers(regNumbers);
        Assert.assertTrue(authorsByRegistrationNumbers.contains(new Author("J.K. Rowling", 112233L)));
        Assert.assertTrue(authorsByRegistrationNumbers.contains(new Author("Albert Dumbledore", 332211L)));
    }
}
