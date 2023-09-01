package com.example.quanlythoigian.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.quanlythoigian.R;
import com.example.quanlythoigian.adapter.danhsach_home_adapter;
//import com.example.quanlythoigian.dao.dsdao;
import com.example.quanlythoigian.dao.dsdao;
import com.example.quanlythoigian.databinding.FragmentFragmenthomeBinding;
import com.example.quanlythoigian.model.danhsachthoigian;

import java.util.ArrayList;

public class Fragmenthome extends Fragment {
private FragmentFragmenthomeBinding binding;
private danhsach_home_adapter adapter;
    dsdao dsDao;
private ArrayList<danhsachthoigian> list = new ArrayList<>();

    public Fragmenthome() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.fragment_fragmenthome, container, false);
        LinearLayoutManager layout = new LinearLayoutManager(getActivity());
        dsDao = new dsdao(getActivity());
        list=dsDao.selectAll();
        binding.Recycleviewdanhsach.setLayoutManager(layout);
        adapter = new danhsach_home_adapter(getActivity(),list);
        binding.Recycleviewdanhsach.setAdapter(adapter);
        return view ;
    }
}