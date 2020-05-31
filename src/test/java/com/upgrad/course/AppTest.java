package com.upgrad.course;

import com.upgrad.course.entity.Passport;
import com.upgrad.course.entity.Person;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Optional;

public class AppTest {

    App underTest = new App();

    @Before
    public void clean() {
        underTest.deleteAllPersons();
        underTest.deleteAllPassports();
    }

    @Test
    public void shouldAddPersonAndPassportToDb() {
        underTest.addPerson("Harry", "Potter", "UK-1111-Harry-1");

        Optional<Person> mayBePerson = underTest.getPersonDetails("Harry");
        Assert.assertTrue(mayBePerson.isPresent());
        Person person = mayBePerson.get();
        Assert.assertEquals("Harry", person.getFirstName());
        Assert.assertEquals("Potter", person.getLastName());
        Assert.assertEquals("UK-1111-Harry-1", person.getPassport().getNumber());

        Optional<Passport> mayBePassport = underTest.getPassportDetails("UK-1111-Harry-1");
        Assert.assertTrue(mayBePassport.isPresent());
        Passport passport = mayBePassport.get();
        Assert.assertEquals("UK-1111-Harry-1", passport.getNumber());
    }
}
