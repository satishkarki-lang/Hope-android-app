package com.assignment1.hope;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class CommunitybuttonActivity extends AppCompatActivity {

    //list view object id
    ListView listView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_communitybutton);

        //adding strings to list view
        listView1 = (ListView)findViewById(R.id.listview1) ;
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Meal Sponsorships – partnerships with local food kitchens");
        arrayList.add("Free Health Care Screenings and education");
        arrayList.add("Assist Local Chamber of Commerce / Urban League");
        arrayList.add("Entrepreneurial Growth & Development");
        arrayList.add("Wifi Enhancements");
        arrayList.add("Home PC Kits");


        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,arrayList);
        listView1.setAdapter(arrayAdapter);

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
            Intent categoryIntent = new Intent(CommunitybuttonActivity.this,navigatebarActivity2.class);
            startActivity(categoryIntent);
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}