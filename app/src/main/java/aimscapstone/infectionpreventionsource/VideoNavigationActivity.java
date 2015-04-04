package aimscapstone.infectionpreventionsource;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class VideoNavigationActivity extends ActionBarActivity {

    private ListAdapter adapter;
    private ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_navigation);

        String[] videoTopics = {"Video 1", "Video 2", "Video 3", "Video 4", "Video 5", "Video 6"};

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




}
