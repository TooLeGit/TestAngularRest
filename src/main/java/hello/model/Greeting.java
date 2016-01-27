package main.java.hello.model;

public class Greeting
{
	private final long id;
	private final String content;
	
	public Greeting (final long the_id, final String the_content)
	{
		id = the_id;
		content = the_content;
	}
	
	public long getId ()
	{
		return id;
	}
	
	public String getContent ()
	{
		return content;
	}
}
