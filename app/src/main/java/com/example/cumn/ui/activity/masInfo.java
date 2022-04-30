
package com.example.cumn.ui.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.MenuView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.cumn.R;
import com.example.cumn.models.Models;
import com.google.gson.Gson;

public class masInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mas_info);

        TextView textView = findViewById(R.id.masInfoTitulo);

        Intent intent = getIntent();
        String actividad_id = intent.getStringExtra("actividad_id");


        //textView.setText(strObj.get);

    }
}