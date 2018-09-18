package com.example.moneydrop;

public class FalseAnswer {
	int answerId;
	String answerName;
	int questionAndCorrectAnswerId;
	public FalseAnswer(){
		
	}
	public FalseAnswer(int answerId, String answerName,
			int questionAndCorrectAnswerId) {
		super();
		this.answerId = answerId;
		this.answerName = answerName;
		this.questionAndCorrectAnswerId = questionAndCorrectAnswerId;
	}

	public FalseAnswer(String answerName, int questionAndCorrectAnswerId) {
		super();
		this.answerName = answerName;
		this.questionAndCorrectAnswerId = questionAndCorrectAnswerId;
	}

	public int getAnswerId() {
		return answerId;
	}
	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}
	public String getAnswerName() {
		return answerName;
	}
	public void setAnswerName(String answerName) {
		this.answerName = answerName;
	}
	public int getQuestionAndCorrectAnswerId() {
		return questionAndCorrectAnswerId;
	}
	public void setQuestionAndCorrectAnswerId(int questionAndCorrectAnswerId) {
		this.questionAndCorrectAnswerId = questionAndCorrectAnswerId;
	}
	
}
