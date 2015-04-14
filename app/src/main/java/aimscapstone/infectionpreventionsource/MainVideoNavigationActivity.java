package aimscapstone.infectionpreventionsource;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;


public class MainVideoNavigationActivity extends ActionBarActivity {

    private ListAdapter adapter;
    private ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_video_navigation);

        String[] videoTopics = {"Cleaning", "Decontamination",
                "Environmental Protection Control", "Hygiene","Personal Protection Equipment",
                "Steralization", "Waste Management"};

        adapter = new ArrayAdapter<String>(this, R.layout.custom_row_layout,
                R.id.customRowTextView, videoTopics);
        lv = (ListView) findViewById(R.id.mainVideoListView);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item = (String) adapter.getItem(position);
                Intent openVideoNav = new Intent(MainVideoNavigationActivity.this, VideoNavigationActivity.class);
                openVideoNav.putExtra("videoCategory", item);
                startActivity(openVideoNav);
            }
        });
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
            Intent openResourcesActivity = new Intent(MainVideoNavigationActivity.this, ResourcesActivity.class);
            startActivity(openResourcesActivity);
            return true;
        }

        else if(id == R.id.faq_nav)
        {
            Intent openFaqActivity = new Intent(MainVideoNavigationActivity.this, FaqActivity.class);
            startActivity(openFaqActivity);
            return true;
        }

        else if(id == R.id.training_nav)
        {
            Intent openTrainingActivity = new Intent(MainVideoNavigationActivity.this, TrainingNavigationActivity.class);
            startActivity(openTrainingActivity);
            return true;
        }

        else if(id == R.id.home_nav)
        {
            Intent openMainActivity = new Intent(MainVideoNavigationActivity.this, MainActivity.class);
            startActivity(openMainActivity);
            return true;
        }

        else
        {
            return false;
        }
    }
}
