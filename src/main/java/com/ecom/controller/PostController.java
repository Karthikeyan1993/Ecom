package com.ecom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.bean.Post;
import com.ecom.service.PostService;

@RestController
@RequestMapping("api/posts")
public class PostController {

	@Autowired
	private PostService postService;

	@RequestMapping(method = RequestMethod.GET)
	public List<Post> getAll() {
		return postService.getAll();
	}

	@RequestMapping(method = RequestMethod.POST)
	public Post save(@RequestBody Post post) {
		return postService.save(post);
	}

}
