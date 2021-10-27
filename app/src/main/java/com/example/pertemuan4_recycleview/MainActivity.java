package com.example.pertemuan4_recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private itemAdapter adapter;
    private ArrayList<item> itemArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addData();
        recyclerView = (RecyclerView) findViewById(R.id.recycleview);
        adapter = new itemAdapter(itemArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void addData() {
        itemArrayList = new ArrayList<>();
        itemArrayList.add(new item("VOTKA", "BIG", "2",R.drawable.min_votka));
        itemArrayList.add(new item("ORANG TUA", "BIG", "5",R.drawable.min_ot));
        itemArrayList.add(new item("JACK DANIELS", "BIG", "3",R.drawable.min_jd));
        itemArrayList.add(new item("BRANDY", "SMALL", "4",R.drawable.min_brandy));
        itemArrayList.add(new item("SMIRNOFF", "SMALL", "5",R.drawable.min_smirnoff));
        itemArrayList.add(new item("WHISKY", "BIG ", "2",R.drawable.min_whisky));
        itemArrayList.add(new item("VIBE", "SMALL", "3",R.drawable.min_vibe));
    }
}