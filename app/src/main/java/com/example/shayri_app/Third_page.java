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
    TextView textView,index;
    ImageView img1,img2,img3,back,next,copy,share;
    String ss[];
    int a=0,count=0,i,cnt=0,z=1;
    int gridcolorarr[] = {R.drawable.c1,R.drawable.c2,R.drawable.c3,R.drawable.c4,R.drawable.c5,R.drawable.c6,
            R.drawable.c7,R.drawable.c8,R.drawable.c9,R.drawable.c10,
            R.drawable.c11,R.drawable.c12,R.drawable.c13,R.drawable.c14,R.drawable.c15};


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
        copy = findViewById(R.id.copyicon);
        back = findViewById(R.id.backbutton);
        next = findViewById(R.id.nextbutton);
        share = findViewById(R.id.shareicon);
        index =findViewById(R.id.index);

        img1.setImageResource(R.drawable.expand);
        img2.setImageResource(R.drawable.reload);
        img3.setImageResource(R.drawable.pencil2);
        textView.setText(""+ss[position]);

        a=position;
        z=a+1;
        index.setText(""+z+"/"+ss.length);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(a<ss.length-1) {
                    a++;
                    z=a+1;
                       textView.setText(""+ss[a]);
                       index.setText(""+z+"/"+ss.length);
                }
            }
        });
        a=position;
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(a>0) {
                    a--;
                    z--;
                    textView.setText(""+ss[a]);
                    index.setText(""+z+"/"+ss.length);
                }
            }
        });



     img2.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             if(cnt<15) {
                 if (cnt == i) {
                     textView.setBackgroundResource(gridcolorarr[i]);
                     cnt++;
                     i++;
                 }
             }else{
                 cnt=0;
                 i=0;
             }
         }
     });

//        img1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                //Intent intent = new Intent(Third_page.this,grid_color.class);
//                //intent.putExtra("shayri",ss[position]);
//                //startActivity(intent);
//            }
//        });

        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Third_page.this,Fourth_page.class);
                intent.putExtra("gridcolorarr",gridcolorarr);
                intent.putExtra("shayri",ss[position]);

                startActivity(intent);
            }
        });




    }
}
