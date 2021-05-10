package com.map;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Question {
	@Id
	@Column(name = "question_id")
	private int questionId;

	@OneToMany(mappedBy ="question" )
	private List<Answer> answers;

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public List<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer> answer) {
		this.answers = answers;
	}

	private String question;

	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Question(int questionId, List<Answer> answers, String question) {
		super();
		this.questionId = questionId;
		this.answers = answers;
		this.question = question;
	}

}
