package com.luv2code.springboot.thymeleafdemo.service;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.luv2code.springboot.thymeleafdemo.entiry.Post;

public interface PostService {
	
	public List<Post> findAll(final Pageable pageable);
	
	public Post findByNum(int theNum);
	
	public void save(Post thePost);
	
	public void deleteByNum(int theNum);
	
}
