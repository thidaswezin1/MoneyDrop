package com.example.moneydrop;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ExitPage extends Activity implements View.OnClickListener {
private Button btnexit,btnTry;

	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.exitpage);
		Intent svc=new Intent(this,Background.class);
		stopService(svc);
		Intent svc1=new Intent(this,GameOverSound.class);
		startService(svc1);
		btnexit=(Button)findViewById(R.id.btnExit);
		btnexit.setOnClickListener(this);
		btnTry=(Button)findViewById(R.id.button1);
		btnTry.setOnClickListener((OnClickListener) this);
	
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
			
				
			}
		}).show();
		
	}
	public void onClick(View v){
		if(v==btnexit){
		Intent svc=new Intent(this,GameOverSound.class);
		stopService(svc);
		Intent intent=new Intent(Intent.ACTION_MAIN);
		intent.addCategory(Intent.CATEGORY_HOME);
		intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		startActivity(intent);
    	finish();
		System.exit(0);
	}
	else if(v==btnTry){
		Intent intt=new Intent(this,GameOverSound.class);
		stopService(intt);
		Intent intent=new Intent(this,WelcomePage.class);
		startActivity(intent);
		
	}
	}
}
