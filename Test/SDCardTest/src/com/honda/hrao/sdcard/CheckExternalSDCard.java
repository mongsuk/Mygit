package com.honda.hrao.sdcard;

import android.app.Activity;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.widget.Toast;
import android.widget.TextView;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.Context;
import android.os.storage.StorageManager;
import android.os.StatFs;

import java.util.Arrays;
import java.io.File;

public class CheckExternalSDCard extends Activity {
    private String[] mExternalStoragePaths;
    File msdcardpath = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        TextView textview = (TextView)findViewById(R.id.textview);
        String file = "file";
        String externalpath = null;
        msdcardpath = new File("/storage/sdcard1");
        String mount_state = Environment.getStorageState(msdcardpath);
        
        IntentFilter mount_filter = new IntentFilter();
        mount_filter.addAction(Intent.ACTION_MEDIA_MOUNTED);
        mount_filter.addDataScheme(file);
        registerReceiver(check_mounted_SDcard, mount_filter);

        StorageManager storageManager = (StorageManager)getSystemService(Context.STORAGE_SERVICE);
        mExternalStoragePaths = storageManager.getVolumePaths();
        textview.setText("" + Arrays.toString(mExternalStoragePaths));

        if(mount_state.equals(Environment.MEDIA_MOUNTED)) {
            StatFs stat = new StatFs(msdcardpath.getPath());
            long bytesize = stat.getAvailableBytes();
            textview.append("MOUNTED\n");
            textview.append("" + bytesize + "byte\n");
            textview.append("" + Arrays.toString(mExternalStoragePaths));
        }
    }

    private BroadcastReceiver check_mounted_SDcard = new BroadcastReceiver() {

        @Override
        public void onReceive(Context context, Intent intent) {
            Toast.makeText(CheckExternalSDCard.this, "MOUNT_EVENT", Toast.LENGTH_SHORT).show();
        }
    };
}
