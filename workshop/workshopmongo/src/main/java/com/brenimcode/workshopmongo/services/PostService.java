package com.brenimcode.workshopmongo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brenimcode.workshopmongo.domain.Post;
import com.brenimcode.workshopmongo.repository.PostRepository;
import com.brenimcode.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {
	
	@Autowired
	private PostRepository repo;
	
	
	public Post findById(String id) {
		Post user = repo.findById(id).orElse(null);
		if(user == null){
			throw new ObjectNotFoundException("Object not found!");
		}
		return user;
		
	}
	
	
}
