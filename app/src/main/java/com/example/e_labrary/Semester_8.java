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

public class Semester_8 extends AppCompatActivity implements View.OnClickListener {
Button btn1,btn2,btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semester_8);
        btn1 = findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.btn1){
            Intent browserIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/open?id=1AV_THxKb3q_4QwRK6yOunYgkvefC_apZ"));
            startActivity(browserIntent);
        }else if(v.getId()==R.id.btn2){
            Intent browserIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/open?id=1Ymw4Z9sc5db_2zG7aBvnedBstgJdixCe"));
            startActivity(browserIntent);

        }else if(v.getId()==R.id.btn3){
            Intent browserIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/open?id=1L45lKv9zagjI0FEHm_CSa9nA6AdveyFp"));
            startActivity(browserIntent);

        }
    }
}
