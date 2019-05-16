package com.example.demo1.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo1.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {


 
 User findByEmail(String email);
}