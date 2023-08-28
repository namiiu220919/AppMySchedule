package com.example.quanlythoigian;

import android.os.Bundle;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

public class lichThang extends AppCompatActivity {
    GridView gvLichThang;
    GridView gvNDLichThang;
    String[] arrayLich = new String[]{"T2", "T3", "T4", "T5", "T6", "T7", "CN"};
    String[] arrayNDlichTuan = new String[]{"den 1...", "den 1...", "den 1...", "den 1...", "den 1...", "den 1...", "den 1...",
            "den 1...", "den 1...", "den 1...", "den 1...", "den 1...", "den 1...", "den 1...",
            "den 1...", "den 1...", "den 1...", "den 1...", "den 1...", "den 1...", "den 1...",
            "den 1...", "den 1...", "den 1...", "den 1...", "den 1...", "den 1...", "den 1...",
            "den 1...", "den 1...", "den 1...", "den 1...", "den 1...", "den 1...", "den 1..."};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lich_thang);
        gvLichThang = findViewById(R.id.gvLichThang);
        gvNDLichThang = findViewById(R.id.gvNDLichThang);
        lichThangAdapter adapter = new lichThangAdapter(lichThang.this,arrayLich);
        gvLichThang.setAdapter(adapter);
        NDLichThangAdpater adpater1 = new NDLichThangAdpater(lichThang.this,arrayNDlichTuan);
        gvNDLichThang.setAdapter(adpater1);
    }
}