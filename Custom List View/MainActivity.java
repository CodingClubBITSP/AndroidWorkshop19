package com.example.ayush.customlistview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Creating and adding items to arratlist
        ArrayList<ItemChat> chats=new ArrayList<>();
        chats.add(new ItemChat("Jenny","23:17","Let's meet up!",R.drawable.p1));
        chats.add(new ItemChat("Evan","22:46","?",R.drawable.p2));
        chats.add(new ItemChat("Emily","17:46","How about lunch?",R.drawable.p3));
        chats.add(new ItemChat("George","15:46","Nice game!",R.drawable.p4));
        chats.add(new ItemChat("Brad","11:32","Thnx m8",R.drawable.p));
        chats.add(new ItemChat("Robert","Yesterday","Okay got it",R.drawable.p6));
        chats.add(new ItemChat("Alissa","24/01/19","Anyone playing?",R.drawable.p7));
        chats.add(new ItemChat("James","23/01/19","Come to the ground",R.drawable.p8));
        chats.add(new ItemChat("Annie","23/01/19","Had a great time",R.drawable.p9));
        chats.add(new ItemChat("Smith","22/01/19","Project finished",R.drawable.p10));

        //Custom Adapter to convert Array List of objects into view ItemChat loaded into listview container
        final CustomAdapter list=new CustomAdapter(this,chats);

        //Initialize listview with reference to listview in xml via id
        ListView listView=findViewById(R.id.list);

        //Setting the adapter
        listView.setAdapter(list);

        //Defining an onClickListener to handle the events on clicking an item in the listview
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //move to acitivity FinalActivity
                Intent intent = new Intent(MainActivity.this,FinalActivity.class);

                //storing contact name in string
                String title=list.getItem(position).getMcontact();

                //using intent extra to transfer string to next activity
                intent.putExtra("title",title);

                //Starting new activity with intent object created
                startActivity(intent);
            }
        });
        
    }
}
