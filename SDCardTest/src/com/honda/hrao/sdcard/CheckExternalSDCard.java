package com.honda.hrao.sdcard;

import android.app.Activity;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.widget.Toast;
import android.widget.TextView;

public class CheckExternalSDCard extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        TextView textview = (TextView)findViewById(R.id.textview);
        String mount_state = Environment.getExternalStorageState();
        String external_path = null;

        if(mount_state.equals(Environment.MEDIA_MOUNTED))
        {
            Toast.makeText(this, mount_state, Toast.LENGTH_SHORT).show();
            external_path = Environment.getExternalStorageDirectory().getAbsolutePath();
            Toast.makeText(this, external_path, Toast.LENGTH_SHORT).show();
            textview.setText(external_path);
        } else {
            Toast.makeText(this, "Failed", Toast.LENGTH_SHORT).show();
        }
    }
}
