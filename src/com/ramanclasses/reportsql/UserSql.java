package com.ramanclasses.reportsql;

public interface UserSql {

		String FIND_USER_EXIST = "select * from users where email=?, password=?";
		String GET_USER_TYPE = "select u_type from users where u_id=?";
		String GET_USER_ID = "select u_id from users where u_name=?";
		String GET_REPORTS = "select * from reports where u_id=?";
}