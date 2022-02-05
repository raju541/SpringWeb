package com.cts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cts.dao.PersonDAO;
import com.cts.model.Person;

public class PersonService {
	@Autowired
	PersonDAO personDAO;
	public List<Person> listPersons() {
		return this.personDAO.listPersons();
	}

}
