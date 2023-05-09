package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private List<ItemList> itemList;
    private AdapterList myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
//        recyclerView.setLayoutManager(new GridLayoutManager(this, 1));

        //inisalisasi daftar item
        itemList = new ArrayList<>();
        itemList.add(new ItemList("Indonesia Merdeka","Indonesia Merdeka Tahun 1945","https://via.placeholder.com/150"));
        itemList.add(new ItemList("STT Bandung","Sekolah Tinggi Teknologi Bandung berdiri pada tahun 1991","https://via.placeholder.com/150"));
        itemList.add(new ItemList("Lebaran 2023","1 Syawal tahun ini jatuh pada tanggal 22 April 2023","https://via.placeholder.com/150"));

        //inisialisasi adapter RecyclerView
        myAdapter = new AdapterList(itemList);
        recyclerView.setAdapter((RecyclerView.Adapter) myAdapter);

        Log.v("recylerView", String.valueOf(recyclerView));
    }
}