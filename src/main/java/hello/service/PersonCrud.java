package main.java.hello.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import main.java.hello.model.Person;

public class PersonCrud
{
	private List<Person> my_collection;
	
	public PersonCrud ()
	{
		my_collection = new ArrayList<Person>();
		
		createCollection();
	}
	
	private void createCollection ()
	{
		my_collection.add(new Person(1L, "John Smith", Calendar.getInstance().getTime().toString()));
	  my_collection.add(new Person(2L, "Jake Smith", Calendar.getInstance().getTime().toString()));
	  my_collection.add(new Person(3L, "JOE Smith", Calendar.getInstance().getTime().toString()));
	}
	
	public Person getPerson (final long the_id)
	{
		Person result = new Person();
		
		for (final Person person : my_collection)
		{
			if (person.getId() == the_id)
			{
				result = person;
				break;
			}
		}
		
		return result;
	}
	
	public List<Person> getAllPersons ()
	{
		return my_collection;
	}
	
	public List<Person> deletePerson (final long the_id)
	{
		for (int i = 0; i < my_collection.size(); i++)
		{
			Person temp = my_collection.get(i);
			
			if (temp.getId() == the_id)
			{
				my_collection.remove(i);
				break;
			}
		}
		
		return my_collection;
	}
	
	public List<Person> updatePerson (final long the_id, final Person the_person)
	{
		for (int i = 0; i < my_collection.size(); i++)
		{
			Person temp = my_collection.get(i);
			
			if (temp.getId() == the_id)
			{
				my_collection.set(i, the_person);
				break;
			}
		}
		
		return my_collection;
	}
	
	public List<Person> addPerson (final Person the_person)
	{
		my_collection.add(the_person);
		
		return my_collection;
	}
}
