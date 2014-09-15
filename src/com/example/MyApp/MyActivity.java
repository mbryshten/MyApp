package com.example.MyApp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MyActivity extends Activity {



	private TextView textView;
	private ImageView imageView;

	private View.OnClickListener imageTapListener;

	public final static String EXTRA_MESSAGE = "pressplus.MESSAGE";


	/**
	 * Called when the activity is first created.
	 */
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		//initializeApp();


	}


	public void sendMessage(View view) {

		Intent intent = new Intent(this, DisplayMessageActivity.class);

		EditText editText = (EditText) findViewById(R.id.edit_message);

		String message = editText.getText().toString();

		intent.putExtra(EXTRA_MESSAGE, message);

		startActivity(intent);


	}

//	private void initializeApp()
//	{
//
//		textView = (TextView) findViewById(R.id.textView);
//		imageView = (ImageView) findViewById(R.id.imageView);
//
//		imageTapListener = new View.OnClickListener() {
//
//
//			@Override
//			public void onClick(View v)
//			{
//				touchImage();
//
//			}
//
//		};
//
//		imageView.setOnClickListener(imageTapListener);
//
//
//	}
//
//	private void touchImage()
//	{
//		counter++;
//
//		String temp = String.valueOf(counter);
//
//		textView.setText(temp);
//
//
//
//	}
}
