//package com.example.shayri_app;
//
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.BaseAdapter;
//import android.widget.TextView;
//
//public class gridAdapter extends BaseAdapter
//{
//    grid_color grid_color;
//    int[] gridcolorarr;
//
//    public gridAdapter(com.example.shayri_app.grid_color grid_color, int[] gridcolorarr) {
//        this.grid_color = grid_color;
//        this.gridcolorarr = gridcolorarr;
//    }
//
//    @Override
//    public int getCount() {
//        return gridcolorarr.length;
//    }
//
//    @Override
//    public Object getItem(int position) {
//        return position;
//    }
//
//    @Override
//    public long getItemId(int position) {
//        return position;
//    }
//
//    @Override
//    public View getView(int position, View convertView, ViewGroup parent) {
//        convertView = LayoutInflater.from(grid_color).inflate(R.layout.grid_color_item,parent,false);
//
//        TextView textView = convertView.findViewById(R.id.gridcolor);
//        textView.setBackgroundResource(gridcolorarr[position]);
//
//        return convertView;
//    }
//}
