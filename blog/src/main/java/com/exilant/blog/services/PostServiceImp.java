package com.exilant.blog.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.exilant.blog.dao.PostRepository;
import com.exilant.blog.model.Post;
import com.exilant.blog.model.User;
@Service
public class PostServiceImp implements PostService{
	
	@Autowired
	private PostRepository post;
//	  private List<Post> posts = new ArrayList<Post>() {{
//	        add(new Post(1L, "First Post", "<p>Line #1.</p><p>Line #2</p>", null));
//	        add(new Post(2L, "Second Post",
//	        "Second post content:<ul><li>line 1</li><li>line 2</li></p>",
//	        new User(10L, "pesho10", "Peter Ivanov")));
//	        add(new Post(3L, "Post #3", "<p>The post number 3 nice</p>",
//	        new User(10L, "merry", null)));
//	        add(new Post(4L, "Forth Post", "<p>Not interesting post</p>", null));
//	        add(new Post(5L, "Post Number 5", "<p>Just posting</p>", null));
//	        add(new Post(6L, "Sixth Post", "<p>Another interesting post</p>", null));
//	    }};

	    @Override
	    public List<Post> findAll() {
	        return post.findAll();
	    }

	    @Override
	    public List<Post> findLatest5Posts(){
	    	
	    	List<Post> post5=post.findAll().stream()
	    			.limit(5).collect(Collectors.toList());
			return post5;
	    	
	    }

	    @Override
	    public Post findById(Long id) {
	    	
	    		return post.getOne(id);
	    	
	    }

	    @Override
	    public Post create(Post post1) {
	        
	        return post.save(post1);
	    }

	    @Override
	    public Post edit(Post post1) {
	    	
	    	Post p=post.getOne(post1.getId());
	    	if(p!=null) {
	    		
	    		p.setBody(post1.getBody());
	    		p.setTitle(post1.getTitle());
	    	}
	        throw new RuntimeException("Post not found: " + post1.getId());
	    }

	    @Override
	    public String deleteById(Long id) {
	     Post p=post.getOne(id);
	     if(p!=null) {
	    	 post.deleteById(id);
	    	 return "deletion success";
	     }
	    
	        throw new RuntimeException("Post not found: " + id);
	    }
}
