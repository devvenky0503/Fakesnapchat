package com.dreamsolv.ribbit;

import android.app.Application;

import com.parse.Parse;

/**
 * Created by Dream on 06/06/15.
 */
public class RibbitApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        // Enable Local Datastore.
        Parse.enableLocalDatastore(this);

        Parse.initialize(this, "EPViKuA9R3GyzDboIP96Iubxy2qSMxXYA7Qr5xq3", "mvPOjhnRbHYyIci5sXXbARY6U0cwGhd58tS1WYWU");
    }
}
