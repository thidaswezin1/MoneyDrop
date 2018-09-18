package com.example.moneydrop;

import android.os.Bundle;
import android.view.View.OnClickListener;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ShowCorrectAndAmount4 extends Activity implements OnClickListener{
	TextView text1,text2;long totalAmount=0;String correctAnswer;
	String total;Button btnNext;
	public static final String EXTRA_MESSAGE1="key1";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.showcorrectandamount1);
		Intent intent=getIntent();
		total=intent.getStringExtra(QuestionAndAnswer4.EXTRA_MESSAGE1);
		correctAnswer=intent.getStringExtra(QuestionAndAnswer4.EXTRA_MESSAGE2);
		totalAmount=Integer.parseInt(total);
		
		text1=(TextView)findViewById(R.id.textView2);
		text2=(TextView)findViewById(R.id.textView4);
		text1.setText(total);
		text2.setText(correctAnswer);
		btnNext=(Button)findViewById(R.id.button1);
		btnNext.setOnClickListener(this);
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
	public void onClick(View v){
		if(totalAmount>=100000){
			Intent intent=new Intent(this,QuestionTypePage5.class);
			intent.putExtra(EXTRA_MESSAGE1,total);
			startActivity(intent);
		}
		else{
			Intent intent=new Intent(this,ExitPage.class);
			intent.putExtra(EXTRA_MESSAGE1,total);
			startActivity(intent);
		}
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.show_correct_and_amount, menu);
		return true;
	}

}
