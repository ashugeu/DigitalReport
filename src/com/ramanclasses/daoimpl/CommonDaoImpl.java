package com.ramanclasses.daoimpl;


import java.sql.Types;

import org.springframework.jdbc.core.simple.SimpleJdbcDaoSupport;
import org.springframework.jdbc.core.support.JdbcDaoSupport;


import com.ramanclasses.reportsql.UserSql;
import com.ramanclasses.dao.CommonDao;
import com.ramanclasses.daoimpl.User;



public class CommonDaoImpl extends SimpleJdbcDaoSupport implements CommonDao{
		
    
	@Override
	public User getUser(String email, String password) {
		// TODO Auto-generated method stub
		Object [] params = new Object [] {email,password};
		int [] types = new int [] {Types.VARCHAR,Types.VARCHAR} ;
		
		User user=null;
		
		try
		{
			user = (User)getJdbcTemplate().queryForObject(UserSql.FIND_USER_EXIST, params, types, new UserMapper());
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
			userType = getJdbcTemplate().queryForObject(UserSql.GET_USER_TYPE,params,types,String.class);
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
			userId = getJdbcTemplate().queryForObject(UserSql.GET_USER_ID,params,types,Long.class);
		}
		catch(Exception e)
		{
			System.out.println("Error happened in getting User ID for user name="+email+"   "+e);
		}
	
		return userId;
	}


}