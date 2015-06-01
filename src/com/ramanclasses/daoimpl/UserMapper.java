package com.ramanclasses.daoimpl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;



public class UserMapper implements RowMapper {
		@Override
		public Object mapRow(ResultSet rs, int rownum) throws SQLException {
			// TODO Auto-generated method stub
			Long userId = Long.valueOf(rs.getLong("U_ID"));
			String userName = rs.getString("U_EMAIL");
			String userPass = rs.getString("U_PASSWORD");
			String userType = rs.getString("U_TYPE");
			
			User model = new User();
			model.setId(userId);
			model.setEmail(userName);
			model.setType(userType);
			model.setPass(userPass);
			
			return model;
		}

}

