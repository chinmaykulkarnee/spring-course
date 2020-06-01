package com.upgrad.course.service;

import com.upgrad.course.entity.Author;
import com.upgrad.course.entity.Book;
import com.upgrad.course.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class BookService {
    private BookRepository bookRepository;
    private AuthorService authorService;

    // TODO: autowire book repository and author service
    @Autowired
    public BookService(BookRepository bookRepository, AuthorService authorService) {
        this.bookRepository = bookRepository;
        this.authorService = authorService;
    }

    @Transactional
    public void saveBookWithAuthors(String name, Long price, List<Author> authors) throws Exception {
        // TODO: validate price before saving the book
        validatePrice(price);
        Book book = new Book(name, price);

        // TODO: save all the authors using author service before saving the book
        authorService.saveAll(authors);
        book.setAuthors(authors);

        // TODO: save the book
        bookRepository.save(book);
    }

    // TODO: implement method to get book by name from db and throw exception if book not found
    public Book getBookByName(String name) throws Exception {
        return bookRepository.findBookByName(name)
                .orElseThrow(() -> new Exception("Book not found"));
    }

    public void deleteAllBooks() {
        bookRepository.deleteAll();
    }

    private void validatePrice(Long price) throws Exception {
        if (price <= 0L)
            throw new Exception("Invalid price");
    }
}
