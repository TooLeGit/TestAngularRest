package main.java.hello.controller;

import java.util.concurrent.atomic.AtomicLong;

import main.java.hello.model.Greeting;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GreetingController
{
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	
	@RequestMapping("/greeting")
	public @ResponseBody Greeting greeting (
				 @RequestParam (value = "name", required = false, defaultValue = "World") String the_name)
	{
		System.out.println("==== in greeting ====");
		return new Greeting (counter.incrementAndGet(), String.format(template, the_name));
	}
}
