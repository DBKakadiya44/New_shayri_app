package adapters;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.shayri_app.Background;

public class Bg_Adapter extends BaseAdapter {

    Background background; int[] colorarr;
    public Bg_Adapter(Background background, int[] colorarr) {
    }

    @Override
    public int getCount() {
        return 0;
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


        return convertView;
    }
}
