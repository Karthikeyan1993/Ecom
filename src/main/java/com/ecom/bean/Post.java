package com.ecom.bean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

public class Post {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "POST_ID")
	private Long Id;
	@Column(name = "POST_NAME")
	private String name;

	@OneToMany(mappedBy = "post", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Comment> comments = new ArrayList<Comment>();

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	public void addComment(Comment comment) {
		this.getComments().add(comment);
		comment.setPost(this);
	}

	public void removeComment(Comment comment) {
		this.getComments().remove(comment);
		comment.setPost(null);
	}
}
