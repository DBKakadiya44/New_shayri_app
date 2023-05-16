package com.example.shayri_app;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.shayri_app.adapters.BgAdapter;
import com.example.shayri_app.adapters.EmojiAdapter;
import com.example.shayri_app.adapters.TextcolorAdapter;
import com.google.android.material.bottomsheet.BottomSheetDialog;

public class Fourth_page extends AppCompatActivity
{
    TextView textView,t1,t2,t3,t4,t5,t6;
    ImageView imageView1,imageView2;
    ListView listView;
    int cnt=0,i=0,a;
    String[] shayri;
    GridView gridView,gridView1,gridView2;
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
        shayri = getIntent().getStringArrayExtra("shayri");
        a = getIntent().getIntExtra("a",0);
        textView.setText(""+shayri[a]);

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

        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(Fourth_page.this);
                bottomSheetDialog.setContentView(R.layout.bottom_sheet_gradients);
                GradiantAdapter2 adapter=new GradiantAdapter2(Fourth_page.this,config.gradientArr);
                gridView=bottomSheetDialog.findViewById(R.id.gridviewGradients);
                gridView.setAdapter(adapter);
                bottomSheetDialog.show();
                gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        textView.setBackgroundResource(config.gradientArr[i]);
                        bottomSheetDialog.dismiss();
                    }
                });
            }
        });

        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BottomSheetDialog bottomSheetDialog2 = new BottomSheetDialog(Fourth_page.this);
                bottomSheetDialog2.setContentView(R.layout.bg_colors);
                BgAdapter adapter2 = new BgAdapter(Fourth_page.this,config.colorarr);
                gridView1 = bottomSheetDialog2.findViewById(R.id.bg_gridview);
                gridView1.setAdapter(adapter2);
                bottomSheetDialog2.show();
                gridView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        textView.setBackgroundResource(config.colorarr[position]);
                        bottomSheetDialog2.dismiss();
                    }
                });
            }
        });

        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BottomSheetDialog bottomSheetDialog3 = new BottomSheetDialog(Fourth_page.this);
                bottomSheetDialog3.setContentView(R.layout.activity_text_color);
                TextcolorAdapter adapter3 = new TextcolorAdapter(Fourth_page.this,config.colorarr);
                gridView2 = bottomSheetDialog3.findViewById(R.id.textcolor_gridview);
                gridView2.setAdapter(adapter3);
                bottomSheetDialog3.show();
                gridView2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position1, long id) {
                        textView.setTextColor(getResources().getColor(config.colorarr[position1]));
                        bottomSheetDialog3.dismiss();
                    }
                });
            }
        });

        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BottomSheetDialog bottomSheetDialog3 = new BottomSheetDialog(Fourth_page.this);
                bottomSheetDialog3.setContentView(R.layout.activity_font);
            }
        });

        t5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BottomSheetDialog bottomSheetDialog4 = new BottomSheetDialog(Fourth_page.this);
                bottomSheetDialog4.setContentView(R.layout.activity_emoji);
                EmojiAdapter adapter4 = new EmojiAdapter(Fourth_page.this,config.emoji);
                listView = bottomSheetDialog4.findViewById(R.id.emoji_listview);
                listView.setAdapter(adapter4);
                bottomSheetDialog4.show();

                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        textView.setText(""+config.emoji[position]+"\n"+shayri[position]+"\n"+config.emoji[position]);
                        bottomSheetDialog4.dismiss();
                    }
                });
            }
        });

    }
}
