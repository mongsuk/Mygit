package com.android.logtest;

import android.app.Activity;
import android.content.Context;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.util.Log;
import android.util.Slog;

public class LogTest extends Activity {
	private static final String TAG = "LogTest";

	private Button mBtnMain;
	private Button mBtnSystem;
	private Button mBtnTest;

	private Context mContext;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
		
		mContext = getApplicationContext();

		setContentView(R.layout.main);
		
		mBtnMain = (Button) findViewById (R.id.main_log);
        mBtnMain.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Log.println_native(0, 4, "NJH", "main buffer");
                Log.println_native(1, 4, "NJH", "radio buffer");
                Log.println_native(2, 4, "NJH", "events buffer");
                Log.println_native(3, 4, "NJH", "system buffer");
                Log.println_native(4, 4, "NJH", "crash buffer");
                Log.println_native(5, 4, "NJH", "kernel buffer");
            }
        });

		mBtnSystem = (Button) findViewById (R.id.system_log);
        mBtnSystem.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
            }
        });

		mBtnTest = (Button) findViewById (R.id.test_log);
        mBtnTest.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Log.println_native(2, 4, "NJH", "main buffer");
            }
        });
    }
}
