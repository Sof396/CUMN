package com.example.cumn.ui.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.cumn.ClickListener;
import com.example.cumn.MiAdapter;
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

public class Eventos extends AppCompatActivity implements  Callback<Models>{

    private actividadesAdapter mAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eventos);

        Toast.makeText(this, "Eventos" , Toast.LENGTH_LONG).show();

        //List<dato> datosEventos = new ArrayList<>();  //lista de los datos que se obtengan de la API

        RecyclerView mRecyclerView = (RecyclerView) findViewById(R.id.lista_actividades_Eventos);


        LinearLayoutManager mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        mAdapter = new actividadesAdapter();
        mRecyclerView.setAdapter(mAdapter);


        List<dato> datosEventos = new ArrayList<>();  //lista de los datos que se obtengan de la API

        Call<Models> call = actividadesApiAdapter.getApiService().getEventos(); //esto nos devuelve una llamada asincrona
        call.enqueue(this);



        //MiAdapter ma = new MiAdapter(datosDeportes);

        RecyclerView rv = findViewById(R.id.lista_actividades_Eventos);
        //rv.setAdapter(ma);

        // controlar el layoutmanager
        rv.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    public void onResponse(Call<Models> call, Response<Models> response) {
        if (response.isSuccessful()){
            List<Graph> actividades = response.body().getGraph();

            //MiAdapter ma =new MiAdapter(actividades);
            //RecyclerView rv = findViewById(R.id.lista_actividades_deportes);
            //rv.setLayoutManager(new LinearLayoutManager(this));
            Log.d("onResponse actividades", "Tamaño de nuestro arreglo => " + actividades.size());
            mAdapter.setDataSet(actividades);
            // System.out.println("primer elemento: " + actividades.get(0).getTitle());
        }
    }

    @Override
    public void onFailure(Call<Models> call, Throwable t) {

    }



        //RecyclerView rv = findViewById(R.id.lista_actividades_Eventos);
        //rv.setAdapter(ma);

        // controlar el layoutmanager
        //rv.setLayoutManager(new LinearLayoutManager(this));
}
