package com.ramanclasses.dao;


import javax.sql.DataSource;

import com.ramanclasses.daoimpl.User;

public interface CommonDao {
	
	public User getUser(String email,String password);
	
	public String getUserType(int userId);
	
	
	public Long getUserId(String email);
	
}
