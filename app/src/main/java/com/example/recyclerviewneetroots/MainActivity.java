package com.example.recyclerviewneetroots;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

import Adapter.RecipeAdapter;
import Models.RecipeModel;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();


        recyclerView = findViewById(R.id.recyclarview);

        ArrayList<RecipeModel> list = new ArrayList<>();
        list.add(new RecipeModel(R.drawable.food1,"Burger"));
        list.add(new RecipeModel(R.drawable.food2,"Pizza"));
        list.add(new RecipeModel(R.drawable.food3,"Hamburger"));
        list.add(new RecipeModel(R.drawable.food4,"Chowmin"));
        list.add(new RecipeModel(R.drawable.food5,"Paties"));
        list.add(new RecipeModel(R.drawable.food6,"Dosa"));
        list.add(new RecipeModel(R.drawable.food7,"Biryani"));
        list.add(new RecipeModel(R.drawable.food8,"Curry"));
        list.add(new RecipeModel(R.drawable.food9,"Idli"));

        RecipeAdapter adapter =new RecipeAdapter(list,this);
        recyclerView.setAdapter(adapter);

        LinearLayoutManager layoutmanager =  new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutmanager);



    }
}