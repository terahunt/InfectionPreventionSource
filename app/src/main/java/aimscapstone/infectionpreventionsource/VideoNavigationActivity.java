package aimscapstone.infectionpreventionsource;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

public class VideoNavigationActivity extends ActionBarActivity {

    private VideoAdapter adapter;
    private ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_navigation);

        Bundle extras = getIntent().getExtras();
        String videoCategory;
        TextView videoNavTextView = (TextView)findViewById(R.id.video_nav_text_view);

        String[] videoTopics = {};
        String[] videoDesc = {};
        int[] videoImages = {};

        if (extras != null) {
            videoCategory = extras.getString("videoCategory");
            videoNavTextView.setText(videoCategory);

            //Separate videos based on category
            switch (videoCategory)
            {
                case "Personal Protection Equipment":
                    videoTopics = new String[] {"Introduction", "Trained Observer",
                            "Removing Own Clothing", "Examining Equipment", "Hand Cleaning",
                            "Boot Covers", "Inner Gloves", "Coverall", "N95 Respirator",
                            "Surgical Hood", "Outer Apron", "Outer Gloves", "Face Shield",
                            "Verification"};
                    videoDesc = new String[] {
                            "Introduction by Dr. Pronovost on the Importance of Personal Protection Equipment.",
                            "Step 1: Explanation the role of a trained observer.",
                            "Step 2: Standards for appropriate clothing.",
                            "Step 3: Inspection of equipment to be worn and used by health care worker.",
                            "Step 4: Instruction on appropriate hand hygiene.",
                            "Step 5: Instruction on how to put on boot covers.",
                            "Step 6: Instruction on how to put on inner gloves.",
                            "Step 7: Instruction on how to put on coverall.",
                            "Step 8: Instruction on how to put on N95 respirator.",
                            "Step 9: Instruction on how to put on surgical hood.",
                            "Step 10: Instruction on how to put on outer apron.",
                            "Step 11: Instruction on how to put on outer gloves.",
                            "Step 12: Instruction on how to put on face shield.",
                            "Step 13: Verify equipment with trained observer."};
                    videoImages = new int[]{R.mipmap.intro,R.mipmap.observer,
                            R.mipmap.oldclothing,R.mipmap.examining,R.mipmap.handcleaning,
                            R.mipmap.bootcovers,R.mipmap.innergloves,R.mipmap.coverall,
                            R.mipmap.respirator,R.mipmap.hood,R.mipmap.outerapron,
                            R.mipmap.outergloves,R.mipmap.faceshield,R.mipmap.verification};
                    break;
                case "Decontamination":
                    break;
                case "Environmental Protection Control":
                    break;
                case "Hygiene":
                    break;
                case "Cleaning":
                    break;
                case "Steralization":
                    break;
                case "Waste Management":
                    break;
                default:
            }
        }

        adapter = new VideoAdapter(this, videoTopics, videoDesc,videoImages);
        lv = (ListView) findViewById(R.id.videoListView);
        lv.setAdapter(adapter);

        //Start video playback
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item = (String) adapter.getItemTitle(position);
                Intent startVideo = new Intent(VideoNavigationActivity.this, VideoActivity.class);

                switch(item) {
                    case "Introduction":
                        startVideo.putExtra("videoUrl", "https://upload.wikimedia.org/wikipedia/commons/b/bc/Donning_PPE-_Introduction_CDC01.webm");
                        startVideo.putExtra("videoTitle", "Introduction");
                        break;
                    case "Trained Observer":
                        startVideo.putExtra("videoUrl", "https://upload.wikimedia.org/wikipedia/commons/6/60/Donning_PPE-_Engage_Trained_Observer_CDC02.webm");
                        startVideo.putExtra("videoTitle", "Trained Observer");
                        break;
                    case "Removing Own Clothing":
                        startVideo.putExtra("videoUrl", "https://upload.wikimedia.org/wikipedia/commons/d/d0/Donning_PPE-_Remove_Personal_Clothing_and_Items_CDC03.webm");
                        startVideo.putExtra("videoTitle", "Removing Own Clothing");
                        break;
                    case "Examining Equipment":
                        startVideo.putExtra("videoUrl", "https://upload.wikimedia.org/wikipedia/commons/8/8a/Donning_PPE-_Inspect_PPE_Prior_to_Donning_CDC04.webm");
                        startVideo.putExtra("videoTitle", "Examining Equipment");
                        break;
                    case "Hand Cleaning":
                        startVideo.putExtra("videoUrl", "https://upload.wikimedia.org/wikipedia/commons/8/8c/Donning_PPE-_Perform_Hand_Hygiene_CDC05.webm");
                        startVideo.putExtra("videoTitle", "Hand Cleaning");
                        break;
                    case "Boot Covers":
                        startVideo.putExtra("videoUrl", "https://upload.wikimedia.org/wikipedia/commons/1/10/Donning_PPE-_Put_on_Boot_Covers_CDC06.webm");
                        startVideo.putExtra("videoTitle", "Boot Covers");
                        break;
                    case "Inner Gloves":
                        startVideo.putExtra("videoUrl", "https://upload.wikimedia.org/wikipedia/commons/d/da/Donning_PPE-_Put_on_Inner_Gloves_CDC07.webm");
                        startVideo.putExtra("videoTitle", "Inner Gloves");
                        break;
                    case "Coverall":
                        startVideo.putExtra("videoUrl", "https://upload.wikimedia.org/wikipedia/commons/f/fa/Donning_PPE-_Put_on_Coverall_CDC08.webm");
                        startVideo.putExtra("videoTitle", "Coverall");
                        break;
                    case "N95 Respirator":
                        startVideo.putExtra("videoUrl", "https://upload.wikimedia.org/wikipedia/commons/6/64/Donning_PPE-_Put_on_N95_Respirator_CDC09.webm");
                        startVideo.putExtra("videoTitle", "N95 Respirator");
                        break;
                    case "Surgical Hood":
                        startVideo.putExtra("videoUrl", "https://upload.wikimedia.org/wikipedia/commons/0/0d/Donning_PPE-_Put_on_Surgical_Hood_CDC10.webm");
                        startVideo.putExtra("videoTitle", "Surgical Hood");
                        break;
                    case "Outer Apron":
                        startVideo.putExtra("videoUrl", "https://upload.wikimedia.org/wikipedia/commons/7/7d/Donning_PPE-_Put_on_Outer_Apron_%28if_used%29_CDC11.webm");
                        startVideo.putExtra("videoTitle", "Outer Apron");
                        break;
                    case "Outer Gloves":
                        startVideo.putExtra("videoUrl", "https://upload.wikimedia.org/wikipedia/commons/9/95/Donning_PPE-_Put_on_Outer_Gloves_CDC12.webm");
                        startVideo.putExtra("videoTitle", "Outer Gloves");
                        break;
                    case "Face Shield":
                        startVideo.putExtra("videoUrl", "https://upload.wikimedia.org/wikipedia/commons/6/66/Donning_PPE-_Put_on_Face_Shield_CDC13.webm");
                        startVideo.putExtra("videoTitle", "Face Shield");
                        break;
                    case "Verification":
                        startVideo.putExtra("videoUrl", "https://upload.wikimedia.org/wikipedia/commons/9/94/Donning_PPE-_Verify_CDC14.webm");
                        startVideo.putExtra("videoTitle", "Verification");
                        break;
                    default:
                }
                startActivity(startVideo);


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

        else if(id == R.id.chat_nav)
        {
            Intent openChatActivity = new Intent(VideoNavigationActivity.this, ChatActivity.class);
            startActivity(openChatActivity);
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
            return super.onOptionsItemSelected(item);
        }


    }




}
