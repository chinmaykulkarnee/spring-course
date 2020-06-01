package com.upgrad.course;

import com.upgrad.course.entity.Author;
import com.upgrad.course.entity.Book;
import com.upgrad.course.repository.AuthorRepository;
import com.upgrad.course.repository.BookRepository;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Optional;

public class App {
    public static void main( String[] args ) {
        System.out.println( "Hello JPA!" );
    }

    ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
    AuthorRepository authorRepository = ctx.getBean(AuthorRepository.class);
    BookRepository bookRepository = ctx.getBean(BookRepository.class);

    @Transactional
    public void addBookWithAuthors(String name, Long price, ArrayList<Author> authors) {
        Book book = new Book(name, price);
        authorRepository.saveAll(authors);
        book.setAuthors(authors);
        bookRepository.save(book);
    }

    public Optional<Book> getBookDetails(String name) {
        return bookRepository.findByName(name)
        .stream()
        .findFirst();
    }

    public Optional<Author> getAuthorDetails(String name) {
        return authorRepository.findByName(name)
                .stream()
                .findFirst();
    }

    public void deleteAllBooks() {
        bookRepository.deleteAll();
    }

    public void deleteAllAuthors() {
        authorRepository.deleteAll();
    }
}