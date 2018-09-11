package com.exilant.blog.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;
@Entity
@Table

public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String username;
	private String password;
	private String fullName;
	private String mobile;
//	@OneToMany(mappedBy = "author")
//	private Set<Post> posts = new HashSet<>();
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(Long id, String username, String fullName,String mobile,String password) {
		super();
		this.id = id;
		this.username = username;
		
		this.fullName = fullName;
		this.mobile=mobile;
		this.password=password;
	
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", fullName=" + fullName
				+ "]";
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
//	public Set<Post> getPosts() {
//		return posts;
//	}
//	public void setPosts(Set<Post> posts) {
//		this.posts = posts;
//	}
	
}
