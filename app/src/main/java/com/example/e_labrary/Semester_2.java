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

public class Semester_2 extends AppCompatActivity implements View.OnClickListener {
    Button btn1,btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semester_2);
        btn1 = findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.btn1){
            Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1X1RAL7fzBLaalQszHVzN0syGYmOq16fn"));
            startActivity(browserIntent);
        }else if(v.getId()==R.id.btn2){
            Intent browserIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/open?id=11vKUT-jgjVcY69VIh0SF1gHrAeBg3drm"));
            startActivity(browserIntent);

        }

    }
}
