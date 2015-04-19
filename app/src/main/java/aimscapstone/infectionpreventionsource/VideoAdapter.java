package aimscapstone.infectionpreventionsource;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class VideoAdapter extends BaseAdapter {
        Activity context;
        String[] videoTitle;
        String[] videoDesc;
        int[] videoImage;

        public VideoAdapter(Activity context, String[] videoTitle, String[] videoDesc, int[] videoImage) {
            super();
            this.context = context;
            this.videoTitle = videoTitle;
            this.videoDesc = videoDesc;
            this.videoImage = videoImage;
        }

        @Override
        public int getCount() {
            return videoTitle.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
         public long getItemId(int position) {
        return 0;
    }

        public String getItemTitle(int position) {
            return this.videoTitle[position];
    }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            LayoutInflater inflater = context.getLayoutInflater();

            convertView = inflater.inflate(R.layout.video_row_layout, null);

            final TextView title = (TextView) convertView.findViewById(R.id.videoRowTitle);
            final TextView desc = (TextView) convertView.findViewById(R.id.videoRowDesc);

            final ImageView imageView = (ImageView) convertView.findViewById(R.id.videoImageView);

            imageView.setImageResource(videoImage[position]);
            title.setText(videoTitle[position]);
            desc.setText(videoDesc[position]);

            return convertView;
        }
    }


