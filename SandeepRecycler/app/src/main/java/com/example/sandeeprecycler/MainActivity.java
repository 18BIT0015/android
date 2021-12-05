package com.example.sandeeprecycler;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;
import java.util.List;
import java.lang.String;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    List<ModelClass> userList;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();
        initRecyclerView();

    }



    private void initData() {
        userList = new ArrayList<>();

        userList.add(new ModelClass(R.drawable.avatarman,"Avatar","10 43 AM", " Whats up Bro?","_______________________"));
        userList.add(new ModelClass(R.drawable.joke,"JOKER","9 43 AM", "Why so Serious?","_______________________"));
        userList.add(new ModelClass(R.drawable.shoot,"Shooter","8 48 PM", " Have bullets?","_______________________"));
        userList.add(new ModelClass(R.drawable.avatarmotu,"Voldemort","12 00 AM", "Avade Kadevra","_______________________"));

    }

    private void initRecyclerView() {

        recyclerView = findViewById(R.id.recyclerView);
        layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        adapter=new Adapter(userList);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }





}