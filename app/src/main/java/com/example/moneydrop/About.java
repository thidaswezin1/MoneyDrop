package com.example.moneydrop;
import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class About extends Activity implements View.OnClickListener {
	private Button btnPlay,btnExit;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.aboutsystem);
		Intent svc=new Intent(this,Background.class);
		startService(svc);
		btnPlay=(Button)findViewById(R.id.btnPlay);
		btnExit=(Button)findViewById(R.id.btnExit);
		btnExit.setOnClickListener(this);
		btnPlay.setOnClickListener(this);
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
    	if(v==btnPlay){
		Intent intent=new Intent(this,QuestionTypePage.class);
		startActivity(intent);
    	}
    	else if(v==btnExit){
    		Intent svc=new Intent(this,Background.class);
    		stopService(svc);
    		Intent intent=new Intent(Intent.ACTION_MAIN);
    		intent.addCategory(Intent.CATEGORY_HOME);
    		intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
    		startActivity(intent);
        	finish();
    		System.exit(0);
    	}
	}
}
