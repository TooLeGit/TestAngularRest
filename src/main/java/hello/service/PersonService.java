package main.java.hello.service;

import java.util.List;

import main.java.hello.model.Person;

public class PersonService
{
	private PersonCrud my_person_crud;
	
	public PersonService ()
	{
		my_person_crud = new PersonCrud();
	}
	
	public List<Person> getAllPersons ()
	{
		return my_person_crud.getAllPersons();
	}
	
	public Person getPersonById (final long the_id)
	{
		return my_person_crud.getPerson(the_id);
	}
	
	public List<Person> addPerson (final Person the_person)
	{
		return my_person_crud.addPerson(the_person);
	}
	
	public List<Person> updatePerson (final long the_id, final Person the_person)
	{
		return my_person_crud.updatePerson(the_id, the_person);
	}
	
	public List<Person> deletePerson (final long the_id)
	{
		return my_person_crud.deletePerson(the_id);
	}
}
