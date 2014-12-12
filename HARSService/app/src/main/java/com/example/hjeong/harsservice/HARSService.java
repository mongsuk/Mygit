package com.example.hjeong.harsservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

public class HARSService extends Service {
    String TAG = "HARS_SERVICE";
    @Override
    public void onCreate() {
        Log.d(TAG,"Test");
        Toast.makeText(this, "StartService",Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
    }
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
