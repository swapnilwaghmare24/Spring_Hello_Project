package com.bridgelabz.springhello.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
	
	public String sayHello()
	{
		return "Hello from Bridgelabz...";
	}
	
	public String sayName(String name)
	{
		return "Hello my name is :"+name;
	}

}
