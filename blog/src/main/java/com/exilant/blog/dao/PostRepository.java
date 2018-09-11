package com.exilant.blog.dao;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exilant.blog.model.Post;
@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
	
}
