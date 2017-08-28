package com.ecom.service;

import java.util.List;

import com.ecom.bean.Post;

public interface PostService {

	public List<Post> getAll();

	public Post save(Post post);
}
