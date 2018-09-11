package com.exilant.blog.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table
public class Post {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String title;
	private String body;
	
//	 @ManyToOne(optional = false, fetch = FetchType.LAZY)
//	private User author;
	private Date date = new Date();
	public Post() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Post(Long id, String title, String body) {
		super();
		this.id = id;
		this.title = title;
		this.body = body;
	
		
	}
	@Override
	public String toString() {
		return "Post [id=" + id + ", title=" + title + ", body=" + body + ", date=" + date + "]";
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
//	public User getAuthor() {
//		return author;
//	}
//	public void setAuthor(User author) {
//		this.author = author;
//	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
}
