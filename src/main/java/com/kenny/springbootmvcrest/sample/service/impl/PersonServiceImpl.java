package com.kenny.springbootmvcrest.sample.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.kenny.springbootmvcrest.sample.model.Person;
import com.kenny.springbootmvcrest.sample.repository.PersonRepository;
import com.kenny.springbootmvcrest.sample.service.PersonService;

public class PersonServiceImpl implements PersonService {
	
	@Autowired
	PersonRepository personRepository;
	
	@Override
	public Person savePerson(Person person) {
		
		return personRepository.save(person);	
	}

	@Override
	public Person findByFirstname(String firstname) {

		return personRepository.findByFirstname(firstname);
	}

	@Override
	public List<Person> findByLastname(String lastname) {
		
		return personRepository.findByLastname(lastname);
	}

}
