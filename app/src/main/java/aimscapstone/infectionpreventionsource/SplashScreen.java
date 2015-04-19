package aimscapstone.infectionpreventionsource;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;


public class SplashScreen extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Thread timer = new Thread()
        {
            @Override
            public void run() {
                try
                {
                    sleep(5000);
                    Intent openMainActivity = new Intent(SplashScreen.this, MainActivity.class);
                    startActivity(openMainActivity);
                    finish();

                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }

        };
        timer.start();
    }

}
