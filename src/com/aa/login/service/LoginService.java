package com.aa.login.service;


import java.sql.SQLException;

import com.aa.login.dao.UserDao;
import com.aa.login.pojo.User;


public class LoginService {
	private UserDao dao = new UserDao();
	public boolean select(User user) throws ClassNotFoundException, SQLException{
		return dao.select(user);
	}
	public void insert(User user) throws ClassNotFoundException, SQLException{
		dao.insert(user);
	}
}
