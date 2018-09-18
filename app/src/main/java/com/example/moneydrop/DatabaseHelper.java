package com.example.moneydrop;


import java.util.ArrayList;
import java.util.List;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DatabaseHelper extends SQLiteOpenHelper{
	private static final String LOG = "DatabaseHelper";
	 
    // Database Version
    private static final int DATABASE_VERSION = 1;
 
    // Database Name
    private static final String DATABASE_NAME = "MoneyDrop";
 
    // Table Names
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
    
  //Category table create statement
    private static final String CREATE_TABLE_CATEGORY = "CREATE TABLE "
           + TABLE_CATEGORY + "(" + KEY_ID + " INTEGER PRIMARY KEY," + KEY_QUESTION_NAME
           + " TEXT," + KEY_LEVEL + " TEXT" + ")";
    
    //Question_And_Correct_Answer table create statement
    private static final String CREATE_TABLE_QUESTION_AND_CORRECT_ANSWER = "CREATE TABLE "
            + TABLE_QUESTION_AND_CORRECT_ANSWER + "(" + KEY_QUESTION_ID + " INTEGER PRIMARY KEY,"
            + KEY_QUESTION_STATUS + " TEXT," + KEY_CATEGORY_ID + " INTEGER,"
            + KEY_CORRECT_ANSWER_NAME + " TEXT" + ")";
    
    //False_Answer table create statement
    private static final String CREATE_TABLE_FALSE_ANSWER = "CREATE TABLE " + TABLE_FALSE_ANSWER
            + "(" + KEY_ANSWER_ID + " INTEGER PRIMARY KEY," + KEY_ANSWER_NAME + " TEXT,"
            + KEY_QUESTION_AND_CORRECT_ANSWER_ID + " INTEGER" + ")";
    
    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    
    @Override
    public void onCreate(SQLiteDatabase db) {
 
        // creating required tables
        db.execSQL(CREATE_TABLE_CATEGORY);
        db.execSQL(CREATE_TABLE_FALSE_ANSWER);
        db.execSQL(CREATE_TABLE_QUESTION_AND_CORRECT_ANSWER);
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // on upgrade drop older tables
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_CATEGORY);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_QUESTION_AND_CORRECT_ANSWER);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_FALSE_ANSWER);
 
        // create new tables
        onCreate(db);
    }
    public void createCategory(Category category) {
        SQLiteDatabase db = this.getWritableDatabase();
     
        ContentValues values = new ContentValues();
        values.put(KEY_QUESTION_NAME, category.getQuestionName());
        values.put(KEY_LEVEL, category.getLevel());
     
        // insert row
         db.insert(TABLE_CATEGORY, null, values);
    }
    public Category getCategory(int id) {
        SQLiteDatabase db = this.getReadableDatabase();
     
        //String selectQuery = "SELECT  * FROM " + TABLE_CATEGORY + " WHERE "
               // + KEY_ID + " = " + id;
        String selectQuery = "SELECT  * FROM category WHERE _id="+id+";";
     
        Log.e(LOG, selectQuery);
     
        Cursor c = db.rawQuery(selectQuery, null);
     
        if (c != null)
            c.moveToFirst();
     
        Category category = new Category();
        category.setId(c.getInt(c.getColumnIndex(KEY_ID)));
        category.setQuestionName((c.getString(c.getColumnIndex(KEY_QUESTION_NAME))));
        category.setLevel(c.getString(c.getColumnIndex(KEY_LEVEL)));
     
        return category;
    }
    
    public void createQuestionAndCorrectAnswer(QuestionAndCorrectAnswer correct) {
        SQLiteDatabase db = this.getWritableDatabase();
     
        ContentValues values = new ContentValues();
        values.put(KEY_QUESTION_STATUS, correct.getQuestionStatus());
        values.put(KEY_CATEGORY_ID, correct.getCategoryId());
        values.put(KEY_CORRECT_ANSWER_NAME, correct.getCorrectAnswerName());
     
        // insert row
        db.insert(TABLE_QUESTION_AND_CORRECT_ANSWER, null, values);
    }
    public QuestionAndCorrectAnswer getQuestionAndCorrectAnswer(int id) {
        SQLiteDatabase db = this.getReadableDatabase();
     
        //String selectQuery = "SELECT  * FROM " + TABLE_QUESTION_AND_CORRECT_ANSWER + " WHERE "
                //+ KEY_QUESTION_ID + " = " + question_id;
        String selectQuery = "SELECT  * FROM question_and_correct_answer WHERE _id="+id+";";
     
        Log.e(LOG, selectQuery);
     
        Cursor c = db.rawQuery(selectQuery, null);
     
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
        SQLiteDatabase db = this.getReadableDatabase();
     
        //String selectQuery = "SELECT " + KEY_QUESTION_ID + "FROM " + TABLE_QUESTION_AND_CORRECT_ANSWER + " WHERE "
                //+ KEY_CATEGORY_ID + " = " + id;
        String selectQuery = "SELECT _id FROM question_and_correct_answer WHERE category_id="+id+";";
     
        Log.e(LOG, selectQuery);
        
        int index;
        Cursor c = db.rawQuery(selectQuery, null);
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
     
        Log.e(LOG, selectQuery);
     
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = db.rawQuery(selectQuery, null);
     
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
     
        Log.e(LOG, selectQuery);
     
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = db.rawQuery(selectQuery, null);
     
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

    public void createFalseAnswer(FalseAnswer falseAns) {
        SQLiteDatabase db = this.getWritableDatabase();
 
        ContentValues values = new ContentValues();
        values.put(KEY_ANSWER_NAME, falseAns.getAnswerName());
        values.put(KEY_QUESTION_AND_CORRECT_ANSWER_ID, falseAns.getQuestionAndCorrectAnswerId());
        
        db.insert(TABLE_FALSE_ANSWER, null, values);
    }
    public FalseAnswer getFalseAnswer(int answer_id) {
        SQLiteDatabase db = this.getReadableDatabase();
     
        String selectQuery = "SELECT  * FROM " + TABLE_QUESTION_AND_CORRECT_ANSWER + " WHERE "
                + KEY_QUESTION_ID + " = " + answer_id;
     
        Log.e(LOG, selectQuery);
     
        Cursor c = db.rawQuery(selectQuery, null);
     
        if (c != null)
            c.moveToFirst();
     
        FalseAnswer falseAns = new FalseAnswer();
        falseAns.setAnswerId(c.getInt(c.getColumnIndex(KEY_ANSWER_ID)));
        falseAns.setAnswerName((c.getString(c.getColumnIndex(KEY_ANSWER_NAME))));
        falseAns.setQuestionAndCorrectAnswerId(c.getInt(c.getColumnIndex(KEY_QUESTION_AND_CORRECT_ANSWER_ID)));
     
        return falseAns ;
    }

}
