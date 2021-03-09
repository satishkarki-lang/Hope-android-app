package com.assignment1.hope;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


// Code for going back to to home screen by clicking back arrow

public class FinancebuttonActivity extends AppCompatActivity {

    //creating list view object id
    ListView listView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_financebutton);

        //adding strings to list
        listView4 = (ListView)findViewById(R.id.listview4);
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Financial Advice: 1:1 sessions");
        arrayList.add("Endowment Fund: For black-owned businesses and entrepreneurial ventures");
        arrayList.add("Wealth Creation Tactic Consultations: Home Ownership, Vehicle Purchasing,  Consumer Habits");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,arrayList);
        listView4.setAdapter(arrayAdapter);



        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    //Overriding method by going to code menu and override and select onOptions..


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        //going back to home screen
        int id = item.getItemId();
        if (id == android.R.id.home) {
            Intent categoryIntent = new Intent(FinancebuttonActivity.this,navigatebarActivity2.class);
            startActivity(categoryIntent);
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

}