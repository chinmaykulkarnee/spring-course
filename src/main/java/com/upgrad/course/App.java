package com.upgrad.course;

import com.upgrad.course.entity.Author;
import com.upgrad.course.entity.Book;
import com.upgrad.course.repository.AuthorRepository;
import com.upgrad.course.repository.BookRepository;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import javax.transaction.Transactional;
import java.util.List;

public class App {
    public static void main( String[] args ) {
        System.out.println( "Hello JPA!" );
    }

    ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
    AuthorRepository authorRepository = ctx.getBean(AuthorRepository.class);
    BookRepository bookRepository = ctx.getBean(BookRepository.class);

    @Transactional
    public void addBookWithAuthors(String name, Long price, List<Author> authors) {
        Book book = new Book(name, price);
        authorRepository.saveAll(authors);
        book.setAuthors(authors);
        bookRepository.save(book);
    }

    public List<Author> getAuthorsByName(String partialName) {
        return authorRepository.findByNameLike(partialName);
    }

    public List<Author> getAuthorsByRegistrationNumbers(List<Long> registrationNumbers) {
        return authorRepository.findByRegistrationNumberList(registrationNumbers);
    }

    public Page<Book> getBooksWithPagination() {
        return bookRepository.findAllBooksWithPagination(PageRequest.of(0, 5));
    }

    public void deleteAllBooks() {
        bookRepository.deleteAll();
    }

    public void deleteAllAuthors() {
        authorRepository.deleteAll();
    }
}