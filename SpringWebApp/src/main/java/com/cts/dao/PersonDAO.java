package com.cts.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.cts.model.Person;

public class PersonDAO {
private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}
	@SuppressWarnings("unchecked")
	public List<Person> listPersons() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Person> personsList = session.createQuery("from Person").list();
		
		return personsList;
	}

}
