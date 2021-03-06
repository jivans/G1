package com.example.lifecycle;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;


public class MainActivity extends ActionBarActivity {
	Intent intent,chooser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
public void onClick(View view) {
	Log.d("JIVAN","Button clicked");
	
}
@Override
protected void onPause() {
	super.onPause();
	Log.d("JIVAN","on paused called");
}
@Override
public void onConfigurationChanged(Configuration newConfig) {
	super.onConfigurationChanged(newConfig);
	if(newConfig.orientation==Configuration.ORIENTATION_LANDSCAPE){
	Log.d("JIVAN","welcome to landscape mode");
	}
}
 @Override
protected void onStart() {
super.onStart();
Log.d("JIVAN","onstart called");
}
 @Override
protected void onStop() {
super.onStop();
Log.d("JIVAN","onStop called");
}
 @Override
protected void onRestart() {
super.onRestart();
Log.d("JIVAN","on Restart called");
}
 @Override
protected void onResume() {
super.onResume();
Log.d("JIVAN","onResume called");
}
}
