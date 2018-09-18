package com.example.moneydrop;

import java.util.ArrayList;
import java.util.List;


import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class DatabaseAccess {
	private SQLiteOpenHelper openHelper;
	private SQLiteDatabase database;
	private static DatabaseAccess instance;
	public DatabaseAccess (Context context){
		this.openHelper=new DatabaseOpenHelper(context);
	}
	public static DatabaseAccess getInstance(Context context){
		if(instance==null){
			instance=new DatabaseAccess(context);
		}
		return instance;
	}
	public void open(){
		this.database=openHelper.getWritableDatabase();
	}
	public void close(){
		if(database!=null){
			this.database.close();
		}
	}
	 private static final String TABLE_CATEGORY= "category";
	    private static final String TABLE_QUESTION_AND_CORRECT_ANSWER = "question_and_correct_answer";
	    private static final String TABLE_FALSE_ANSWER = "false_answer";
	  //Category Table column names
    private static final String KEY_ID = "_id";
    private static final String KEY_QUESTION_NAME = "question_name";
    private static final String KEY_LEVEL = "level";
    
  //Question_And_Correct_Answer Table column names
    private static final String KEY_QUESTION_ID = "_id";
    private static final String KEY_QUESTION_STATUS = "question_name";
    private static final String KEY_CATEGORY_ID = "category_id";
    private static final String KEY_CORRECT_ANSWER_NAME = "correct_answer";
    
    //False_Answer Table column names
    private static final String KEY_ANSWER_ID = "_id";
    private static final String KEY_ANSWER_NAME = "question_name";
    private static final String KEY_QUESTION_AND_CORRECT_ANSWER_ID = "question_and_correct_answer_id";
	 public Category getCategory(int id) {
	        
	     
	        //String selectQuery = "SELECT  * FROM " + TABLE_CATEGORY + " WHERE "
	               // + KEY_ID + " = " + id;
	        String selectQuery = "SELECT  * FROM category WHERE _id="+id+";";
	     
	        
	     
	        Cursor c = database.rawQuery(selectQuery, null);
	     
	        if (c != null)
	            c.moveToFirst();
	     
	        Category category = new Category();
	        category.setId(c.getInt(c.getColumnIndex(KEY_ID)));
	        category.setQuestionName((c.getString(c.getColumnIndex(KEY_QUESTION_NAME))));
	        category.setLevel(c.getString(c.getColumnIndex(KEY_LEVEL)));
	     
	        return category;
	    }
	    
	    
	    public QuestionAndCorrectAnswer getQuestionAndCorrectAnswer(int id) {
	        
	     
	        //String selectQuery = "SELECT  * FROM " + TABLE_QUESTION_AND_CORRECT_ANSWER + " WHERE "
	                //+ KEY_QUESTION_ID + " = " + question_id;
	        String selectQuery = "SELECT  * FROM question_and_correct_answer WHERE _id="+id+";";
	     
	        
	     
	        Cursor c = database.rawQuery(selectQuery, null);
	     
	        if (c != null)
	        	c.moveToFirst();
	        
	        QuestionAndCorrectAnswer correct = new QuestionAndCorrectAnswer();
		    correct.setQuestionId(c.getInt(c.getColumnIndex(KEY_QUESTION_ID)));
		    correct.setQuestionStatus(c.getString(c.getColumnIndex(KEY_QUESTION_STATUS)));
		    correct.setCategoryId(c.getInt(c.getColumnIndex(KEY_CATEGORY_ID)));
		    correct.setCorrectAnswerName(c.getString(c.getColumnIndex(KEY_CORRECT_ANSWER_NAME)));
		    
	        return correct;
	    }
	    public List<Integer> getQuestionId(int id) {
	    	List<Integer> questionId=new ArrayList<Integer>();
	        
	     
	        //String selectQuery = "SELECT " + KEY_QUESTION_ID + "FROM " + TABLE_QUESTION_AND_CORRECT_ANSWER + " WHERE "
	                //+ KEY_CATEGORY_ID + " = " + id;
	        String selectQuery = "SELECT _id FROM question_and_correct_answer WHERE category_id="+id+";";
	     
	        
	        
	        int index;
	        Cursor c = database.rawQuery(selectQuery, null);
	        if (c != null)
	            c.moveToFirst();
	        
	            while(!c.isAfterLast()){
	            	index=c.getInt((c.getColumnIndex(KEY_QUESTION_ID)));
	                questionId.add(index);
	                c.moveToNext();
	            } 
	        return questionId;
	    }
	    public List<QuestionAndCorrectAnswer> getAllQuestion(int id) {
	        List<QuestionAndCorrectAnswer> questionList = new ArrayList<QuestionAndCorrectAnswer>();
	        //String selectQuery = "SELECT  * FROM " + TABLE_QUESTION_AND_CORRECT_ANSWER + " WHERE "
	                //+ KEY_CATEGORY_ID + " = " + id;
	        String selectQuery = "SELECT * FROM question_and_correct_answer WHERE category_id="+id+";";
	     
	       
	     
	        
	        Cursor c = database.rawQuery(selectQuery, null);
	     
	        // looping through all rows and adding to list
	        if (c.moveToFirst()) {
	            do {
	                QuestionAndCorrectAnswer question = new QuestionAndCorrectAnswer();
	                question.setQuestionId(c.getInt((c.getColumnIndex(KEY_QUESTION_ID))));
	                question.setQuestionStatus((c.getString(c.getColumnIndex(KEY_QUESTION_STATUS))));
	                question.setCategoryId((c.getInt(c.getColumnIndex(KEY_CATEGORY_ID))));
	                question.setCorrectAnswerName((c.getString(c.getColumnIndex(KEY_CORRECT_ANSWER_NAME))));
	     
	                // adding to questionList list
	                questionList.add(question);
	            } while (c.moveToNext());
	        }
	     
	        return questionList;
	    }
	    
	    public List<FalseAnswer> getAllFalseAnswer(int id) {
	        List<FalseAnswer> falseAnswer = new ArrayList<FalseAnswer>();
	        String selectQuery = "SELECT  * FROM " + TABLE_FALSE_ANSWER + " WHERE "
	                + KEY_QUESTION_AND_CORRECT_ANSWER_ID + " = " + id;
	     
	        
	     
	        
	        Cursor c = database.rawQuery(selectQuery, null);
	     
	        // looping through all rows and adding to list
	        if (c.moveToFirst()) {
	            do {
	                FalseAnswer answer = new FalseAnswer();
	                answer.setAnswerId(c.getInt((c.getColumnIndex(KEY_ANSWER_ID))));
	                answer.setAnswerName((c.getString(c.getColumnIndex(KEY_ANSWER_NAME))));
	                answer.setQuestionAndCorrectAnswerId((c.getInt(c.getColumnIndex(KEY_QUESTION_AND_CORRECT_ANSWER_ID))));
	     
	                // adding to falseAnswer list
	                falseAnswer.add(answer);
	            } while (c.moveToNext());
	        }
	     
	        return falseAnswer;
	    }

	   
	    public FalseAnswer getFalseAnswer(int answer_id) {
	        
	     
	        String selectQuery = "SELECT  * FROM " + TABLE_QUESTION_AND_CORRECT_ANSWER + " WHERE "
	                + KEY_QUESTION_ID + " = " + answer_id;
	     
	        
	     
	        Cursor c = database.rawQuery(selectQuery, null);
	     
	        if (c != null)
	            c.moveToFirst();
	     
	        FalseAnswer falseAns = new FalseAnswer();
	        falseAns.setAnswerId(c.getInt(c.getColumnIndex(KEY_ANSWER_ID)));
	        falseAns.setAnswerName((c.getString(c.getColumnIndex(KEY_ANSWER_NAME))));
	        falseAns.setQuestionAndCorrectAnswerId(c.getInt(c.getColumnIndex(KEY_QUESTION_AND_CORRECT_ANSWER_ID)));
	     
	        return falseAns ;
	    }

	}
	


