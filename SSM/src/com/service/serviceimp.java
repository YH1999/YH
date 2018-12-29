package com.service;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Dao.UserDao;
import com.entity.User;

@Service
public class serviceimp implements service {
			@Resource
			private UserDao ud;
	@Override
	public User findUser(String uname, String upwd) {
		// TODO Auto-generated method stub
		return ud.findUser(uname, upwd);
	}
	@Override
	public int insert(User u) {
		// TODO Auto-generated method stub
		return ud.insert(u);
	}
	@Override
	public List<User> sel(User u) {
		// TODO Auto-generated method stub
		return ud.sel(u);
	}
	@Override
	public int update(User u) {
		// TODO Auto-generated method stub
		return ud.update(u);
	}
	@Override
	public int count() {
		// TODO Auto-generated method stub
		return ud.count();
	}
	@Override
	public List<User> page(int pagesize, int currNo) {
		// TODO Auto-generated method stub
		return ud.page(pagesize, currNo);
	}
	@Override
	public User selone(int uid) {
		// TODO Auto-generated method stub
		return ud.selone(uid);
	}
	@Override
	public int delete(User u) {
		// TODO Auto-generated method stub
		return ud.delete(u);
	}

}
