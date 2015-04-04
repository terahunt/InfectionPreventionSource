package aimscapstone.infectionpreventionsource;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.MediaController;
import android.widget.VideoView;


public class VideoActivity extends ActionBarActivity {

    private VideoView mVideoView;
    private MediaController mc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        mVideoView = (VideoView)findViewById(R.id.videoView);
        //mVideoView = (VideoView)findViewById(R.id.landVideoView);

        //Keep screen on while video plays
        mVideoView.setKeepScreenOn(true);

        //Get path to video
        String vPath = "http://www.androidbegin.com/tutorial/AndroidCommercial.3gp";
        Uri uri = Uri.parse("android.resource://" +this.getPackageName()
        + "/" +R.raw.ed_sheeran);

        //Media Controller
        mc = new MediaController(this);
        mc.setAnchorView(mVideoView);
        mVideoView.setMediaController(mc);
        mVideoView.requestFocus();

        //Start
        mVideoView.setVideoURI(uri);
        mVideoView.start();

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_video, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}