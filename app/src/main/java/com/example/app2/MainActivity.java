package com.example.app2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.icu.lang.UCharacter;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView myRecyclerView;
    MyRecyclerAdapter myAdapter;
    LinearLayoutManager linearLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> randomList = new ArrayList<>();
        randomList.add("apple");
        randomList.add("apple");
        randomList.add("apple");
        randomList.add("apple");
        randomList.add("apple");
        randomList.add("apple");
        randomList.add("apple");
        randomList.add("apple");
        randomList.add("apple");
        randomList.add("mango");
        randomList.add("mango");
        randomList.add("mango");
        randomList.add("mango");
        randomList.add("mango");
        randomList.add("mango");
        randomList.add("mango");
        randomList.add("mango");
        randomList.add("mango");
        randomList.add("mango");
        randomList.add("mango");
        randomList.add("apple");

        myRecyclerView=findViewById(R.id.recycler_view);
        myAdapter = new MyRecyclerAdapter(randomList);
        linearLayoutManager= new LinearLayoutManager(
               this, RecyclerView.VERTICAL, false
        );

        myRecyclerView.setAdapter(myAdapter);
        myRecyclerView.setLayoutManager(linearLayoutManager);
    }
}