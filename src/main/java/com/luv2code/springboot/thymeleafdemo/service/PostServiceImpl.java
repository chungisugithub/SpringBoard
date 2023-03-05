package com.luv2code.springboot.thymeleafdemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luv2code.springboot.thymeleafdemo.dao.PostRepository;
import com.luv2code.springboot.thymeleafdemo.entiry.Post;

@Service
public class PostServiceImpl implements PostService {

	private PostRepository postRepository;
	
	@Autowired
	public PostServiceImpl(PostRepository thePostRepository) {
		this.postRepository = thePostRepository;
	}

	@Override
	public List<Post> findAll() {
		return postRepository.findAllByOrderByRegDateAsc();
	}

	@Override
	public Post findByNum(int theNum) {
		Optional<Post> result = postRepository.findById(theNum);

		Post thePost = null;

		if (result.isPresent()) {
			thePost = result.get();
		} else {
			// we didn't find the post
			throw new RuntimeException("Did not find post id - " + theNum);
		}

		return thePost;
	}

	@Override
	public void save(Post thePost) {
		postRepository.save(thePost);
	}

	@Override
	public void deleteByNum(int theNum) {
		postRepository.deleteById(theNum);
	}

}
