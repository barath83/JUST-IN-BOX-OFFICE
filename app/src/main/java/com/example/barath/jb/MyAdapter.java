package com.example.barath.jb;

import android.content.Context;
import android.provider.ContactsContract;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MyAdapter extends ArrayAdapter<String> {
     String [] names;
     int [] images;
     String [] censor;
     Context mContext;
    public MyAdapter(@NonNull Context context, String[] movienames, int[] movieposters, String[] moviecensor) {
        super(context, R.layout.listview_item);
        this.names= movienames;
        this.images = movieposters;
        this.censor= moviecensor;
        this.mContext = context;
    }

    @Override
    public int getCount() {
        return names.length;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder mViewHolder = new ViewHolder();

        if(convertView==null) {
            LayoutInflater mInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = mInflater.inflate(R.layout.listview_item, parent, false);
            mViewHolder.mimage = (ImageView) convertView.findViewById(R.id.imageView);
            mViewHolder.mname = (TextView) convertView.findViewById(R.id.textView);
            mViewHolder.mcensor= (TextView) convertView.findViewById(R.id.textView3);
            convertView.setTag(mViewHolder);
        }else{
            mViewHolder=(ViewHolder)convertView.getTag();
        }
           mViewHolder.mimage.setImageResource(images[position]);
            mViewHolder.mname.setText(names[position]);
            mViewHolder.mcensor.setText(censor[position]);

        return convertView;
    }
    static class ViewHolder{
        ImageView mimage;
        TextView mname;
        TextView mcensor;

    }

}
