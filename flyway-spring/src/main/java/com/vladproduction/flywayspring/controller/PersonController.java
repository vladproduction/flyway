package com.vladproduction.flywayspring.controller;

import com.vladproduction.flywayspring.entity.Person;
import com.vladproduction.flywayspring.service.PersonService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/persons")
public class PersonController {

    private PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Person create(@RequestBody Person person){
        return personService.create(person);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Person> findAll(){
        return personService.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Person findById(@PathVariable int id){
        return personService.findById(id);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Person update(@PathVariable int id, @RequestBody Person candidate){
        return personService.update(id, candidate);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable int id){
        personService.delete(id);
    }


}
