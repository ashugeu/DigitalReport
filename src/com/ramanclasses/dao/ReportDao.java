package com.ramanclasses.dao;

import java.util.List;

import javax.sql.DataSource;

import com.ramanclasses.daoimpl.Reports;

public interface ReportDao {

	public void setDataSource(DataSource dataSource);
	public List<Reports> getReports(String userId);
	
	
}
