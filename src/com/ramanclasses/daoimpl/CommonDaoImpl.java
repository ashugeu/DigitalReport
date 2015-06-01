package com.ramanclasses.daoimpl;


import java.sql.Types;
import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcDaoSupport;

import com.ramanclasses.reportsql.UserSql;
import com.ramanclasses.dao.CommonDao;
import com.ramanclasses.daoimpl.User;



public class CommonDaoImpl  implements CommonDao{
	

	 private DataSource dataSource;
	 private JdbcTemplate jdbcTemplateObject;
	   
	 public void setDataSource(DataSource dataSource) {
	      this.dataSource = dataSource;
	      this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	 }
	   
	@Override
	public User getUser(String email, String password) {
		// TODO Auto-generated method stub
		Object [] params = new Object [] {email,password};
		int [] types = new int [] {Types.VARCHAR,Types.VARCHAR} ;
		
		User user=null;
		
		try
		{
			user = (User) jdbcTemplateObject.query(UserSql.FIND_USER_EXIST, params, types, new UserMapper());
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		return user;
	}

	@Override
	public String getUserType(int userId) {
		// TODO Auto-generated method stub
		String userType = null;
		Object [] params = new Object [] {userId};
		int [] types = new int [] {Types.NUMERIC} ;
		try
		{
			userType = (String)jdbcTemplateObject.queryForObject(UserSql.GET_USER_TYPE,params,types,String.class);
		}
		catch(Exception e)
		{
			System.out.println("Error happened in getting contactEmail for user id="+userId+"   "+e);
		}
	
		return userType;
	}

	@Override
	public Long getUserId(String email) {
		// TODO Auto-generated method stub
		Long userId = null;
		Object [] params = new Object [] {email};
		int [] types = new int [] {Types.VARCHAR} ;
		try
		{
			userId = (Long)jdbcTemplateObject.queryForObject(UserSql.GET_USER_ID,params,types,Long.class);
		}
		catch(Exception e)
		{
			System.out.println("Error happened in getting User ID for user name="+email+"   "+e);
		}
	
		return userId;
	}
}