package com.example.shayri_app;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Fourth_page extends AppCompatActivity
{
    TextView textView,t1,t2,t3,t4,t5,t6;
    ImageView imageView1,imageView2;
    int cnt=0,i=0;
    String shayri;
    int[] gridcolorarr;
    int[] position;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth_page);

        textView=findViewById(R.id.txtshayri);
        t1=findViewById(R.id.menu1);
        t2=findViewById(R.id.menu2);
        t3=findViewById(R.id.menu3);
        t4=findViewById(R.id.menu4);
        t5=findViewById(R.id.menu5);
        t6=findViewById(R.id.menu6);
        imageView1=findViewById(R.id.imageview1);
        imageView2=findViewById(R.id.imageview2);
        gridcolorarr = getIntent().getIntArrayExtra("gridcolorarr");
        shayri = getIntent().getStringExtra("shayri");
        textView.setText(""+shayri);

        imageView1.setOnClickListener(new View.OnClickListener() {
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

        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent = new Intent(Fourth_page.this,Background.class);
                //startActivity(intent);
            }
        });
    }
}
