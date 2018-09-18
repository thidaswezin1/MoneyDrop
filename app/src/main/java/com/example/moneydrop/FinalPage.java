package com.example.moneydrop;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class FinalPage extends Activity implements View.OnClickListener {
private Button btnexit,btnTry;
long totalAmount;String total;TextView kyats;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.finalpage);
		Intent svc=new Intent(this,Background.class);
		stopService(svc);
		Intent svc1=new Intent(this,congrazSound.class);
		startService(svc1);
		//view1=(View)findViewById(R.id.view1);
		
		Intent intent=getIntent();
		total=intent.getStringExtra(ShowCorrectAndAmount7.EXTRA_MESSAGE1);
		totalAmount=Integer.parseInt(total);
		
		btnexit=(Button)findViewById(R.id.btnexit);
		//view1.setOnTouchListener(this);
		btnexit.setOnClickListener((OnClickListener) this);
		btnTry=(Button)findViewById(R.id.button1);
		btnTry.setOnClickListener((OnClickListener) this);
		
		kyats=(TextView)findViewById(R.id.textView4);
		kyats.setText(total);
		
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
		if(v==btnexit){
    	Intent svc1=new Intent(this,congrazSound.class);
    	stopService(svc1);
    	Intent intent=new Intent(Intent.ACTION_MAIN);
		intent.addCategory(Intent.CATEGORY_HOME);
		intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		startActivity(intent);
    	finish();
		System.exit(0);
		}
		else if(v==btnTry){
			Intent intt=new Intent(this,congrazSound.class);
			stopService(intt);
			Intent intent=new Intent(this,WelcomePage.class);
			startActivity(intent);
			
		}
	}
}

