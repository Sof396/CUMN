
package com.example.cumn;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.MenuView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.cumn.models.Models;
import com.google.gson.Gson;

public class masInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mas_info);

        Gson gson = new Gson();
        String strObj = getIntent().getStringExtra("obj");
        Models obj = gson.fromJson(strObj, Models.class);

        Intent intent = getIntent();

        TextView textView = findViewById(R.id.masInfoTitulo);

        textView.setText(intent.getStringExtra());

    }
}