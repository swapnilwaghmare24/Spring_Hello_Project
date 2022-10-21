package com.bridgelabz.springhello.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelabz.springhello.model.User;
import com.bridgelabz.springhello.repository.HelloRepo;

@Service
public class HelloService {
	@Autowired
	HelloRepo repo;
	
	public String sayHello()
	{
		return "Hello from Bridgelabz...";
	}
	
	public String sayName(String name)
	{
		return "Hello my name is :"+name;
	}

	public User addUser(User user) {
		return repo.save(user);
	}

	public List<User> getAllUsers() {
		return repo.findAll();
	}

	public User getUserById(int id) {
		return repo.findById(id).get();
	}

	public String deleteUserById(int id) {
		repo.deleteById(id);
		return "Department deleted successfully";
	}

	public User updateUser(int id, User user) {
		
		User existUser=repo.findById(id).get();
		existUser.setFirstName(user.getFirstName());
		existUser.setLastName(user.getLastName());
		return repo.save(existUser);
	}

}
