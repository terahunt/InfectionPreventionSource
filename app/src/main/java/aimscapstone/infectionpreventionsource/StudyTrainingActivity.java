package aimscapstone.infectionpreventionsource;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;


public class StudyTrainingActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study_training);

        Thread timer = new Thread()
        {
            @Override
            public void run() {
                try
                {
                    sleep(5000);
                    Intent openTrainingActivity = new Intent(StudyTrainingActivity.this, TrainingActivity.class);
                    startActivity(openTrainingActivity);
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
