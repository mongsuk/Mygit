package com.honda.hrao.hars;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Slog;

public class HARSBootCompleteReceiver extends BroadcastReceiver {
    private static final String TAG = "HARSBootCompleteReceiver";

    @Override
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        Slog.i(TAG, "onReceive(" + action + ")");
        Intent i = new Intent(context, HARS.class);
        i.setAction(action);
        context.startService(i);
    };
}
