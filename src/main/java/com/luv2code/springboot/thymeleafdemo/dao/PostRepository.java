package com.luv2code.springboot.thymeleafdemo.dao;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.luv2code.springboot.thymeleafdemo.entiry.Post;

public interface PostRepository extends JpaRepository<Post, Integer> {

	// that's it ... no need to write any code LOL!
	
	// add a method to sort by last name
	public List<Post> findAllByOrderByRegDateAsc(final Pageable pageable);
	
}
