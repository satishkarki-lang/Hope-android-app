
package com.assignment1.hope;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class EducationbuttonActivity extends AppCompatActivity {

    //creating list view object id
    ListView listView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_educationbutton);

        //adding strings to list
        listView3 = (ListView)findViewById(R.id.listview3) ;
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Training: Certifications, General Technology Education, Digital Badge Opportunities");
        arrayList.add("Mentoring Sessions");
        arrayList.add("Scholarships");
        arrayList.add("Tutoring");
        arrayList.add("ALBH Resume Book");
        arrayList.add("Mock Interview Prep, Resume Writing, and Scholarship Search Assistance");
        arrayList.add("Entrepreneurial Resources: Business Plans, Funding, Pitch Decks, Sample Documentation");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,arrayList);
        listView3.setAdapter(arrayAdapter);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    //Overriding method by going to code menu and override and select onOptions..


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        //going back to home screen
        int id = item.getItemId();
        if (id == android.R.id.home) {
            Intent categoryIntent = new Intent(EducationbuttonActivity.this,navigatebarActivity2.class);
            startActivity(categoryIntent);
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

}