package aimscapstone.infectionpreventionsource;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;


public class TrainingNavigationActivity extends ActionBarActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_training_navigation);

        String[] trainingTopics = {"Handwash", "Equipment", "Other"};

        ListAdapter adapter = new ArrayAdapter<String>(this, R.layout.training_row_layout,
                R.id.trainingRowTextView, trainingTopics);
        ListView lv = (ListView) findViewById(R.id.trainingListView);
        lv.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.resource_nav) {
            Intent openResourcesActivity = new Intent(TrainingNavigationActivity.this, ResourcesActivity.class);
            startActivity(openResourcesActivity);
            return true;
        }

        else if(id == R.id.video_nav)
        {
            Intent openVideoActivity = new Intent(TrainingNavigationActivity.this, VideoNavigationActivity.class);
            startActivity(openVideoActivity);
            return true;
        }

        else if(id == R.id.home_nav)
        {
            Intent openMainActivity = new Intent(TrainingNavigationActivity.this, MainActivity.class);
            startActivity(openMainActivity);
            return true;
        }

        else if(id == R.id.faq_nav)
        {
            Intent openFaqActivity = new Intent(TrainingNavigationActivity.this, FaqActivity.class);
            startActivity(openFaqActivity);
            return true;
        }

        else
        {
            return false;
        }


    }
}
