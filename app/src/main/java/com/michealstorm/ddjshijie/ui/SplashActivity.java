package com.michealstorm.ddjshijie.ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;

import com.michealstorm.ddjshijie.R;
import com.michealstorm.ddjshijie.utils.StaticClass;


/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class SplashActivity extends AppCompatActivity {

    Handler mHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what) {
                case StaticClass.HANDLER_MESSAGE_DELAY:
                    startActivity(new Intent(SplashActivity.this, GuideActivity.class));
                    finish();
                    break;
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splash);

        mHandler.sendEmptyMessageDelayed(StaticClass.HANDLER_MESSAGE_DELAY, 0);
     //// TODO: 2017/10/18

    }


}
