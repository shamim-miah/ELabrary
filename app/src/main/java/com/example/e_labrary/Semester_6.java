package com.example.e_labrary;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SearchView;

import java.util.ArrayList;

public class Semester_6 extends AppCompatActivity implements View.OnClickListener {
    Button btn1,btn2,btn3,btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semester_6);
        btn1 = findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.btn1){
            Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1tz_li6MVepkHEFb5lXxXh8Pjuqz_yEmH"));
            startActivity(browserIntent);
        }else if(v.getId()==R.id.btn2){
            Intent browserIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/open?id=1Di8cFaNEdBiwa7BBwyM_uJJ6RnzvJT-h"));
            startActivity(browserIntent);

        }else if(v.getId()==R.id.btn3){
            Intent browserIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/open?id=1C21k5R87aRvE83xrxZkTeGEAQoeiwl7M"));
            startActivity(browserIntent);

        }else if(v.getId()==R.id.btn4){
            Intent browserIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/open?id=1N_dSZfnQHWczz4OhMtYycddbz3F_hQj8"));
            startActivity(browserIntent);

        }

    }
}
