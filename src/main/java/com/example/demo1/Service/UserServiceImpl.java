package com.example.demo1.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import com.example.demo1.model.Role;
import com.example.demo1.model.User;
import com.example.demo1.Repository.RoleRepository;
import com.example.demo1.Repository.UserRepository;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {
 
	@Autowired
	BCryptPasswordEncoder encoder;
	@Autowired
	RoleRepository roleRepository;
	@Autowired
	UserRepository userRepository;
 
 
 @Override
 public User findUserByEmail(String email) {
  return userRepository.findByEmail(email);
 }

 

@Override
public List<User> findAll() {
	return userRepository.findAll(); 
}


@Override
public void deleteById(long id) {
userRepository.deleteById((int) id);	
}



@Override
public void saveUser(User user) {
	user.setPassword(encoder.encode(user.getPassword()));
	user.setStatus("VERIFIED");
	Role userRole = roleRepository.findByRole("SITE_USER");
	user.setRoles(new HashSet<Role>(Arrays.asList(userRole)));
	userRepository.save(user);
	
}

@Override
public boolean isUserAlreadyPresent(User user) {
	return false;
}

}