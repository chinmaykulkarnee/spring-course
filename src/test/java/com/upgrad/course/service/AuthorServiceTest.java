package com.upgrad.course.service;

import com.upgrad.course.entity.Author;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AuthorServiceTest {

    ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
    AuthorService service = ctx.getBean(AuthorService.class);

    @Before
    public void clean() {
        BookService bookService = ctx.getBean(BookService.class);
        bookService.deleteAllBooks();
        service.deleteAllAuthors();
    }

    @Test
    public void shouldGetAuthorDetailsByNumber() throws Exception {
        service.save("J.K. Rowling", 112233L);
        service.save("Bill Browder", 332211L);

        Author authorDetails = service.getAuthorDetails(112233L);
        Assert.assertEquals(new Author("J.K. Rowling", 112233L), authorDetails);
    }

    @Test(expected = Exception.class)
    public void shouldThrowExceptionWhenNumberIsNegative() throws Exception {
        service.getAuthorDetails(-1L);
    }

    @Test(expected = Exception.class)
    public void shouldThrowExceptionWhenAuthorNotFound() throws Exception {
        service.getAuthorDetails(442211L);
    }
}