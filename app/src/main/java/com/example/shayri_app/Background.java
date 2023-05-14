package com.example.shayri_app;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;

import adapters.Bg_Adapter;

public class Background extends AppCompatActivity
{
    GridView gridView;

    int[] colorarr = {R.color.a1,R.color.a2,R.color.a3,R.color.a4,R.color.a5,R.color.a6,R.color.a7,
            R.color.a8,R.color.a9,R.color.a10,R.color.a11,R.color.a12,R.color.a13,R.color.a14,
            R.color.a15,R.color.a16,R.color.a17,R.color.a18,R.color.a19,R.color.a20,R.color.a21,
            R.color.a22,R.color.a23,R.color.a24,R.color.a25,R.color.a26,R.color.a27,R.color.a28,
            R.color.a29,R.color.a30,R.color.a31,R.color.a32,R.color.a33,R.color.a34,R.color.a35};
    Bg_Adapter adapter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bg_grid_color);

        gridView = findViewById(R.id.bg_gridview);
        adapter = new Bg_Adapter(Background.this,colorarr);

    }
}
