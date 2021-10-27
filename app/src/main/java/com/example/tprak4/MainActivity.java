package com.example.tprak4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.tprak4.logoadapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter recyclerviewAdapter;
    RecyclerView.LayoutManager recyclerViewLayoutManager;
    ArrayList<logomodel>data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        recyclerViewLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(recyclerViewLayoutManager);
        recyclerView.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));

        data = new ArrayList<>();
        for (int i = 0; i < logo.text1.length ; i++){
            data.add(new logomodel(
                    logo.text1[i],
                    logo.text2[i],
                    logo.text3[i],
                    logo.iconList[i]));
        }
        recyclerviewAdapter = new logoadapter(data);
        recyclerView.setAdapter(recyclerviewAdapter);
    }
}