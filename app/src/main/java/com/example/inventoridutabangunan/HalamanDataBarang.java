package com.example.inventoridutabangunan;

import android.provider.ContactsContract;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class HalamanDataBarang extends Fragment {

    private RecyclerView recyclerView;
    private ArrayList<DataBarang> data = new ArrayList<>();
    private HalamanDataBarangAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_data_barang, container, false);

        recyclerView = rootView.findViewById(R.id.rvutama);
        int numberOfColumns = 1;
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(), numberOfColumns));

        for (int i = 0; i < 10; i++) {
            DataBarang dataBarang = new DataBarang("Kuas","0000001","55","pcs","5000","7000");
            data.add(dataBarang);
        }

        adapter = new HalamanDataBarangAdapter(getActivity(),data);
        recyclerView.setAdapter(adapter);

        return rootView;
    }
}
