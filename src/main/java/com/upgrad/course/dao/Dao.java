package com.upgrad.course.dao;

import java.util.List;

public interface Dao<T> {

    T find(String property);

    List<T> findAll();

    void persist(T t);

    void deleteAll();
}
