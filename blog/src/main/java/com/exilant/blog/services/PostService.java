package com.exilant.blog.services;

import java.util.List;



import org.springframework.stereotype.Service;

import com.exilant.blog.model.Post;
@Service
public interface PostService {
	  List<Post> findAll();
	  public List<Post> findLatest5Posts();
	    Post findById(Long id);
	    Post create(Post post);
	    Post edit(Post post);
	    String deleteById(Long id);
}
