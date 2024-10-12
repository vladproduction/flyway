package com.vladproduction.flywayspring.repository;

import com.vladproduction.flywayspring.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Integer> {
}
