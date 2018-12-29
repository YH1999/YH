package com.service;

import java.util.List;

import com.entity.User;

public interface service {
	public User findUser(String uname,String upwd);
	
	public int insert(User u);
	
	public List<User> sel(User u);
	
	public User selone(int uid);
	
	public int update(User u);
	
	public  int delete(User u);
	
	public int count();
	
	public List<User> page(int pagesize,int currNo);
}
