package com.hiberProject1Pract.HiberPractice1;

import javax.persistence.Embeddable;

@Embeddable
public class Certificate {
	private String cCourse;
	private String cDuration;

	public String getcCourse() {
		return cCourse;
	}

	public void setcCourse(String cCourse) {
		this.cCourse = cCourse;
	}

	public String getcDuration() {
		return cDuration;
	}

	public void setcDuration(String cDuration) {
		this.cDuration = cDuration;
	}

	public Certificate() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Certificate(String cCourse, String cDuration) {
		super();
		this.cCourse = cCourse;
		this.cDuration = cDuration;
	}

}
