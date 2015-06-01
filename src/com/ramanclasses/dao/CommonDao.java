package com.ramanclasses.dao;


import javax.sql.DataSource;

import com.ramanclasses.daoimpl.User;

public interface CommonDao {
	
	public void setDataSource(DataSource ds);
	public User getUser(String email,String password);
	
	public String getUserType(int userId);
	
	
	public Long getUserId(String email);
	
}
