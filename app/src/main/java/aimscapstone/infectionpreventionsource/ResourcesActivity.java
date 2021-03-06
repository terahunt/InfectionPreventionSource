package aimscapstone.infectionpreventionsource;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;


public class ResourcesActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resources);

        String[] resourceTitle = {"WHO", "CDC", "Johns Hopkins Medicine"};
        String[] resourceDesc = {"World Health Organization \n" + "\n" +
                "Avenue Appia 20\n" +
                "1211 Geneva 27 \n" +
                "Switzerland" + "\n" +  "\n" +
                "+ 41 22 791 21 11",
                "Centers for Disease Control and Prevention \n" + "\n" +
                    "1600 Clifton Road, \n" +
                    "Atlanta, GA 30329 USA \n" + "\n" +
                    "800-CDC-INFO",
                "\n1800 Orleans St. Baltimore, \n" +
                        "Maryland 21287 USA \n" + "\n" +
                    "410-955-5000"};

        ResourcesAdapter adapter = new ResourcesAdapter(this, resourceTitle, resourceDesc);
        ListView lv = (ListView) findViewById(R.id.resourcesListView);
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

        if(id == R.id.video_nav)
        {
            Intent openVideoActivity = new Intent(ResourcesActivity.this, MainVideoNavigationActivity.class);
            startActivity(openVideoActivity);
            return true;
        }
        else if(id == R.id.chat_nav)
        {
            Intent openChatActivity = new Intent(ResourcesActivity.this, ChatActivity.class);
            startActivity(openChatActivity);
            return true;
        }

        else if(id == R.id.home_nav)
        {
            Intent openMainActivity = new Intent(ResourcesActivity.this, MainActivity.class);
            startActivity(openMainActivity);
            return true;
        }

        else if(id == R.id.training_nav)
        {
            Intent openTrainingActivity = new Intent(ResourcesActivity.this, TrainingNavigationActivity.class);
            startActivity(openTrainingActivity);
            return true;
        }

        else
        {
            return super.onOptionsItemSelected(item);
        }


    }

}
