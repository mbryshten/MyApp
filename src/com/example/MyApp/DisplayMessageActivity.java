package com.example.MyApp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by mbryshten on 9/12/14.
 */
public class DisplayMessageActivity extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);



		Intent intent = getIntent();

		String message = intent.getStringExtra(MyActivity.EXTRA_MESSAGE);

		TextView textView = new TextView(this);

		textView.setText(message);

		textView.setTextSize(40);


		setContentView(textView);
	}
}