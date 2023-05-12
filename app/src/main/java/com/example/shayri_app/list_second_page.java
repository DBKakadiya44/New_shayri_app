package com.example.shayri_app;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class list_second_page extends AppCompatActivity
{
    ListView listView2;

    String[] shayri;
    int img[] = {R.drawable.bearbar,R.drawable.bestwishesh, R.drawable.ic_launcher_foreground,R.drawable.birthday,R.drawable.boyfriendgirl,R.drawable.child,R.drawable.god,R.drawable.husband,R.drawable.kanjoos,R.drawable.love};


    ListAdapter adapter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        shayri = getIntent().getStringArrayExtra("shayri");
        setContentView(R.layout.activity_list);
        adapter = new ListAdapter(list_second_page.this,img,shayri);
        listView2 = findViewById(R.id.listview2);
        listView2.setAdapter(adapter);




        listView2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(list_second_page.this,Third_page.class);
                intent.putExtra("position",position);
                intent.putExtra("shayri",shayri);

                startActivity(intent);
            }
        });
    }

}