package com.example.barath.jb;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CCAdapter extends ArrayAdapter<String> {
    String [] names;
    int [] images;
    Context cContext;



    public CCAdapter(@NonNull Context context, String[] castname, int[] castimages) {
        super(context, R.layout.cclist);
        this.names= castname;
        this.images = castimages;

        this.cContext = context;
    }

    @Override
    public int getCount() {
        return names.length;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder cViewHolder = new ViewHolder();

        if(convertView==null) {
            LayoutInflater mInflater = (LayoutInflater) cContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = mInflater.inflate(R.layout.cclist, parent, false);
            cViewHolder.cimage = (ImageView) convertView.findViewById(R.id.imageView3);
            cViewHolder.cname = (TextView) convertView.findViewById(R.id.textView12);

            convertView.setTag(cViewHolder);
        }else{
            cViewHolder=(ViewHolder)convertView.getTag();
        }
        cViewHolder.cimage.setImageResource(images[position]);
        cViewHolder.cname.setText(names[position]);



        return convertView;
    }
    static class ViewHolder{
        ImageView cimage;
        TextView cname;


    }

}
