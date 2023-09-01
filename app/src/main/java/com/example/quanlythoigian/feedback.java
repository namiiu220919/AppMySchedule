package com.example.quanlythoigian;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

import fragment.frgchat;
import fragment.frggroup3;
import fragment.frghome;
import fragment.frgperson;

public class feedback extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        BottomNavigationView bottomnav;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);

        bottomnav = findViewById(R.id.bottomnav);

        bottomnav.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if(item.getItemId()== R.id.home){
                     frghome frghome = new frghome();
                    repalceFrg(frghome);
                }
                else if(item.getItemId()==R.id.chat){
                    frgchat frgchat = new frgchat();
                    repalceFrg(frgchat);
                }
                else if(item.getItemId()==R.id.group){
                    frggroup3 frggroup = new frggroup3();
                    repalceFrg(frggroup);
                }
                else if(item.getItemId()==R.id.person){
                    frgperson frgperson = new frgperson();
                    repalceFrg(frgperson);
                }
                return true;
            }
        });

    }
    public void repalceFrg(Fragment frg){
        FragmentManager fm = getSupportFragmentManager();
        fm.beginTransaction().replace(R.id.frmnav,frg).commit();
    }
}