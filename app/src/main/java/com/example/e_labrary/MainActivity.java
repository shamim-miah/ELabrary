package com.example.e_labrary;


import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.MenuItem;
import android.view.View;
import android.widget.Adapter;
import android.widget.SearchView;


public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        mDrawerLayout=(DrawerLayout) findViewById(R.id.drawer);
        mToggle=new ActionBarDrawerToggle(this,mDrawerLayout,R.string.open,R.string.close);
       mDrawerLayout.addDrawerListener(mToggle);
       mToggle.syncState();
       getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        NavigationView navigation=(NavigationView) findViewById(R.id.navigation_view);
        navigation.setNavigationItemSelectedListener(this);

        CardView card_1=(CardView) findViewById(R.id.semester_1_id);
        CardView card_2=(CardView) findViewById(R.id.semester_2_id);
        CardView card_3=(CardView) findViewById(R.id.semester_3_id);
        CardView card_4=(CardView) findViewById(R.id.semester_4_id);
        CardView card_5=(CardView) findViewById(R.id.semester_5_id);
        CardView card_6=(CardView) findViewById(R.id.semester_6_id);
        CardView card_7=(CardView) findViewById(R.id.semester_7_id);
        CardView card_8=(CardView) findViewById(R.id.semester_8_id);


        card_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, semester_1.class);
                startActivity(intent);


            }
        });

        card_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Semester_2.class);
                startActivity(intent);
            }
        });

        card_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Semester_3.class);
                startActivity(intent);
            }
        });

        card_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Semester_4.class);
                startActivity(intent);
            }
        });

        card_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Semester_5.class);
                startActivity(intent);

            }
        });

        card_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Semester_6.class);
                startActivity(intent);
            }
        });

        card_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Semester_7.class);
                startActivity(intent);
            }
        });

        card_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Semester_8.class);
                startActivity(intent);
            }
        });

    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        if(mToggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id==R.id.home1){
            Intent intent = new Intent(MainActivity.this,MainActivity.class);
            startActivity(intent);
        }
        if (id==R.id.about){
            Intent intent = new Intent(MainActivity.this,About.class);
            startActivity(intent);
        }
        if (id==R.id.service){
            Intent intent = new Intent(MainActivity.this, Service.class);
            startActivity(intent);
        }
        if(id==R.id.admin){
            Intent intent= new Intent(MainActivity.this,Admin.class);
            startActivity(intent);
        }
      return false;
    }



}
