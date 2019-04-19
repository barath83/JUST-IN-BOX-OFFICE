package com.example.barath.jb;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivityc extends AppCompatActivity {

    List<Book> lstmovie ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainc);

        lstmovie = new ArrayList<>();
        lstmovie.add(new Book("Petta","Drama/Thriller","Description book",R.drawable.petta));
        lstmovie.add(new Book("Kanaa","Categorie Book","Description book",R.drawable.kanaa));
        lstmovie.add(new Book("Hello Guru Prema Kosame","Categorie Book","Description book",R.drawable.helloguru));
        lstmovie.add(new Book("Andhadhun","Categorie Book","Description book",R.drawable.andhadhun));
        lstmovie.add(new Book("Savyasachi","Categorie Book","Description book",R.drawable.savyasachi));
        lstmovie.add(new Book("URI Surgical Strike","Categorie Book","Description book",R.drawable.uri));
        lstmovie.add(new Book("Aquaman","Categorie Book","Description book",R.drawable.aquaman));
        lstmovie.add(new Book("Imaikkanodigal","Categorie Book","Description book",R.drawable.imaikanodigal));
        lstmovie.add(new Book("Simba","Categorie Book","Description book",R.drawable.simba));
        lstmovie.add(new Book("Jalebi","Categorie Book","Description book",R.drawable.jalebi));

        RecyclerView myrv = (RecyclerView) findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this,lstmovie);
        myrv.setLayoutManager(new GridLayoutManager(this,3));
        myrv.setAdapter(myAdapter);


    }
}
