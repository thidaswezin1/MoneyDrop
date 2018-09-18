package com.example.moneydrop;
import android.app.Service;
import android.content.*;
import android.media.*;
import android.media.audiofx.BassBoost.Settings;
import android.os.*;
public class Background extends Service{
	private static final String TAG=null;
	MediaPlayer player;
	public IBinder onBind(Intent arg0){
		return null;
	}
	public void onCreate(){
		super.onCreate();
		player=MediaPlayer.create(this,R.raw.background);
		player.setLooping(true);
		player.setVolume(100, 100);
		//player.start();
	}
	public void onStart(Intent intent,int startId){
		//super.onStart(intent, startId);
	}
	public int onStartCommand(Intent intent,int flags,int startId){
		player.start();
		return 1;
	}
	public boolean onUnbind(Intent arg0){
		return (Boolean) null;
	}
	public void onStop(){
		
	}
	public void onPause(){
		
	}
	public void onDestroy(){
		player.stop();
		player.release();
		super.onDestroy();
	}
	public void onLowMemory(){
		
	}
	/*protected void onNewIntent(){
		player.pause();
	}*/
	
	

}
