package com.example.cumn;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

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


        MiAdapter ma = new MiAdapter(datosEventos, new ClickListener(){

            @Override
            public void onPositionClicked(int position) {
                
            }

            @Override
            public void onLongClicked(int position) {

            }
        });

        RecyclerView rv = findViewById(R.id.lista_actividades_Eventos);
        rv.setAdapter(ma);

        // controlar el layoutmanager
        rv.setLayoutManager(new LinearLayoutManager(this));
    }
}