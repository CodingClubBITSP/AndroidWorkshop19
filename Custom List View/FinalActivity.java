package com.example.ayush.customlistview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class FinalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);

        //Setting the title obtained from the listitem clicked(the string had been stored via intentExtras in key 'title')
        Intent intent=getIntent();
        setTitle(intent.getExtras().getString("title"));
    }
}
