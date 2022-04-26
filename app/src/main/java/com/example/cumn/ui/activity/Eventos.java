package com.example.cumn.ui.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.example.cumn.ClickListener;
import com.example.cumn.MiAdapter;
import com.example.cumn.R;
import com.example.cumn.dato;

import java.util.ArrayList;
import java.util.List;

public class Eventos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eventos);

        Toast.makeText(this, "Eventos" , Toast.LENGTH_LONG).show();

        List<dato> datosEventos = new ArrayList<>();  //lista de los datos que se obtengan de la API

        for (int i=0; i<1000; i++) {
            dato p = new dato(i, "Evento "+i, "evento cosas" , 53653, 732738732,"hddhdhd");
            datosEventos.add(p);
        }



        //RecyclerView rv = findViewById(R.id.lista_actividades_Eventos);
        //rv.setAdapter(ma);

        // controlar el layoutmanager
        //rv.setLayoutManager(new LinearLayoutManager(this));
    }
}