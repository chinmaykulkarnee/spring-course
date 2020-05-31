package com.upgrad.course.service;

import com.upgrad.course.entity.Person;
import com.upgrad.course.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;

@Component
public class PersonService {

    private final PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    // TODO: implement method to save person to the database
    // Note: this method will save person along with the passport, this is orchestrated by the App class
    // you will need to be concerned only about the PersonRepository
    @Transactional
    public void add(Person person) {
    }

    // TODO: implement method to get all the persons from the database
    @Transactional
    public List<Person> listAll() {
        return null;
    }

    // TODO: implement method to get details of the person by first name from the database
    @Transactional
    public List<Person> getDetailsByFirstName(String firstName) {
        return null;
    }

    @Transactional
    public void deleteAll() {
        personRepository.deleteAllInBatch();
    }
}
