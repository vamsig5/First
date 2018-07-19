package com.training.exilant.restfulworks.user;

import java.util.Date;

public class User {
	private Integer userId;
	private String uname;
	private Date birthDate;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int userId, String uname, Date birthDate) {
		super();
		this.userId = userId;
		this.uname = uname;
		this.birthDate = birthDate;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", uname=" + uname + ", birthDate=" + birthDate + "]";
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	
}
