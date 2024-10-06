package com.example.startandbound_001;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class ledService extends Service {
    public ledService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
//        throw new UnsupportedOperationException("Not yet implemented");
        Log.d("ledService", "Binding Service");
        return mBinder;
    }

    private final ILedServiceManager.Stub mBinder = new ILedServiceManager.Stub() {
        @Override
        public int getLedStatus()  {
            Log.d("ledService", "Getting led status");
            return 0;
        }

        @Override
        public int setLedStatus(int ledState)  {
            Log.d("ledService", "Setting led status");
            return 0;
        }
    };

    @Override
    public void onCreate() {
        Log.d("ledService", "onCreate service");
        super.onCreate();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public boolean onUnbind(Intent intent) {
        return super.onUnbind(intent);
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.i("RemoteService", "Received start id " + startId + ": " + intent);
        return START_STICKY;
    }
}
