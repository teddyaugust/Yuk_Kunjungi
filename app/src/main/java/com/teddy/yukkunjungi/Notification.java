package com.teddy.yukkunjungi;

import android.app.Application;
import com.onesignal.OneSignal;

public class Notification extends Application {

    private static final String ONESIGNAL_APP_ID = "973fc774-5998-469b-a726-3c1322db5239";

    @Override
    public void onCreate() {
        super.onCreate();

        // Enable verbose OneSignal logging to debug issues if needed.
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE);

        // OneSignal Initialization
        OneSignal.initWithContext(this);
        OneSignal.setAppId(ONESIGNAL_APP_ID);
    }
}