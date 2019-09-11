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

public class Semester_4 extends AppCompatActivity implements View.OnClickListener {
Button btn1,btn2,btn3,btn4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semester_4);
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
            Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=11o-LVLic5kkc8CgZUR_0XKdAEwkXUPy_"));
            startActivity(browserIntent);
        }else if(v.getId()==R.id.btn2){
            Intent browserIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/open?id=17Ml0GXmc9Wu7IxouxGSiPcK7nBocY8Ba"));
            startActivity(browserIntent);

        }else if(v.getId()==R.id.btn3){
            Intent browserIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/open?id=1p2C_s3-aYKcTqh-b0LE3anSOZZtYH22o"));
            startActivity(browserIntent);

        }else if(v.getId()==R.id.btn4){
            Intent browserIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/open?id=1ttOLZ1Yh_UdegQnytNvwATNMNDXAGUcI"));
            startActivity(browserIntent);

        }

    }
}
