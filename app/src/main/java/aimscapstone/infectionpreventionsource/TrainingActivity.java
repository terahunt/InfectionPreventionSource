package aimscapstone.infectionpreventionsource;

import android.content.ClipData;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.DragEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


public class TrainingActivity extends ActionBarActivity {

    private ImageView mHandWashStep1;
    private ImageView mHandWashStep2;
    private ImageView mHandWashStep3;
    private ImageView mHandWashStep4;

    private LinearLayout mBottomLeft;
    private LinearLayout mBottomRight;
    private LinearLayout mMiddleLeft;
    private LinearLayout mMiddleRight;
    private LinearLayout mLanding;

    private Button mCheckAnswerButton;

    private TextView mCheckAnswerTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_training);


        mHandWashStep1 = (ImageView) findViewById(R.id.handWashStep1);

        mHandWashStep1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    ClipData data = ClipData.newPlainText("", "");
                    View.DragShadowBuilder sBuilder = new View.DragShadowBuilder(v);
                    v.startDrag(data, sBuilder, v, 0);
                    v.setVisibility(View.INVISIBLE);
                    return true;
                } else {
                    return false;
                }
            }
        });

        mHandWashStep2 = (ImageView) findViewById(R.id.handWashStep2);

        mHandWashStep2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    ClipData data = ClipData.newPlainText("", "");
                    View.DragShadowBuilder sBuilder = new View.DragShadowBuilder(v);
                    v.startDrag(data, sBuilder, v, 0);
                    v.setVisibility(View.INVISIBLE);
                    return true;
                } else {
                    return false;
                }
            }
        });

        mHandWashStep3 = (ImageView) findViewById(R.id.handWashStep3);

        mHandWashStep3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    ClipData data = ClipData.newPlainText("", "");
                    View.DragShadowBuilder sBuilder = new View.DragShadowBuilder(v);
                    v.startDrag(data, sBuilder, v, 0);
                    v.setVisibility(View.INVISIBLE);
                    return true;
                } else {
                    return false;
                }
            }
        });

        mHandWashStep4 = (ImageView) findViewById(R.id.handWashStep4);

        mHandWashStep4.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    ClipData data = ClipData.newPlainText("", "");
                    View.DragShadowBuilder sBuilder = new View.DragShadowBuilder(v);
                    v.startDrag(data, sBuilder, v, 0);
                    v.setVisibility(View.INVISIBLE);
                    return true;
                } else {
                    return false;
                }
            }
        });

        mBottomLeft = (LinearLayout) findViewById(R.id.bottomLeft);

        mBottomLeft.setOnDragListener(new View.OnDragListener() {
                                          @Override
                                          public boolean onDrag(View v, DragEvent event) {
                                              int action = event.getAction();
                                              View view = (View) event.getLocalState();
                                              switch (action) {
                                                  case DragEvent.ACTION_DROP:
                                                      // Dropped, reassign View to ViewGroup
                                                      ViewGroup owner = (ViewGroup) view.getParent();
                                                      owner.removeView(view);
                                                      LinearLayout container = (LinearLayout) v;
                                                      container.addView(view);
                                                      view.setVisibility(View.VISIBLE);
                                                      break;
                                                  case DragEvent.ACTION_DRAG_ENDED:
                                                      view.setVisibility(View.VISIBLE);

                                                  default:
                                                      break;
                                              }
                                              return true;
                                          }



                                      }

        );

        mMiddleLeft = (LinearLayout) findViewById(R.id.middleLeft);

        mMiddleLeft.setOnDragListener(new View.OnDragListener() {
                                          @Override
                                          public boolean onDrag(View v, DragEvent event) {
                                              int action = event.getAction();
                                              View view = (View) event.getLocalState();
                                              switch (action) {
                                                  case DragEvent.ACTION_DROP:
                                                      // Dropped, reassign View to ViewGroup
                                                      ViewGroup owner = (ViewGroup) view.getParent();
                                                      owner.removeView(view);
                                                      LinearLayout container = (LinearLayout) v;
                                                      container.addView(view);
                                                      view.setVisibility(View.VISIBLE);
                                                      break;
                                                  case DragEvent.ACTION_DRAG_ENDED:
                                                      view.setVisibility(View.VISIBLE);
                                                      break;
                                                  default:
                                                      break;
                                              }
                                              return true;
                                          }

                                      }

        );

        mMiddleRight = (LinearLayout) findViewById(R.id.middleRight);

        mMiddleRight.setOnDragListener(new View.OnDragListener() {
                                           @Override
                                           public boolean onDrag(View v, DragEvent event) {
                                               int action = event.getAction();
                                               View view = (View) event.getLocalState();
                                               switch (action) {
                                                   case DragEvent.ACTION_DROP:
                                                       // Dropped, reassign View to ViewGroup
                                                       ViewGroup owner = (ViewGroup) view.getParent();
                                                       owner.removeView(view);
                                                       LinearLayout container = (LinearLayout) v;
                                                       container.addView(view);
                                                       view.setVisibility(View.VISIBLE);
                                                       break;
                                                   case DragEvent.ACTION_DRAG_ENDED:
                                                       view.setVisibility(View.VISIBLE);
                                                       break;
                                                   default:
                                                       break;
                                               }
                                               return true;
                                           }

                                       }

        );

        mBottomRight = (LinearLayout) findViewById(R.id.bottomRight);

        mBottomRight.setOnDragListener(new View.OnDragListener() {
                                           @Override
                                           public boolean onDrag(View v, DragEvent event) {
                                               int action = event.getAction();
                                               View view = (View) event.getLocalState();
                                               switch (action) {
                                                   case DragEvent.ACTION_DROP:
                                                       // Dropped, reassign View to ViewGroup
                                                       ViewGroup owner = (ViewGroup) view.getParent();
                                                       owner.removeView(view);
                                                       LinearLayout container = (LinearLayout) v;
                                                       container.addView(view);
                                                       view.setVisibility(View.VISIBLE);
                                                       break;
                                                   case DragEvent.ACTION_DRAG_ENDED:
                                                       view.setVisibility(View.VISIBLE);
                                                       break;
                                                   default:
                                                       break;
                                               }
                                               return true;
                                           }

                                       }

        );

        mLanding = (LinearLayout) findViewById(R.id.holdingArea);

        mLanding.setOnDragListener(new View.OnDragListener() {
                                           @Override
                                           public boolean onDrag(View v, DragEvent event) {
                                               int action = event.getAction();
                                               View view = (View) event.getLocalState();
                                               switch (action) {
                                                   case DragEvent.ACTION_DROP:
                                                       // Dropped, reassign View to ViewGroup
                                                       ViewGroup owner = (ViewGroup) view.getParent();
                                                       owner.removeView(view);
                                                       LinearLayout container = (LinearLayout) v;
                                                       container.addView(view);
                                                       view.setVisibility(View.VISIBLE);
                                                       break;
                                                   case DragEvent.ACTION_DRAG_ENDED:
                                                       view.setVisibility(View.VISIBLE);
                                                       break;
                                                   default:
                                                       break;
                                               }
                                               return true;
                                           }

                                       }

        );

        mCheckAnswerButton = (Button) findViewById(R.id.checkAnswerButton);
        mCheckAnswerTextView = (TextView) findViewById(R.id.checkAnswerTextView);

        mCheckAnswerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mBottomLeft.getChildAt(0)==mHandWashStep1&&mMiddleLeft.getChildAt(0)==mHandWashStep2
                &&mMiddleRight.getChildAt(0)==mHandWashStep3&&mBottomRight.getChildAt(0)==mHandWashStep4)
                {
                    mCheckAnswerTextView.setText("That is correct!");
                    mCheckAnswerTextView.setTextColor(Color.parseColor("#2C7850"));
                }
                else
                {
                    mCheckAnswerTextView.setText("That is wrong, try again.");
                    mCheckAnswerTextView.setTextColor(Color.parseColor("#C73B31"));
                }
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
            Intent openResourcesActivity = new Intent(TrainingActivity.this, ResourcesActivity.class);
            startActivity(openResourcesActivity);
            return true;
        }

        else if(id == R.id.video_nav)
        {
            Intent openVideoActivity = new Intent(TrainingActivity.this, MainVideoNavigationActivity.class);
            startActivity(openVideoActivity);
            return true;
        }

        else if(id == R.id.chat_nav)
        {
            Intent openChatActivity = new Intent(TrainingActivity.this, ChatActivity.class);
            startActivity(openChatActivity);
            return true;
        }

        else if(id == R.id.home_nav)
        {
            Intent openMainActivity = new Intent(TrainingActivity.this, MainActivity.class);
            startActivity(openMainActivity);
            return true;
        }

        else
        {
            return super.onOptionsItemSelected(item);
        }


    }

}
