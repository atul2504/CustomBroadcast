package com.checklist.custombroadcast;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		findViewById(R.id.btnSend).setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// Send the broadcast
				broadcastIntent();
			}
		});
	}

	public void broadcastIntent() {
		Intent intent = new Intent();
		intent.setAction("com.checklist.CUSTOM_INTENT");
		sendBroadcast(intent);
	}
}
