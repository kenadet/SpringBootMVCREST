package com.kenny.springbootmvcrest.sample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kenny.springbootmvcrest.sample.model.Person;
import com.kenny.springbootmvcrest.sample.service.PersonService;

@RestController
@RequestMapping("/api/person")
public class PersonController {
	
	@Autowired
	PersonService personService;
	
	@RequestMapping(method=RequestMethod.POST, consumes= MediaType.APPLICATION_JSON_VALUE, 
			produces=MediaType.APPLICATION_JSON_VALUE)
	public Person save (Person person)  {
		
		return personService.savePerson(person);
	}

	
	@RequestMapping(value = "{name}", method=RequestMethod.GET, produces = MediaType.
			APPLICATION_JSON_VALUE)
	public Person find(@PathVariable(value = "name") String firstname) {
		
		return personService.findByFirstname(firstname);
	}

}



