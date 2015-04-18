package aimscapstone.infectionpreventionsource;

import android.content.Intent;
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
    private static final String POSITION = "index";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        mVideoView = (VideoView)findViewById(R.id.videoView);

        //Keep screen on while video plays
        mVideoView.setKeepScreenOn(true);

        Uri uri = Uri.parse("android.resource://" +this.getPackageName()
        + "/" +R.raw.ed_sheeran);

        //Media Controller
        mc = new MediaController(this);
        mc.setAnchorView(mVideoView);
        mVideoView.setMediaController(mc);
        mVideoView.requestFocus();

        //Start
        mVideoView.setVideoURI(uri);
        if(savedInstanceState != null)
        {
            int mPosition = savedInstanceState.getInt(POSITION, 0);
            mVideoView.seekTo(mPosition);
        }
        mVideoView.start();

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mVideoView.stopPlayback();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(POSITION, mVideoView.getCurrentPosition());
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
            Intent openResourcesActivity = new Intent(VideoActivity.this, ResourcesActivity.class);
            startActivity(openResourcesActivity);
            return true;
        }
        else if(id == R.id.home_nav)
        {
            Intent openMainActivity = new Intent(VideoActivity.this, MainActivity.class);
            startActivity(openMainActivity);
            return true;
        }

        else if(id == R.id.chat_nav)
        {
            Intent openChatActivity = new Intent(VideoActivity.this, ChatActivity.class);
            startActivity(openChatActivity);
            return true;
        }

        else if(id == R.id.training_nav)
        {
            Intent openTrainingActivity = new Intent(VideoActivity.this, TrainingNavigationActivity.class);
            startActivity(openTrainingActivity);
            return true;
        }

        else
        {
            return super.onOptionsItemSelected(item);
        }


    }
}
