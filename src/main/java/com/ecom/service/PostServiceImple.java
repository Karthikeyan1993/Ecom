package com.ecom.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.bean.Post;
import com.ecom.repository.PostRepository;

@Service("postService")
public class PostServiceImple implements PostService {

	@Autowired
	private PostRepository postRepository;

	@Override
	public List<Post> getAll() {
		// TODO Auto-generated method stub
		return postRepository.findAll();
	}

	@Override
	public Post save(Post post) {
		// TODO Auto-generated method stub
		return postRepository.save(post);
	}

}
