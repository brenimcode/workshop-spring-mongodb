package com.brenimcode.workshopmongo.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.brenimcode.workshopmongo.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
		
	@Query("{ 'title': { $regex: ?0, $options: 'i' } }")
	List<Post> searchTitle(String text);
	
	//  método de consulta para encontrar posts cujo título contém um texto específico
	List<Post> findByTitleContainingIgnoreCase(String text);
	
	@Query("{ $and: [ {date: {$gte: ?1}} , {date: {$lte: ?2}}, { $or: [ { 'title': { $regex: ?0, $options: 'i' } }, { 'body': { $regex: ?0, $options: 'i' } } , { 'comments.title': { $regex: ?0, $options: 'i' } }   ] }  ] }")
	List<Post> fullSearch(String text, Date minDate, Date maxDate);
	
}
