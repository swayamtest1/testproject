package com.example.testproject;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		int i=0;
		do
		{
			Log.v("print static message ","custom message...");
			Log.v("print static message ","custom message...");
			Log.v("print static message ","custom message...");
		}while(i<10)
		
		
		for(int i=0;i<10;i++)
		{
			Log.v("Hello", "Message");
			Log.v("Hello", "Message");
		}
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		
		
		
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
		
		
		
	}

}
