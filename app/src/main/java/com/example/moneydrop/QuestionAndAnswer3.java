package com.example.moneydrop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class QuestionAndAnswer3 extends Activity implements OnClickListener{
	Button btnSure;
	private DatabaseAccess db;
	TextView quiz;
	int lastId;int firstId;
	int questionId;String questionName;
	TextView ans1,ans2,ans3,ans4;
	String correctAnswer;
	long totalAmount;
	long presentAmount;
	long dropAmount=0;
	long allAmount=0;
	int randnum2;
	String index;String total;String present;
	long amount1,amount2,amount3,amount4=0;
	List<Long> amount=new ArrayList<Long>();
	List<Integer> questionIds=new ArrayList<Integer>();
	List<String> falseAnswerArray = new ArrayList<String>();
	String level;int id;
	public static final String EXTRA_MESSAGE1="key1";
	public static final String EXTRA_MESSAGE2="key2";
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.questionandanswer);
        Intent intent=getIntent();
        present=intent.getStringExtra(QuestionTypePage3.EXTRA_MESSAGE1);
        presentAmount=Integer.parseInt(present);
        //level=intent.getStringExtra(QuestionTypePage1.EXTRA_MESSAGE2);
        index=intent.getStringExtra(QuestionTypePage3.EXTRA_MESSAGE3);
        id=Integer.parseInt(index);
        
        db=DatabaseAccess.getInstance(this);
        db.open();
        Random rand=new Random();
        for(long i=0;i<=presentAmount;i+=100000){
        	amount.add(i);
        }
        List<QuestionAndCorrectAnswer> questions = db.getAllQuestion(id);
        for (QuestionAndCorrectAnswer ques : questions) {
            firstId=ques.getQuestionId();break;
        }
        for (QuestionAndCorrectAnswer ques1 : questions) {
            lastId=ques1.getQuestionId();
        }
        final int randnum1=rand.nextInt((lastId-firstId)+1)+firstId;
        for (QuestionAndCorrectAnswer ques2 : questions) {
            questionId=ques2.getQuestionId();
            if(questionId==randnum1){
            	questionName=ques2.getQuestionStatus();
            	correctAnswer=ques2.getCorrectAnswerName();  
            	break;
            }
        }
        quiz=(TextView)findViewById(R.id.textView3);
        quiz.setText(questionName);
       
        Spinner spin1=(Spinner)findViewById(R.id.spinner1);
        Spinner spin2=(Spinner)findViewById(R.id.spinner2);
        Spinner spin3=(Spinner)findViewById(R.id.spinner3);
        Spinner spin4=(Spinner)findViewById(R.id.spinner4);
        ArrayAdapter<Long> aa=new ArrayAdapter<Long>(this,android.R.layout.simple_spinner_item,amount);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin1.setAdapter(aa);
        spin2.setAdapter(aa);
        spin3.setAdapter(aa);
        spin4.setAdapter(aa);
        
        spin1.setOnItemSelectedListener(new OnItemSelectedListener() {
        	public void onItemSelected(AdapterView<?> parent,View v,int position,long id){
        		amount1=amount.get(position);
        	}
        	public void onNothingSelected(AdapterView<?> parent){
        		amount1=0;
        	}
		});
        spin2.setOnItemSelectedListener(new OnItemSelectedListener() {
        	public void onItemSelected(AdapterView<?> parent,View v,int position,long id){
        		amount2=amount.get(position);
        	}
        	public void onNothingSelected(AdapterView<?> parent){
        		amount2=0;
        	}
		});
        spin3.setOnItemSelectedListener(new OnItemSelectedListener() {
        	public void onItemSelected(AdapterView<?> parent,View v,int position,long id){
        		amount3=amount.get(position);
        	}
        	public void onNothingSelected(AdapterView<?> parent){
        		amount3=0;
        	}
		});
        spin4.setOnItemSelectedListener(new OnItemSelectedListener() {
        	public void onItemSelected(AdapterView<?> parent,View v,int position,long id){
        		amount4=amount.get(position);
        	}
        	public void onNothingSelected(AdapterView<?> parent){
        		amount4=0;
        	}
		});
        

        List<FalseAnswer> falseAnswer = db.getAllFalseAnswer(questionId);
        for (FalseAnswer ans : falseAnswer) {
            falseAnswerArray.add(ans.getAnswerName());
        }
        
        ans1=(TextView)findViewById(R.id.textView5);
        ans2=(TextView)findViewById(R.id.textView6);
        ans3=(TextView)findViewById(R.id.textView7);
        ans4=(TextView)findViewById(R.id.textView8);
        
        randnum2=rand.nextInt((4-1)+1)+1;
        if(randnum2==1){
        	ans1.setText(correctAnswer);
        	ans2.setText(falseAnswerArray.get(0));
        	ans3.setText(falseAnswerArray.get(1));
        	ans4.setText(falseAnswerArray.get(2));
        }
        else if(randnum2==2){
        	ans2.setText(correctAnswer);
        	ans1.setText(falseAnswerArray.get(0));
        	ans3.setText(falseAnswerArray.get(1));
        	ans4.setText(falseAnswerArray.get(2));
        }
        else if(randnum2==3){
        	ans3.setText(correctAnswer);
        	ans2.setText(falseAnswerArray.get(0));
        	ans1.setText(falseAnswerArray.get(1));
        	ans4.setText(falseAnswerArray.get(2));
        }
        else if(randnum2==4){
        	ans4.setText(correctAnswer);
        	ans2.setText(falseAnswerArray.get(0));
        	ans3.setText(falseAnswerArray.get(1));
        	ans1.setText(falseAnswerArray.get(2));
        }
        btnSure=(Button)findViewById(R.id.button1);
        btnSure.setOnClickListener(this);
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
		if(amount1>0 && amount2>0 && amount3>0  && amount4>0){
			new AlertDialog.Builder(this)
			.setMessage("Please put money to only three answers!")
			.setNeutralButton("Okay", new DialogInterface.OnClickListener() {
				@Override
				public void onClick(DialogInterface dlg, int sumthin) {
					//do nothing
					//refill the amount 
				}
			})
			.show();
		}
		else if(amount1==presentAmount){
				if(((amount2>0) &&(amount2<=presentAmount)) || ((amount3>0) && (amount3<=presentAmount)) || 
						((amount4>0) && (amount4<=presentAmount))){
					new AlertDialog.Builder(this)
					.setMessage("Please put money to balance with your amount! Your balance is "+presentAmount)
					.setNeutralButton("Okay", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface dlg, int sumthin) {
							//do nothing
							//refill the amount
						}
					})
					.show();
				}
				else if((amount2==0) && (amount3==0) && (amount4==0)){
					if(randnum2!=1){
						totalAmount+=0;
						Intent intent=new Intent(this,ShowCorrectAndAmount3.class);
						total=String.valueOf(totalAmount);
						intent.putExtra(EXTRA_MESSAGE1, total);
						intent.putExtra(EXTRA_MESSAGE2, correctAnswer);
						startActivity(intent);
					}
					else if(randnum2==1){
						totalAmount+=presentAmount;
						Intent intent=new Intent(this,ShowCorrectAndAmount3.class);
						total=String.valueOf(totalAmount);
						intent.putExtra(EXTRA_MESSAGE1, total);
						intent.putExtra(EXTRA_MESSAGE2, correctAnswer);
						startActivity(intent);
					}
				}
			}
			else if(amount2==presentAmount){
				if(((amount1>0) &&(amount1<=presentAmount)) || ((amount3>0) && (amount3<=presentAmount)) || 
						((amount4>0) && (amount4<=presentAmount))){
					new AlertDialog.Builder(this)
					.setMessage("Please put money to balance with your amount! Your balance is "+presentAmount)
					.setNeutralButton("Okay", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface dlg, int sumthin) {
							//do nothing
							//refill the amount
						}
					})
					.show();
				}
				else if((amount1==0) && (amount3==0) && (amount4==0)){
					if(randnum2!=2){
						totalAmount+=0;
						Intent intent=new Intent(this,ShowCorrectAndAmount3.class);
						total=String.valueOf(totalAmount);
						intent.putExtra(EXTRA_MESSAGE1, total);
						intent.putExtra(EXTRA_MESSAGE2, correctAnswer);
						startActivity(intent);
					}
					else if(randnum2==2){
						totalAmount+=presentAmount;
						Intent intent=new Intent(this,ShowCorrectAndAmount3.class);
						total=String.valueOf(totalAmount);
						intent.putExtra(EXTRA_MESSAGE1, total);
						intent.putExtra(EXTRA_MESSAGE2, correctAnswer);
						startActivity(intent);
					}
				}
			}
			else if(amount3==presentAmount){
				if(((amount1>0) &&(amount1<=presentAmount)) || ((amount2>0) && (amount2<=presentAmount)) || 
						((amount4>0) && (amount4<=presentAmount))){
					new AlertDialog.Builder(this)
					.setMessage("Please put money to balance with your amount! Your balance is "+presentAmount)
					.setNeutralButton("Okay", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface dlg, int sumthin) {
							//do nothing
							//refill the amount
						}
					})
					.show();
				}
				else if((amount1==0) && (amount2==0) && (amount4==0)){
					if(randnum2!=3){
						totalAmount+=0;
						Intent intent=new Intent(this,ShowCorrectAndAmount3.class);
						total=String.valueOf(totalAmount);
						intent.putExtra(EXTRA_MESSAGE1, total);
						intent.putExtra(EXTRA_MESSAGE2, correctAnswer);
						startActivity(intent);
					}
					else if(randnum2==3){
						totalAmount+=presentAmount;
						Intent intent=new Intent(this,ShowCorrectAndAmount3.class);
						total=String.valueOf(totalAmount);
						intent.putExtra(EXTRA_MESSAGE1, total);
						intent.putExtra(EXTRA_MESSAGE2, correctAnswer);
						startActivity(intent);
					}
				}
			}
			else if(amount4==presentAmount){
				if(((amount1>0) &&(amount1<=presentAmount)) || ((amount2>0) && (amount2<=presentAmount)) || 
						((amount3>0) && (amount3<=presentAmount))){
					new AlertDialog.Builder(this)
					.setMessage("Please put money to balance with your amount! Your balance is "+presentAmount)
					.setNeutralButton("Okay", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface dlg, int sumthin) {
							//do nothing
							//refill the amount
						}
					})
					.show();
				}
				else if((amount1==0) && (amount2==0) && (amount3==0)){
					if(randnum2!=4){
						totalAmount+=0;
						Intent intent=new Intent(this,ShowCorrectAndAmount3.class);
						total=String.valueOf(totalAmount);
						intent.putExtra(EXTRA_MESSAGE1, total);
						intent.putExtra(EXTRA_MESSAGE2, correctAnswer);
						startActivity(intent);
					}
					else if(randnum2==4){
						totalAmount+=presentAmount;
						Intent intent=new Intent(this,ShowCorrectAndAmount3.class);
						total=String.valueOf(totalAmount);
						intent.putExtra(EXTRA_MESSAGE1, total);
						intent.putExtra(EXTRA_MESSAGE2, correctAnswer);
						startActivity(intent);
					}
				}
			}
			
			else if(((amount1+amount2+amount3+amount4)>presentAmount) || 
					((amount1+amount2+amount3+amount4)!=presentAmount) || 
					((amount1+amount2+amount3+amount4)<presentAmount)){
				new AlertDialog.Builder(this)
				.setMessage("Please put money to balance with your amount! Your balance is "+presentAmount)
				.setNeutralButton("Okay", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface dlg, int sumthin) {
						//do nothing
						//refill the amount 
					}
				})
				.show();
			}
			
			else if(randnum2==1){
				totalAmount+=amount1;
				Intent intent=new Intent(this,ShowCorrectAndAmount3.class);
				total=String.valueOf(totalAmount);
				intent.putExtra(EXTRA_MESSAGE1, total);
				intent.putExtra(EXTRA_MESSAGE2, correctAnswer);
				startActivity(intent);
			}
			else if(randnum2==2){
				totalAmount+=amount2;
				Intent intent=new Intent(this,ShowCorrectAndAmount3.class);
				total=String.valueOf(totalAmount);
				intent.putExtra(EXTRA_MESSAGE1, total);
				intent.putExtra(EXTRA_MESSAGE2, correctAnswer);
				startActivity(intent);
			}
			else if(randnum2==3){
				totalAmount+=amount3;
				Intent intent=new Intent(this,ShowCorrectAndAmount3.class);
				total=String.valueOf(totalAmount);
				intent.putExtra(EXTRA_MESSAGE1, total);
				intent.putExtra(EXTRA_MESSAGE2, correctAnswer);
				startActivity(intent);
			}
			else if(randnum2==4){
				totalAmount+=amount4;
				Intent intent=new Intent(this,ShowCorrectAndAmount3.class);
				total=String.valueOf(totalAmount);
				intent.putExtra(EXTRA_MESSAGE1, total);
				intent.putExtra(EXTRA_MESSAGE2, correctAnswer);
				startActivity(intent);
			}
	}
}
