package adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.shayri_app.Background;
import com.example.shayri_app.R;

public class Bg_Adapter extends BaseAdapter {

    Background background; int[] colorarr;

    public Bg_Adapter(Background background, int[] colorarr) {
        this.background = background;
        this.colorarr = colorarr;
    }

    @Override
    public int getCount() {
        return colorarr.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView = LayoutInflater.from(background).inflate(R.layout.bg_grid_color_item,parent,false);

        TextView textView = convertView.findViewById(R.id.background);
        textView.setBackgroundColor(colorarr[position]);
        return convertView;
    }
}
