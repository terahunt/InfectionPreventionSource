package aimscapstone.infectionpreventionsource;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ListView;


public class ResourcesActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resources);

        String[] resourceTitle = {"WHO", "CDC", "Other"};
        String[] resourceDesc = {"Lorem ipsum dolor sit amet, consectetur adipiscing elit.",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit.",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit."};

        ResourcesAdapter adapter = new ResourcesAdapter(this, resourceTitle, resourceDesc);
        ListView lv = (ListView) findViewById(R.id.resourcesListView);
        lv.setAdapter(adapter);

        //Hide description TextView onClick()
       /* ImageButton arrow = (ImageButton) findViewById(R.id.resourcesImageButton);
        arrow.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                 findViewById(R.id.resourcesRowTextViewDesc).setVisibility(View.GONE);
            }
        });*/
    }

}
