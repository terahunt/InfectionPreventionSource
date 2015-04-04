package aimscapstone.infectionpreventionsource;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;


public class TrainingNavigationActivity extends ActionBarActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_training_navigation);

        String[] trainingTopics = {"Handwash", "Equipment", "Other"};

        ListAdapter adapter = new ArrayAdapter<String>(this, R.layout.training_row_layout,
                R.id.trainingRowTextView, trainingTopics);
        ListView lv = (ListView) findViewById(R.id.trainingListView);
        lv.setAdapter(adapter);
    }
}
