package com.example.moneydrop;

import java.util.Random;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class QuestionTypePage4 extends Activity implements OnClickListener,RadioGroup.OnCheckedChangeListener{
	Button btnGo;RadioGroup group;String questionType;
	int id,id1,id2;int random1,random2;
	String index,total;
	String questionName1,questionName2;String level;
	RadioButton question1,question2;
	public static final String EXTRA_MESSAGE1="key1";
	public static final String EXTRA_MESSAGE2="key2";
	public static final String EXTRA_MESSAGE3="key3";
	private DatabaseAccess db;
	int totalAmount;
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.questiontypepage1);
        Intent intent=getIntent();
        total=intent.getStringExtra(ShowCorrectAndAmount3.EXTRA_MESSAGE1);
        totalAmount=Integer.parseInt(total);
        db=DatabaseAccess.getInstance(this);
        db.open();
        
        group=(RadioGroup)findViewById(R.id.group);
        final int min1 = 11;
        final int max1 = 18;
        Random r=new Random();
        random1 = r.nextInt((max1 - min1) + 1) + min1;
        do{
        	random2=r.nextInt((max1 - min1)+1)+min1;
        }while(random1==random2);
        Category category1=db.getCategory(random1);
        Category category2=db.getCategory(random2);
        questionName1=category1.getQuestionName();
        id1=category1.getId();
        level=category1.getLevel();
        questionName2=category2.getQuestionName();
        id2=category2.getId();
        
        question1=(RadioButton)findViewById(R.id.radio1);
        question2=(RadioButton)findViewById(R.id.radio2);
        question1.setText(questionName1);
        question2.setText(questionName2);
        
        group.setOnCheckedChangeListener(this);
        btnGo=(Button)findViewById(R.id.button1);
        btnGo.setOnClickListener(this);
	}
	public void onBackPressed(){
		new AlertDialog.Builder(this)
		.setMessage("Do you want to exit?")
		.setPositiveButton("Yes",new DialogInterface.OnClickListener() {
			
			public void onClick(DialogInterface arg0, int arg1) {
				
				Intent svc=new Intent(getApplicationContext(), Background.class);
				stopService(svc);
				Intent intent=new Intent(Intent.ACTION_MAIN);
				intent.addCategory(Intent.CATEGORY_HOME);
				intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(intent);
		    	finish();
				System.exit(0);
				
			}
		})
		.setNegativeButton("No",new DialogInterface.OnClickListener() {
			
			
			public void onClick(DialogInterface arg0, int arg1) {
				// TODO Auto-generated method stub
				
			}
		}).show();
		
	}
	public void onCheckedChanged(RadioGroup group, int checked){
		switch (checked){
		case R.id.radio1:
			questionType=questionName1;
			id=id1;
			break;
		case R.id.radio2:
			id=id2;
			questionType=questionName2;
			break;
		default:
			questionType=null;
			
		}
	}
	@Override
	public void onClick(View v) {
			if(questionType!=null){
				Intent intent=new Intent(this,QuestionAndAnswer4.class);
				index=String.valueOf(id);
				intent.putExtra(EXTRA_MESSAGE1,total);
				intent.putExtra(EXTRA_MESSAGE3, index);
				startActivity(intent);
			}
			else{
				new AlertDialog.Builder(this)
				.setMessage("Please Choose at least one question type!!!")
				.setNeutralButton("Ok", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface dlg, int sumthin) {
						// TODO Auto-generated method stub
						//do nothing - it will close on its own
					}
				})
				.show();
			}	
	}
}
