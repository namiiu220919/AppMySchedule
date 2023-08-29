package com.example.quanlythoigian.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.example.quanlythoigian.R;


public class lich_thang_new extends Fragment {
    GridView gvLichThang;
    GridView gvNDLichThang;
    String[] arrayLich = new String[]{"T2", "T3", "T4", "T5", "T6", "T7", "CN"};
    String[] arrayNDlichTuan = new String[]{"den 1...", "den 1...", "den 1...", "den 1...", "den 1...", "den 1...", "den 1...",
            "den 1...", "den 1...", "den 1...", "den 1...", "den 1...", "den 1...", "den 1...",
            "den 1...", "den 1...", "den 1...", "den 1...", "den 1...", "den 1...", "den 1...",
            "den 1...", "den 1...", "den 1...", "den 1...", "den 1...", "den 1...", "den 1...",
            "den 1...", "den 1...", "den 1...", "den 1...", "den 1...", "den 1...", "den 1..."};
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_lich_thang_new, container, false);
    }
}