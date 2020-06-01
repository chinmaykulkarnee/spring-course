package com.upgrad.course;

import com.upgrad.course.entity.Passport;
import com.upgrad.course.entity.Person;
import com.upgrad.course.repository.PassportRepository;
import com.upgrad.course.repository.PersonRepository;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Optional;

public class App {
    public static void main( String[] args ) {
        System.out.println( "Hello JPA!" );
    }

    ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
    PassportRepository passportRepository = ctx.getBean(PassportRepository.class);
    PersonRepository personRepository = ctx.getBean(PersonRepository.class);


    public void addPerson(String firstName, String lastName, String passportNumber) {
        Person person = new Person(firstName, lastName);
        person.setPassport(new Passport(passportNumber));
        personRepository.save(person);
    }

    public Optional<Passport> getPassportDetails(String number) {
        return passportRepository.findByNumber(number)
                .stream()
                .findFirst();
    }

    public Optional<Person> getPersonDetails(String firstName) {
        return personRepository.findByFirstName(firstName)
                .stream()
                .findFirst();
    }

    public List<Passport> getAllPassports() {
        return passportRepository.findAll();
    }

    public List<Person> getAllPersons() {
        return personRepository.findAll();
    }

    public void deleteAllPersons() {
        personRepository.deleteAll();
    }

    public void deleteAllPassports() {
        passportRepository.deleteAll();
    }
}
