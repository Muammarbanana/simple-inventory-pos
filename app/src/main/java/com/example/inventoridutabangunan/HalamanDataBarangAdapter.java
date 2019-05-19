package com.example.inventoridutabangunan;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Dictionary;

public class HalamanDataBarangAdapter extends RecyclerView.Adapter<HalamanDataBarangAdapter.ViewHolder> {

    private LayoutInflater mInflater;
    private ArrayList<DataBarang> data = new ArrayList<>();

    public HalamanDataBarangAdapter(Context context, ArrayList<DataBarang> data) {
        this.mInflater = LayoutInflater.from(context);
        this.data = data;
    }

    @Override
    public HalamanDataBarangAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.item_data_barang, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position) {
        viewHolder.namaBarang.setText(String.valueOf(data.get(position).getNamaBarang()));
        viewHolder.kodeBarang.setText(String.valueOf(data.get(position).getKodeBarang()));
        viewHolder.stokBarang.setText(String.valueOf(data.get(position).getStokBarang()));
        viewHolder.satuanBarang.setText(String.valueOf(data.get(position).getSatuanBarang()));
        viewHolder.hargaDasar.setText(String.valueOf(data.get(position).getHargaDasar()));
        viewHolder.hargaJual.setText(String.valueOf(data.get(position).getHargaJual()));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        public TextView namaBarang;
        public TextView kodeBarang;
        public TextView stokBarang;
        public TextView satuanBarang;
        public TextView hargaDasar;
        public TextView hargaJual;

        public ViewHolder(View itemView) {
            super(itemView);
            namaBarang = itemView.findViewById(R.id.namabarang);
            kodeBarang = itemView.findViewById(R.id.kodebarang);
            stokBarang = itemView.findViewById(R.id.stokbarang);
            satuanBarang = itemView.findViewById(R.id.satuanbarang);
            hargaDasar = itemView.findViewById(R.id.hargadasar);
            hargaJual = itemView.findViewById(R.id.hargajual);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {

        }
    }
}


