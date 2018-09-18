package com.example.moneydrop;

public class QuestionAndCorrectAnswer {
	int questionId;
	String questionStatus;
	public String getQuestionStatus() {
		return questionStatus;
	}
	public void setQuestionStatus(String questionStatus) {
		this.questionStatus = questionStatus;
	}
	int categoryId;
	String correctAnswerName;
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public QuestionAndCorrectAnswer(){
	}
	public QuestionAndCorrectAnswer(String questionStatus, int categoryId,
			String correctAnswerName) {
		super();
		this.questionStatus = questionStatus;
		this.categoryId = categoryId;
		this.correctAnswerName = correctAnswerName;
	}
	public QuestionAndCorrectAnswer(int questionId, String questionStatus,
			int categoryId, String correctAnswerName) {
		super();
		this.questionId = questionId;
		this.questionStatus = questionStatus;
		this.categoryId = categoryId;
		this.correctAnswerName = correctAnswerName;
	}
	public String getCorrectAnswerName() {
		return correctAnswerName;
	}
	public void setCorrectAnswerName(String correctAnswerName) {
		this.correctAnswerName = correctAnswerName;
	}
	
}
