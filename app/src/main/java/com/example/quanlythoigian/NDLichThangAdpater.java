package com.example.quanlythoigian;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class NDLichThangAdpater extends BaseAdapter {
    private final Context context;
    private final String[] NDLichThang;

    public NDLichThangAdpater(Context context, String[] ndLichThang) {
        this.context = context;
        NDLichThang = ndLichThang;
    }

    @Override
    public int getCount() {
        return NDLichThang.length;
    }

    @Override
    public Object getItem(int position) {
        return NDLichThang[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(this.context).inflate(R.layout.khung1, parent, false);
        }

        TextView textView = (TextView)convertView.findViewById(R.id.txtNDLich);
        textView.setText(this.NDLichThang[position]);
        return convertView;
    }
}
