package aimscapstone.infectionpreventionsource;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ResourcesAdapter extends BaseAdapter {
    Activity context;
    String[] resourcesTitle;
    String[] resourcesDesc;

    public ResourcesAdapter(Activity context, String[] resourcesTitle, String[] resourcesDesc) {
        super();
        this.context = context;
        this.resourcesTitle = resourcesTitle;
        this.resourcesDesc = resourcesDesc;
    }

    @Override
    public int getCount() {
        return resourcesTitle.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = context.getLayoutInflater();

        convertView = inflater.inflate(R.layout.resources_row_layout, null);

        final TextView title = (TextView) convertView.findViewById(R.id.resourcesRowTextViewTitle);
        final TextView desc = (TextView) convertView.findViewById(R.id.resourcesRowTextViewDesc);

        final ImageView imageView = (ImageView) convertView.findViewById(R.id.resourcesImageView);

        imageView.setImageResource(R.mipmap.arrow);
        title.setText(resourcesTitle[position]);
        desc.setText(resourcesDesc[position]);
        desc.setVisibility(View.GONE);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(desc.getVisibility()==View.GONE) {
                    desc.setVisibility(View.VISIBLE);
                    imageView.setRotation(90);
                }
                else {
                    desc.setVisibility(View.GONE);
                    imageView.setRotation(0);
                }
            }
        });


        return convertView;
    }

    @Override
    public boolean isEnabled(int position) {
        // TODO Auto-generated method stub

        return false;
    }
}
