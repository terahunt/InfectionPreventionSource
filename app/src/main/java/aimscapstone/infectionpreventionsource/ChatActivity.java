package aimscapstone.infectionpreventionsource;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class ChatActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);
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
            Intent openResourcesActivity = new Intent(ChatActivity.this, ResourcesActivity.class);
            startActivity(openResourcesActivity);
            return true;
        } else if (id == R.id.video_nav) {
            Intent openVideoActivity = new Intent(ChatActivity.this, MainVideoNavigationActivity.class);
            startActivity(openVideoActivity);
            return true;
        } else if (id == R.id.training_nav) {
            Intent openTrainingActivity = new Intent(ChatActivity.this, TrainingNavigationActivity.class);
            startActivity(openTrainingActivity);
            return true;
        } else if (id == R.id.home_nav) {
            Intent openMainActivity = new Intent(ChatActivity.this, MainActivity.class);
            startActivity(openMainActivity);
            return true;
        } else {
            return super.onOptionsItemSelected(item);
        }
    }
}
