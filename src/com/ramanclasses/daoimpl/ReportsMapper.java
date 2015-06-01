package com.ramanclasses.daoimpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import org.springframework.jdbc.core.RowMapper;


public class ReportsMapper implements RowMapper {

	public Object mapRow(ResultSet rs, int rownum) throws SQLException {
		// TODO Auto-generated method stub
		Long userId = Long.valueOf(rs.getLong("U_ID"));
		Long reportId = Long.valueOf(rs.getLong("R_ID"));
		Date submissionTime = rs.getDate("SUBMISSION_TIME");
		Date sleepTime = rs.getDate("SLEEP_TIME");
		Date wakeUpTime = rs.getDate("WAKE_UP_TIME");
		float studyHours = rs.getFloat("STUDY_HOURS");
		String difficultyFaced = rs.getString("DIFFICULTY_FACED");
		String comments = rs.getString("COMMENTS");
		
		Reports model = new Reports();
		model.setUserId(userId);
		model.setReportId(reportId);
		model.setSubmissionTime(submissionTime);
		model.setDifficultyFaced(difficultyFaced);
		model.setSleepTime(sleepTime);
		model.setStudyHours(studyHours);
		model.setWakeUpTime(wakeUpTime);
		model.setComments(comments);
		return model;
	}

}



