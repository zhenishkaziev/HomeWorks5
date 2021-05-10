package com.example.homework5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

     RecyclerView rvLanguages;
     ProgrammAdapter adapter;
    List <ProgrammLanguage> list = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = ServerData.getLanguage();
          rvLanguages = findViewById(R.id.language_rv);
          rvLanguages.setLayoutManager(new LinearLayoutManager(this));
          adapter = new ProgrammAdapter(this, list);
          rvLanguages.setAdapter(adapter);

    }


}