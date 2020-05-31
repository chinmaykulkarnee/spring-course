package com.upgrad.course;

import com.upgrad.course.entity.Passport;
import com.upgrad.course.entity.Person;
import com.upgrad.course.service.PassportService;
import com.upgrad.course.service.PersonService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Optional;

public class App {
    public static void main( String[] args ) {
        System.out.println( "Hello JPA!" );
    }

    ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
    PassportService passportService = ctx.getBean(PassportService.class);
    PersonService personService = ctx.getBean(PersonService.class);


    public void addPerson(String firstName, String lastName, String passportNumber) {
        Person person = new Person(firstName, lastName);
        person.setPassport(new Passport(passportNumber));
        personService.add(person);
    }

    public Optional<Passport> getPassportDetails(String number) {
        return passportService.getDetails(number)
                .stream()
                .findFirst();
    }

    public Optional<Person> getPersonDetails(String firstName) {
        return personService.getDetailsByFirstName(firstName)
                .stream()
                .findFirst();
    }

    public List<Passport> getAllPassports() {
        return passportService.listAll();
    }

    public List<Person> getAllPersons() {
        return personService.listAll();
    }

    public void deleteAllPersons() {
        personService.deleteAll();
    }

    public void deleteAllPassports() {
        passportService.deleteAll();
    }
}
