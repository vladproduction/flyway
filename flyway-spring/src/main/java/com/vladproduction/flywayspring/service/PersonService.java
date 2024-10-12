package com.vladproduction.flywayspring.service;


import com.vladproduction.flywayspring.entity.Person;

import java.util.List;

public interface PersonService {

    Person create(Person person);
    Person findById(int id);
    List<Person> findAll();
    Person update(int id, Person candidate);
    void delete(int id);

}
