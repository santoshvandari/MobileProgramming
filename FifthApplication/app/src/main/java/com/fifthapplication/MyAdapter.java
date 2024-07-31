package com.fifthapplication;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAdapter extends ArrayAdapter<String> {
    Activity context;
    int[] img;
    String[] names;
    String[] details;
    public MyAdapter(Activity context,int[] img, String[] names, String[] details){
        super(context,R.layout.customitem,names);
        this.names=names;
        this.img=img;
        this.details=details;
        this.context=context;
    }

    public View getView(int pos, View view, ViewGroup vg){
        LayoutInflater inflater = context.getLayoutInflater();
        View v = inflater.inflate(R.layout.customitem,null,false);


        ImageView image = v.findViewById(R.id.image);
        TextView name = v.findViewById(R.id.name);
        TextView detail = v.findViewById(R.id.details);
        name.setText(names[pos]);
        detail.setText(details[pos]);
        image.setImageResource(img[pos]);


        return v;
    };
}
