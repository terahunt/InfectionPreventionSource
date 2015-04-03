package aimscapstone.infectionpreventionsource;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class VideoNavigationActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_navigation);

        String[] videoTopics = {"Video 1", "Video 2", "Video 3", "Video 4", "Video 5", "Video 6"};

        ListAdapter adapter = new ArrayAdapter<String>(this, R.layout.video_row_layout,
                R.id.videoRowTextView, videoTopics);
        ListView lv = (ListView) findViewById(R.id.videoListView);
        lv.setAdapter(adapter);
    }
}
