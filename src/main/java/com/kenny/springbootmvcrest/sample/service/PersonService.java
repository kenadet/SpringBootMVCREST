package com.kenny.springbootmvcrest.sample.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kenny.springbootmvcrest.sample.model.Person;

@Service
public interface PersonService {
	
	Person savePerson(Person person);
	Person findByFirstname(String firstname);
	List<Person> findByLastname(String lastname);

}
