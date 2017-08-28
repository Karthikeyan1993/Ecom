package com.ecom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecom.bean.Post;
@Repository("postRepository")
public interface PostRepository extends JpaRepository<Post, Long> {

}
