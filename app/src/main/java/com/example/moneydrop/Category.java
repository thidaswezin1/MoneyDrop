package com.example.moneydrop;

public class Category {
	int id;
	String question_name;
	String level;
	public Category(){
	}
	public Category(int id,String question_name){
		this.id=id;
		this.question_name=question_name;
	}
	public Category(int id,String question_name,String level){
		this.id=id;
		this.question_name=question_name;
		this.level=level;
	}
	public Category(String question_name,String level){
		this.question_name=question_name;
		this.level=level;
	}
	public void setId(int id){
		this.id=id;
	}
	public void setQuestionName(String question_name){
		this.question_name=question_name;
	}
	public void setLevel(String level){
		this.level=level;
	}
	public int getId(){
		return id;
	}
	public String getQuestionName(){
		return question_name;
	}
	public String getLevel(){
		return level;
	}
}
