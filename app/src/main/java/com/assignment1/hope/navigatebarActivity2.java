package com.assignment1.hope;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Menu;
import android.widget.Button;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class navigatebarActivity2 extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;

//    Creating button for health, finance, education and community
    private Button healthBtn;
    private Button financialBtn;
    private Button educationBtn;
    private Button communityBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigatebar2);


                  //clicking health button
        healthBtn = findViewById(R.id.healthbtn);

        healthBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntent = new Intent(navigatebarActivity2.this,Clickbutton.class);
                startActivity(categoryIntent);
                finish();
            }
        });
                //clicking health button to open new activity finished


                //clicking financial button to open new activity
                financialBtn = findViewById(R.id.financialbtn);

                financialBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent categoryIntent = new Intent(navigatebarActivity2.this,FinancebuttonActivity.class);
                        startActivity(categoryIntent);
                        finish();
                    }
                });
                        //clicking financial button to open new activity finished


                        //clicking education button to open new activity
                        educationBtn = findViewById(R.id.educationbtn);

                        educationBtn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent categoryIntent = new Intent(navigatebarActivity2.this,EducationbuttonActivity.class);
                                startActivity(categoryIntent);
                                finish();
                            }
                        });
                                //clicking education button to open new activity finished


                                //clicking community button to open new activity
                                communityBtn = findViewById(R.id.communitybtn);
                                communityBtn.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        Intent categoryIntent = new Intent(navigatebarActivity2.this,CommunitybuttonActivity.class);
                                        startActivity(categoryIntent);
                                        finish();
                                        //clicking community button to open new activity finished

                                    }
                                });




        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_gallery, R.id.nav_slideshow)
                .setDrawerLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.navigatebar_activity2, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }
}