package com.example.demo1.Service;

import java.util.List;

import com.example.demo1.model.User;

public interface UserService {
  
 public User findUserByEmail(String email);
 
 //public void saveUser(User user);
 
 
 public List<User>findAll();
 

public void deleteById(long id);


public void saveUser(User user);

public boolean isUserAlreadyPresent(User user);

 

}