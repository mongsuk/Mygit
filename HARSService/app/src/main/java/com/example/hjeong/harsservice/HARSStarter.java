package com.example.hjeong.harsservice;


import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;


public class HARSStarter extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String TAG = "HARS_SERVICE";
        boolean contion = intent.getAction().equals(Intent.ACTION_BOOT_COMPLETED);
        if (contion) {
            Log.d(TAG, "BOOT_COMPLETED");
            /// Start service
            context.startService(new Intent(context,HARSService.class));
        } else {
            Toast.makeText(context, "Failed to start HARS", Toast.LENGTH_SHORT).show();
            Log.d(TAG, "Failed");
        }
    }
 }
