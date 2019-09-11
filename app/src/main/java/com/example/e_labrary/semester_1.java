package com.example.e_labrary;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CursorAdapter;
import android.widget.ListView;
import android.widget.SearchView;

import java.util.ArrayList;

public class semester_1 extends AppCompatActivity implements View.OnClickListener{


   Button btn1,btn2,btn3;
    private String[] bookNames;
    private int[] bookImages={ R.drawable.completec,R.drawable.fc,R.drawable.circuit };

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semester_1);

        bookNames = getResources().getStringArray(R.array.bookshelf_1);
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


