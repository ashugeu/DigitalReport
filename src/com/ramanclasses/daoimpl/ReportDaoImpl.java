package com.ramanclasses.daoimpl;

import java.sql.Types;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.ramanclasses.dao.ReportDao;
import com.ramanclasses.reportsql.UserSql;

public class ReportDaoImpl implements ReportDao{

	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;
	   
	public void setDataSource(DataSource dataSource) {
	      this.dataSource = dataSource;
	      this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}
	 
	public List<Reports> getReports(String userId) {
		// TODO Auto-generated method stub
		Object [] params = new Object [] {userId};
		int [] types = new int [] {Types.NUMERIC} ;
		
		List<Reports> reports=null;
		
		try
		{
			reports = jdbcTemplateObject.query(UserSql.GET_REPORTS, params, types, new ReportsMapper());
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		return reports;
	}

}
