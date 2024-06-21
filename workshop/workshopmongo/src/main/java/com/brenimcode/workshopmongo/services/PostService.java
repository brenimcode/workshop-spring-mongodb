package com.brenimcode.workshopmongo.services;

import java.util.Date;
import java.util.List;

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
	
	public List<Post> findByTitle(String text) {
		return repo.searchTitle(text);
	}
	
	public List<Post> fullSearch(String text, Date minDate, Date maxDate){
		maxDate = new Date(maxDate.getTime() + 24 * 3600000);
		return repo.fullSearch(text, minDate, maxDate);
	}
	
}
