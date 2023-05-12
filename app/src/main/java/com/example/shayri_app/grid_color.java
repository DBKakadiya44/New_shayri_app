package com.example.shayri_app;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;
import android.widget.TextView;

public class grid_color extends AppCompatActivity
{
    GridView gridView;
    gridAdapter adapter;
    int gridcolorarr[] = {R.drawable.c1,R.drawable.c2,R.drawable.c3,R.drawable.c4,R.drawable.c5,R.drawable.c6,R.drawable.c7,R.drawable.c8,R.drawable.c9,R.drawable.c10,R.drawable.c11,R.drawable.c12};
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_colors);
        gridView = findViewById(R.id.gridviewcolor);
        adapter = new gridAdapter(grid_color.this,gridcolorarr);
        gridView.setAdapter(adapter);
    }
}
