package com.example.shayri_app;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Third_page extends AppCompatActivity
{
    TextView textView;
    ImageView img1,img2,img3;
    String ss[];


    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_page);
        textView = findViewById(R.id.shayri);
        ss = getIntent().getStringArrayExtra("shayri");
        int position = getIntent().getIntExtra("position",0);
        img1 = findViewById(R.id.thirdimg1);
        img2 = findViewById(R.id.thirdimg2);
        img3 = findViewById(R.id.thirdimg3);
        img1.setImageResource(R.drawable.expand);
        img2.setImageResource(R.drawable.reload);
        img3.setImageResource(R.drawable.pencil2);

        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Third_page.this,grid_color.class);
                startActivity(intent);
            }
        });


        textView.setText(""+ss[position]);

    }
}
