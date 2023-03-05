package com.luv2code.springboot.thymeleafdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.luv2code.springboot.thymeleafdemo.entiry.Post;
import com.luv2code.springboot.thymeleafdemo.service.PostService;

@Controller
@RequestMapping("/posts")
public class PostController {

	private PostService postService;
	
	@Autowired  // optional
	public PostController(PostService thePostService) {
		this.postService = thePostService;
	}

	// add mapping for "/list"
	@GetMapping("/list")
	public String listPost(Model theModel) {
		
		// get posts from db
		List<Post> thePosts = postService.findAll();
		
		// add to the spring model
		theModel.addAttribute("posts", thePosts);
		
		return "/posts/list-posts";
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		
		// create model attribute to bind form data
		Post thePost = new Post();
		
		theModel.addAttribute("post", thePost);
		
		return "/posts/post-form";
	}
	
	@PostMapping("/save")
	public String savePost(@ModelAttribute("post") Post thePost) {
		
		// save the post
		postService.save(thePost);
		
		// use a redirect to prevent duplicate submission
		return "redirect:/posts/list";
		
	}
	
    @GetMapping("/showFormForUpdate/{num}")
    public String updateForm(@PathVariable(value = "num") int num, Model model) {
        Post post = postService.findByNum(num);
        model.addAttribute("post", post);
        return "/posts/update";
    }
    
    @GetMapping("/deletePost/{num}")
    public String deleteThroughId(@PathVariable(value = "num") int num) {
    	postService.deleteByNum(num);
        return "redirect:/posts/list";
 
    }
}
