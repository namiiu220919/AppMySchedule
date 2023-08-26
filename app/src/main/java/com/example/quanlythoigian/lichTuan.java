package com.example.quanlythoigian;

import android.os.Bundle;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

public class lichTuan extends AppCompatActivity {
    GridView gvLichTuan;
    GridView gvNDLichTuan;
    String[] arrayLich = new String[]{"T2", "T3", "T4", "T5", "T6", "T7", "CN"};
    String[] arrayNDlichTuan = new String[]{"den 1...", "den 1...", "den 1...", "den 1...", "den 1...", "den 1...", "den 1...", "7:30", "", "", "", "", "", "", "9:00", "", "", "", "", "", "", "12:00", "", "", "", "", "", "", "15:00", "", "", "", "", "", "", "19:00", "", "", "", "", "", "", "22:00", "", "", "", "", "", ""};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lich_tuan);
        gvLichTuan = findViewById(R.id.gvLichTuan);
        gvNDLichTuan = findViewById(R.id.gvNDLichTuan);
        lichTuanAdapter adapter = new lichTuanAdapter(lichTuan.this,arrayLich);
        gvLichTuan.setAdapter(adapter);
        NDLichTuanAdapter adapter1 = new NDLichTuanAdapter(lichTuan.this, arrayNDlichTuan);
        gvNDLichTuan.setAdapter(adapter1);
    }
}