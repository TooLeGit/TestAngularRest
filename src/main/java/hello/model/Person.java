package main.java.hello.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person
{
	@Id
	private long id;
	private String name;
	private String startDate;
	
	public Person ()
	{
		id = -1L;
		name = "No Name";
		startDate = new Date().toString();
	}
	
	public Person (final long the_id, final String the_name, 
								 final String the_start_date)
	{
		id = the_id;
		name = the_name;
		startDate = the_start_date;
	}
	
	public long getId ()
	{
		return id;
	}
	
	public String getName ()
	{
		return name;
	}
	
	public String getStartDate ()
	{
		return startDate;
	}
}
