package com.lab2;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    Activity context;
    String[] id;
    String[] name;
    String[] address;

    public RecyclerViewAdapter(Activity context,String[] id, String[] name, String[] address){
        this.context=context;
        this.id=id;
        this.name=name;
        this.address=address;
    }

    public int getItemCount(){
        return id.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView tid,tname,taddress;
        public ViewHolder(View itemview){
            super(itemview);
            tid=itemview.findViewById(R.id.id);
            tname= itemview.findViewById(R.id.name);
            taddress=itemview.findViewById(R.id.address);
        }
    }


    public ViewHolder onCreateViewHolder(ViewGroup vg, int p){
        LayoutInflater li = LayoutInflater.from(context);
        return (new ViewHolder(li.inflate(R.layout.recyclerviewitem,vg,false)));
    }


    public void onBindViewHolder(ViewHolder holder, int pos){
        holder.tid.setText(id[pos]);
        holder.tname.setText(name[pos]);
        holder.taddress.setText(address[pos]);
    }
}
