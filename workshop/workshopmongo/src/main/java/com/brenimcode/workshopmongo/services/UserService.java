package com.brenimcode.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brenimcode.workshopmongo.domain.User;
import com.brenimcode.workshopmongo.dto.UserDTO;
import com.brenimcode.workshopmongo.repository.UserRepository;
import com.brenimcode.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;
	
	public List<User> findAll() {
		return repo.findAll();
	}
	
	public User findById(String id) {
		User user = repo.findById(id).orElse(null);
		if(user == null){
			throw new ObjectNotFoundException("Object not found!");
		}
		return user;
		
	}
	
	public User insert(User obj) {
		return repo.insert(obj);
	}
	
	
	public User fromDTO(UserDTO objDTO) {
		return new User(objDTO.getId(), objDTO.getName(),objDTO.getEmail());
	}
	
}
