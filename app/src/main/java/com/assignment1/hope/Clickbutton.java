package com.assignment1.hope;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Clickbutton extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clickbutton);

        listView = (ListView)findViewById(R.id.listview) ;
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Health Promotions");
        arrayList.add("Health Screenings");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(arrayAdapter);

        //Clicking back arrow to go to previous screen

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    //Overriding method by going to code menu and override and select onOptions..

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        //going back to home screen
        int id = item.getItemId();
        if (id == android.R.id.home) {
            Intent categoryIntent = new Intent(Clickbutton.this,navigatebarActivity2.class);
            startActivity(categoryIntent);
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}