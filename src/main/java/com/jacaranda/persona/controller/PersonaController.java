package com.jacaranda.persona.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.jacaranda.persona.service.PersonaService;

@Controller
public class PersonaController {
	
	private final PersonaService personService;
	
	public PersonaController(PersonaService personService) {
		super();
		this.personService = personService;
	}
	
	@GetMapping({"/", "/persons"})
	public String getPersons(Model model) {
	    model.addAttribute("list", this.personService.getAll());
	    return "listPersons";
	}

}
