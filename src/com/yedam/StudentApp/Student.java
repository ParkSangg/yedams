package com.yedam.StudentApp;

public class Student {
	private String studentNo;
	private String Name;
	private String gender;
	private int score;
	
	void setStudentNo(String stn) {
		this.studentNo = stn;
	}
	String getStudentNo() {
		return studentNo;
	}
	void setName(String name) {
		this.Name = name;
	}
	String getName() {
		return this.Name;
	}
	void setGender(String sex) {
		this.gender = sex;
	}
	String getGender() {
		return this.gender;
	}
	void setScore(int score) {
		this.score=score;
	}
	int getScore() {
		return this.score;
	}
}
