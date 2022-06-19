package com.example.app2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.icu.lang.UCharacter;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RecyclerView myRecyclerView;
    MyRecyclerAdapter myAdapter;
    LinearLayoutManager linearLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myRecyclerView=findViewById(R.id.recycler_view);
        myAdapter = new MyRecyclerAdapter();
        linearLayoutManager= new LinearLayoutManager(
                Context:this,RecyclerView,
        );
    }
}