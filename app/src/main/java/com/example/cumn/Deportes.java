package com.example.cumn;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Deportes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deportes);

        Toast.makeText(this, "Deportes" , Toast.LENGTH_LONG).show();

        List<datos> datosDeportes = new ArrayList<>();  //lista de los datos que se obtengan de la API

        for (int i=0; i<1000; i++) {
            datos p = new datos(i, "Deportes"+i, "deporte cosas" , 53653, 732738732,"hddhdhd");
            datosDeportes.add(p);
        }


        MiAdapter ma = new MiAdapter(datosDeportes);

        RecyclerView rv = findViewById(R.id.lista_actividades_Deportes);
        rv.setAdapter(ma);

        // controlar el layoutmanager
        rv.setLayoutManager(new LinearLayoutManager(this));
    }
}