package main.java.hello.controller;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import main.java.hello.model.Person;
import main.java.hello.service.PersonService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController
{
	private static final String HELLO_TEMPLATE = "Hello, %s!";
	private static AtomicLong counter = new AtomicLong();
	
	private PersonService my_service;
	
	
	public PersonController()
	{
		my_service = new PersonService();
	}
	
	@RequestMapping(value = "/person", method = RequestMethod.GET)
	public @ResponseBody List<Person> person ()
	{
		return my_service.getAllPersons();
	}
	
	@RequestMapping(value = "/person/{id}", method = RequestMethod.GET)
	public @ResponseBody Person getPersonById (@PathVariable long id)
	{
		return my_service.getPersonById(id);
	}
	
	@RequestMapping(value = "/person/{id}", method = RequestMethod.DELETE)
	public @ResponseBody List<Person> deletePersonById (@PathVariable long id)
	{
		return my_service.deletePerson(id);
	}
	
	@RequestMapping(value = "/person/{id}", method = RequestMethod.PUT)
	public @ResponseBody List<Person> updatePersonById (@PathVariable long id, 
																											@RequestBody Person the_person)
	{
		return my_service.updatePerson(id, the_person);
	}
	
	@RequestMapping(value = "/person", method = RequestMethod.POST)
	public @ResponseBody List<Person> createPerson (@RequestBody Person the_person)
	{
		return my_service.addPerson(the_person);
	}
}


