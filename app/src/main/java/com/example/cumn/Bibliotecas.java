package com.example.cumn;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Bibliotecas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bibliotecas);

        Toast.makeText(this, "Bibliotecas" , Toast.LENGTH_LONG).show();

        List<dato> datosBibliotecas = new ArrayList<>();  //lista de los datos que se obtengan de la API

        for (int i=0; i<1000; i++) {
            dato p = new dato(i, "Bibliotecas"+i, "bibliocosas" , 53653, 732738732,"hddhdhd");
            datosBibliotecas.add(p);
        }


        MiAdapter ma = new MiAdapter(datosBibliotecas);

        RecyclerView rv = findViewById(R.id.lista_actividades_Bibliotecas);
        rv.setAdapter(ma);

        // controlar el layoutmanager
        rv.setLayoutManager(new LinearLayoutManager(this));
    }
}