package com.example.ayush.customlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class CustomAdapter extends ArrayAdapter<ItemChat> {

    //constructor to decide which array to use
    public CustomAdapter(Context context, ArrayList<ItemChat> objects) {
        super(context, 0, objects);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent) {


        //Check if the existing view is being used if not inflate a new view
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.layout_item_chat, parent, false);}

        //Get the item located at the current position
        ItemChat item = getItem(position);

        //referencing to views
        TextView mcontact = listItemView.findViewById(R.id.name);
        TextView mtime = listItemView.findViewById(R.id.time);
        TextView mtext = listItemView.findViewById(R.id.text);
        ImageView profile = listItemView.findViewById(R.id.photo);

        //setting texts and images using the getters of the itemChat class
        mcontact.setText(item.getMcontact());
        mtime.setText(item.getMtime());
        mtext.setText(item.getMtext());
        profile.setImageResource(item.getmImageID());

        return listItemView;
    }
}