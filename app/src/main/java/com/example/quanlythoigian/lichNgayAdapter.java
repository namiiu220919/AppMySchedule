package com.example.quanlythoigian;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class lichNgayAdapter extends BaseAdapter {
    private final Context context;
    private final String[]  lichNgay;

    public lichNgayAdapter(Context context, String[] lichNgay) {
        this.context = context;
        this.lichNgay = lichNgay;
    }

    @Override
    public int getCount() {
        return lichNgay.length;
    }

    @Override
    public Object getItem(int position) {
        return lichNgay[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (position == 0) {
            convertView = LayoutInflater.from(context).inflate(R.layout.khung2, parent, false);
        } else {
            convertView = LayoutInflater.from(context).inflate(R.layout.khung3, parent, false);
        }

        TextView textView = convertView.findViewById(R.id.txtO1);
        textView.setText(lichNgay[position]);
        return convertView;
    }
}
