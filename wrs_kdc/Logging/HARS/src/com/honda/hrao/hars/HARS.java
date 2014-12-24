package com.honda.hrao.hars;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Slog;

public class HARS extends Service {
    private static final String TAG = "HARS";

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Slog.i(TAG, "onStartCommand()");
        return START_NOT_STICKY;
    }

    @Override
    public void onCreate() {
        Slog.i(TAG, "onCreate()");
    }

    @Override
    public void onDestroy() {
        Slog.i(TAG, "onDestroy()");
    }

    @Override
    public IBinder onBind(Intent intent) {
        Slog.i(TAG, "onBind()");
        return null;
    }
}
