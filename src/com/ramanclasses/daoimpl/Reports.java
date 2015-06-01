package com.ramanclasses.daoimpl;

import java.util.Date;



public class Reports {

	Long userId;
	Date submissionTime;
	Date sleepTime;
	Date WakeUpTime;
	float studyHours;
	String difficultyFaced;
	Long reportId;
	String comments;
	
	
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public Long getReportId() {
		return reportId;
	}
	public void setReportId(Long reportId) {
		this.reportId = reportId;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Date getSubmissionTime() {
		return submissionTime;
	}
	public void setSubmissionTime(Date submissionTime) {
		this.submissionTime = submissionTime;
	}
	public Date getSleepTime() {
		return sleepTime;
	}
	public void setSleepTime(Date sleepTime) {
		this.sleepTime = sleepTime;
	}
	public Date getWakeUpTime() {
		return WakeUpTime;
	}
	public void setWakeUpTime(Date wakeUpTime) {
		WakeUpTime = wakeUpTime;
	}
	public float getStudyHours() {
		return studyHours;
	}
	public void setStudyHours(float studyHours) {
		this.studyHours = studyHours;
	}
	public String getDifficultyFaced() {
		return difficultyFaced;
	}
	public void setDifficultyFaced(String difficultyFaced) {
		this.difficultyFaced = difficultyFaced;
	}

}
