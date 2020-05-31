package com.upgrad.course.service;

import com.upgrad.course.entity.Passport;
import com.upgrad.course.repository.PassportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;

@Component
public class PassportService {

    private final PassportRepository passportRepository;

    @Autowired
    public PassportService(PassportRepository passportRepository) {
        this.passportRepository = passportRepository;
    }

    // TODO: implement method to get all the passports from the database
    @Transactional
    public List<Passport> listAll() {
        return passportRepository.findAll();
    }

    // TODO: implement method to get details of the passport by number from the database
    @Transactional
    public List<Passport> getDetails(String number) {
        return passportRepository.findByNumber(number);
    }

    @Transactional
    public void deleteAll() {
        passportRepository.deleteAll();
    }
}
