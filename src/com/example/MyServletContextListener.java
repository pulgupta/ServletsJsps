package com.example;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyServletContextListener implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent event) {
		// We do not need anything here.
		// If the context is going away this means the whole application is
		// going down with the dog
		System.out.println("Context is getting destroyed");

	}

	@Override
	public void contextInitialized(ServletContextEvent event) {
		ServletContext sc = event.getServletContext();
		//This is when the application is getting initialised but still we can see 
		//That we can get the init parameters
		String dogBreed = sc.getInitParameter("breed");
		System.out.println("Dog breed in listener is " + dogBreed);
		Dog d = new Dog();
		d.setBreed(dogBreed);
		sc.setAttribute("dog", d);
		System.out.println("context initialized");
	}

}
