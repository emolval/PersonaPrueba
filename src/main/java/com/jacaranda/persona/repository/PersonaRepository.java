package com.jacaranda.persona.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jacaranda.persona.model.Person;

public interface PersonaRepository extends JpaRepository<Person, Integer> {

}
