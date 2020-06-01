package com.upgrad.course.service;

import com.upgrad.course.entity.Author;
import com.upgrad.course.entity.Book;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;

public class BookServiceTest {

    ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
    BookService service = ctx.getBean(BookService.class);

    @Before
    public void clean() {
        service.deleteAllBooks();
        AuthorService authorService = ctx.getBean(AuthorService.class);
        authorService.deleteAllAuthors();
    }

    @Test
    public void shouldSaveBookWithAuthors() throws Exception {
        ArrayList<Author> authors = new ArrayList<>();
        authors.add(new Author("J.K. Rowling", 112233L));
        authors.add(new Author("Albert Dumbledore", 332211L));

        service.saveBookWithAuthors("Hogwarts Book", 100L, authors);
    }

    @Test(expected = Exception.class)
    public void shouldThrowExceptionWhenPriceIsNegative() throws Exception {
        ArrayList<Author> authors = new ArrayList<>();
        authors.add(new Author("J.K. Rowling", 112233L));
        authors.add(new Author("Albert Dumbledore", 332211L));

        service.saveBookWithAuthors("Hogwarts Book", -1L, authors);
    }

    @Test
    public void shouldGetBookByName() throws Exception {
        ArrayList<Author> authors = new ArrayList<>();
        authors.add(new Author("J.K. Rowling", 112233L));
        authors.add(new Author("Albert Dumbledore", 332211L));
        service.saveBookWithAuthors("Hogwarts Book", 100L, authors);

        Book hogwarts_book = service.getBookByName("Hogwarts Book");
        Assert.assertEquals(100L, hogwarts_book.getPrice().longValue());
        Assert.assertEquals(2, hogwarts_book.getAuthors().size());
    }
}