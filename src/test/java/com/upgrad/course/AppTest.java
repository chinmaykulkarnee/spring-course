package com.upgrad.course;

import com.upgrad.course.entity.Author;
import com.upgrad.course.entity.Book;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class AppTest {

    App underTest = new App();

    @Before
    public void clean() {
        underTest.deleteAllBooks();
        underTest.deleteAllAuthors();
    }

    @Test
    public void shouldAddBookWithAuthorsToDb() {
        ArrayList<Author> authors = new ArrayList<>();
        authors.add(new Author("J.K. Rowling", 112233L));
        authors.add(new Author("Albert Dumbledore", 332211L));

        underTest.addBookWithAuthors("Hogwarts Book", 100L, authors);

        Optional<Book> mayBeBook = underTest.getBookDetails("Hogwarts Book");
        Assert.assertTrue(mayBeBook.isPresent());
        Book book = mayBeBook.get();
        Assert.assertEquals("Hogwarts Book", book.getName());
        List<Author> bookAuthors = book.getAuthors();
        Assert.assertEquals(2, bookAuthors.size());
        Assert.assertTrue(bookAuthors.contains(new Author("J.K. Rowling", 112233L)));
        Assert.assertTrue(bookAuthors.contains(new Author("Albert Dumbledore", 332211L)));
    }

    @Test
    public void shouldGetBooksFromAuthorsToDb() {
        ArrayList<Author> authors = new ArrayList<>();
        authors.add(new Author("J.K. Rowling", 112233L));
        authors.add(new Author("Albert Dumbledore", 332211L));

        underTest.addBookWithAuthors("Hogwarts Book", 100L, authors);
        underTest.addBookWithAuthors("Hogwarts Book Part 2", 200L, authors);

        Optional<Author> mayBeAuthor = underTest.getAuthorDetails("J.K. Rowling");
        Assert.assertTrue(mayBeAuthor.isPresent());
        Author author = mayBeAuthor.get();
        Assert.assertEquals("J.K. Rowling", author.getName());
        List<Book> books = author.getBooks();
        Assert.assertEquals(2, books.size());
        Assert.assertTrue(books.contains(new Book("Hogwarts Book", 100L)));
        Assert.assertTrue(books.contains(new Book("Hogwarts Book Part 2", 200L)));
    }
}
