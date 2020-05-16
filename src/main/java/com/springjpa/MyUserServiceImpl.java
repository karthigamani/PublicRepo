package com.springjpa;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.springjpa.domain.User;
import com.springjpa.repository.UserRepository;

@Service
class MyUserServiceImpl implements UserDetailsService {

	@Autowired
	UserRepository userRepository;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepository.findByUsername(username);
		if(user == null) {
			throw new UsernameNotFoundException("Authentication failed. Incorrect Username or password");
		}
		
		return new MyUserDetails(user);
	}

}
