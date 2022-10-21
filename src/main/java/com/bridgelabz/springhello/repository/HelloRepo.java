package com.bridgelabz.springhello.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bridgelabz.springhello.model.User;
@Repository
public interface HelloRepo extends JpaRepository<User,Integer>{

}
