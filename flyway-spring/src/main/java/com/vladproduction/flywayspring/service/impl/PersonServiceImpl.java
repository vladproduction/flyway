package com.vladproduction.flywayspring.service.impl;

import com.vladproduction.flywayspring.entity.Person;
import com.vladproduction.flywayspring.exceptions.ResourceNotFoundException;
import com.vladproduction.flywayspring.repository.PersonRepository;
import com.vladproduction.flywayspring.service.PersonService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonServiceImpl implements PersonService {

    private final PersonRepository personRepository;

    public PersonServiceImpl(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public Person create(Person person) {
        return personRepository.save(person);
    }

    @Override
    public Person findById(int id) {
        return personRepository.findById(id).orElseThrow(ResourceNotFoundException::new);
    }

    @Override
    public List<Person> findAll() {
        return personRepository.findAll();
    }

    @Override
    public Person update(int id, Person candidate) {
        Person foundPerson = personRepository.findById(id).orElseThrow(ResourceNotFoundException::new);
        foundPerson.setName(candidate.getName());
        foundPerson.setAge(candidate.getAge());
        return personRepository.save(foundPerson);
    }

    @Override
    public void delete(int id) {
        personRepository.deleteById(id);
    }
}
