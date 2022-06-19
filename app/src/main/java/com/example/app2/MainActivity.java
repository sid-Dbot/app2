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

        //<String> randomList = new ArrayList<>();
        ArrayList<SampleModel> randomList = new ArrayList<>();

//        randomList.add("apple");
//        randomList.add("apple");
//        randomList.add("apple");
//        randomList.add("apple");
//        randomList.add("apple");
//        randomList.add("apple");
//        randomList.add("apple");
//        randomList.add("apple");
//        randomList.add("apple");
//        randomList.add("mango");
//        randomList.add("mango");
//        randomList.add("mango");
//        randomList.add("mango");
//        randomList.add("mango");
//        randomList.add("mango");
//        randomList.add("mango");
//        randomList.add("mango");
//        randomList.add("mango");
//        randomList.add("mango");
//        randomList.add("mango");
//        randomList.add("apple");

        randomList.add(new SampleModel(
                "neha",
                "8755151515",
                "Baneshwor",
                "neha@gmail.com"
        ));
        randomList.add(new SampleModel(
                "susmin",
                "877751515",
                "Baneshwor1",
                "susmin@gmail.com"
                ));
   randomList.add(new SampleModel(
                "jayant",
                "8755151444",
                "lalitpur",
                "jayant@gmail.com"
                ));
   randomList.add(new SampleModel(
                "rosy",
                "74554415",
                "Kritipur",
                "rosy@gmail.com"
                ));
   randomList.add(new SampleModel(
                "shristi",
                "98555151515",
                "kritipur",
                "shristi@gmail.com"
                ));


        myRecyclerView=findViewById(R.id.recycler_view);
        myAdapter = new MyRecyclerAdapter(randomList);
        linearLayoutManager= new LinearLayoutManager(
               this, RecyclerView.VERTICAL, false
        );

        myRecyclerView.setAdapter(myAdapter);
        myRecyclerView.setLayoutManager(linearLayoutManager);
    }
}