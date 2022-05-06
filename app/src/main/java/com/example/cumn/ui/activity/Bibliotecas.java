package com.example.cumn.ui.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.cumn.R;
import com.example.cumn.dato;
import com.example.cumn.io.actividadesApiAdapter;
import com.example.cumn.models.Graph;
import com.example.cumn.models.Models;
import com.example.cumn.ui.adapter.actividadesAdapter;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Bibliotecas extends AppCompatActivity implements Callback<Models>{

    private actividadesAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bibliotecas);

        ImageView botonOcio = findViewById(R.id.Ocio);
        ImageView botonDeportes = findViewById(R.id.Deportes);
        ImageView botonBiblio = findViewById(R.id.Bibliotecas);
        ImageView botonEventos = findViewById(R.id.Eventos);
        ImageView botonMenu = findViewById(R.id.Menu);

        botonOcio.setOnClickListener(view -> {
            Intent intentOcio = new Intent(Bibliotecas.this, Ocio.class);
            startActivity(intentOcio);
        });

        botonDeportes.setOnClickListener(view -> {
            Intent intentDeportes = new Intent(Bibliotecas.this, Deportes.class);
            startActivity(intentDeportes);
        });

        botonBiblio.setOnClickListener(view -> {
            Intent intentBiblio = new Intent(Bibliotecas.this, Bibliotecas.class);
            startActivity(intentBiblio);
        });

        botonEventos.setOnClickListener(view -> {
            Intent intentEventos = new Intent(Bibliotecas.this, Eventos.class);
            startActivity(intentEventos);
        });

        botonEventos.setOnClickListener(view -> {
            Intent intentMenuPrincipal = new Intent(Bibliotecas.this, MenuPrincipal.class);
            startActivity(intentMenuPrincipal);
        });

        Toast.makeText(this, "Bibliotecas" , Toast.LENGTH_LONG).show();



        RecyclerView mRecyclerView = (RecyclerView) findViewById(R.id.lista_actividades_Bibliotecas);


        LinearLayoutManager mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        mAdapter = new actividadesAdapter();
        mRecyclerView.setAdapter(mAdapter);

        Call<Models> call = actividadesApiAdapter.getApiService().getBibliotecas(); //esto nos devuelve una llamada asincrona
        call.enqueue(this);

    }

    @Override
    public void onResponse(Call<Models> call, Response<Models> response) {
        if (response.isSuccessful()){
            List<Graph> actividades = response.body().getGraph();

            Log.d("onResponse actividades", "Tamaño de nuestro arreglo => " + actividades.size());
            mAdapter.setDataSet(actividades);
        }
    }

    @Override
    public void onFailure(Call<Models> call, Throwable t) {

    }


}