package com.jacaranda.persona.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.jacaranda.persona.model.Person;
import com.jacaranda.persona.repository.PersonaRepository;

@Service
public class PersonaService {
	
	private final PersonaRepository personaRepository;

	public PersonaService(PersonaRepository personaRepository) {
		super();
		this.personaRepository = personaRepository;
	}

    public Person savePerson(Person person) {
        return personaRepository.save(person);
    }

    public List<Person> getAll() {
        return personaRepository.findAll();
    }

    public Optional<Person> getPerson(Integer id) {
        return personaRepository.findById(id);
    }

    public Person update(Person person) {
        return personaRepository.save(person);
    }

    public void delete(Integer id) {
        personaRepository.deleteById(id);
    }

}
