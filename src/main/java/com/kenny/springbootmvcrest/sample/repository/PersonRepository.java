package com.kenny.springbootmvcrest.sample.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.kenny.springbootmvcrest.sample.model.Person;

@Repository
public interface PersonRepository extends MongoRepository <Person, String> {

	Person findByFirstname(String firstname);
	List<Person> findByLastname(String lastname);

}




