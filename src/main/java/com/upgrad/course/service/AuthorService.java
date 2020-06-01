package com.upgrad.course.service;

import com.upgrad.course.entity.Author;
import com.upgrad.course.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class AuthorService {
    private AuthorRepository authorRepository;

    // TODO: autowire author repository
    @Autowired
    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    protected void saveAll(List<Author> author) {
        authorRepository.saveAll(author);
    }

    @Transactional
    public void save(String name, Long number) {
        authorRepository.save(new Author(name, number));
    }

    public Author getAuthorDetails(Long number) throws Exception {
        // TODO: validate registration number before passing it to the database
        validateRegistrationNumber(number);

        // TODO: use authorRepository to get author by registration number from db and throw exception if author not found
        return authorRepository.findByRegistrationNumber(number)
                .orElseThrow(() -> new Exception("Author not found"));
    }

    public void deleteAllAuthors() {
        authorRepository.deleteAll();
    }

    private void validateRegistrationNumber(Long number) throws Exception {
        if (number == null || number <= 0) {
            throw new Exception("Invalid number to search");
        }
    }
}
