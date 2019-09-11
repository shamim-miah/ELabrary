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

public class Semester_3 extends AppCompatActivity implements View.OnClickListener {

   Button btn1,btn2,btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semester_3);
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
            Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1nqSB9bhH8rXNChZ4TsOOP2nTOvOT_VW-"));
            startActivity(browserIntent);
        }else if(v.getId()==R.id.btn2){
            Intent browserIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/open?id=1KV4yd5e_m7YH4P3ZVk-OJoiV1laKrrYR"));
            startActivity(browserIntent);

        }else if(v.getId()==R.id.btn3){
            Intent browserIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/open?id=16otv9Uy2TOu5zH2Ze1eI1vF74MlmFmj4"));
            startActivity(browserIntent);

        }

    }
}
