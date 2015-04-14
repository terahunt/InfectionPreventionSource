package aimscapstone.infectionpreventionsource;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class VideoNavigationActivity extends ActionBarActivity {

    private ListAdapter adapter;
    private ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_navigation);

        Bundle extras = getIntent().getExtras();
        String videoCategory;
        TextView videoNavTextView = (TextView)findViewById(R.id.video_nav_text_view);

        if (extras != null) {
            videoCategory = extras.getString("videoCategory");
            videoNavTextView.setText(videoCategory);
        }

        String[] videoTopics = {"Video 1", "Video 2", "Video 3"};

        adapter = new ArrayAdapter<String>(this, R.layout.video_row_layout,
                R.id.videoRowTextView, videoTopics);
        lv = (ListView) findViewById(R.id.videoListView);
        lv.setAdapter(adapter);

        //Start video playback
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item = (String) adapter.getItem(position);
                if(item.equals("Video 1")) {
                    Intent startVideo = new Intent(VideoNavigationActivity.this, VideoActivity.class);
                    startActivity(startVideo);
                }


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
            Intent openResourcesActivity = new Intent(VideoNavigationActivity.this, ResourcesActivity.class);
            startActivity(openResourcesActivity);
            return true;
        }

        else if(id == R.id.faq_nav)
        {
            Intent openFaqActivity = new Intent(VideoNavigationActivity.this, FaqActivity.class);
            startActivity(openFaqActivity);
            return true;
        }

        else if(id == R.id.training_nav)
        {
            Intent openTrainingActivity = new Intent(VideoNavigationActivity.this, TrainingNavigationActivity.class);
            startActivity(openTrainingActivity);
            return true;
        }

        else if(id == R.id.home_nav)
        {
            Intent openMainActivity = new Intent(VideoNavigationActivity.this, MainActivity.class);
            startActivity(openMainActivity);
            return true;
        }

        else
        {
            return false;
        }


    }




}
