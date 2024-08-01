package com.fifthapplication;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder>{
    String[] courses;
    String[] description;
    Activity context;
    public RecyclerAdapter(Activity context,String[] courses, String[] description){
        this.context=context;
        this.courses=courses;
        this.description=description;
    }

    public ViewHolder onCreateViewHolder(ViewGroup vg, int viewType){
        LayoutInflater li = LayoutInflater.from(context);
        View listItem = li.inflate(R.layout.recycleritem,vg,false);
        ViewHolder viewholder = new ViewHolder(listItem);
        return viewholder;
    }



    public void onBindViewHolder(ViewHolder holder, int position){
        holder.course.setText(courses[position]);
        holder.desc.setText(description[position]);
    }




    public int getItemCount(){

        return courses.length;
    }

    public static class ViewHolder extends  RecyclerView.ViewHolder{
        TextView course,desc;
        public ViewHolder(View itemview){
            super(itemview);
            course = itemview.findViewById(R.id.course);
            desc = itemview.findViewById(R.id.desc);

        }
    }




}
