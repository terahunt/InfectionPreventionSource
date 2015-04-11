package aimscapstone.infectionpreventionsource;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends ActionBarActivity {

    private ImageButton mVideoButton;
    private ImageButton mTrainingButton;
    private ImageButton mResourcesButton;
    private ImageButton mFaqButton;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_main_navigation);

        //Start video activity
        mVideoButton = (ImageButton)findViewById(R.id.video_image_button);

        mVideoButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick (View v)
            {
                Intent openVideoActivity = new Intent(MainActivity.this, VideoNavigationActivity.class);
                startActivity(openVideoActivity);
            }
        });

        //Start training activity
        mTrainingButton = (ImageButton)findViewById(R.id.training_image_button);

        mTrainingButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick (View v)
            {
                Intent openTrainingActivity = new Intent(MainActivity.this, TrainingNavigationActivity.class);
                startActivity(openTrainingActivity);
            }
        });

        //Start outbreak activity
        /*mFaqButton = (ImageButton)findViewById(R.id.outbreak_image_button);

        mFaqButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick (View v)
            {
                Intent openOutbreakActivity = new Intent(MainActivity.this, OutbreakActivity.class);
                startActivity(openOutbreakActivity);
            }
        });
        */

        //Start resources activity
        mResourcesButton = (ImageButton)findViewById(R.id.resources_image_button);

        mResourcesButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick (View v)
            {
                Intent openResourcesActivity = new Intent(MainActivity.this, ResourcesActivity.class);
                startActivity(openResourcesActivity);
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
            Intent openResourcesActivity = new Intent(MainActivity.this, ResourcesActivity.class);
            startActivity(openResourcesActivity);
            return true;
        }

        else if(id == R.id.video_nav)
        {
            Intent openVideoActivity = new Intent(MainActivity.this, VideoNavigationActivity.class);
            startActivity(openVideoActivity);
            return true;
        }
        /*
        else if(id == R.id.faq_nav)
        {
            Intent openResourcesActivity = new Intent(MainActivity.this, FaqActivity.class);
            startActivity(openResourcesActivity);
            return true;
        }
        */

        else if(id == R.id.training_nav)
        {
            Intent openTrainingActivity = new Intent(MainActivity.this, TrainingNavigationActivity.class);
            startActivity(openTrainingActivity);
            return true;
        }

        else
        {
            return false;
        }


    }
}
