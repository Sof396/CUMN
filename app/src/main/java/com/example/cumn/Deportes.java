package com.example.cumn;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.ColorSpace;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.cumn.io.actividadesApiAdapter;
import com.example.cumn.model.actividad;
import com.example.cumn.models.Graph;
import com.example.cumn.models.Models;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Deportes extends AppCompatActivity implements Callback<Models> {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deportes);

        Toast.makeText(this, "Deportes" , Toast.LENGTH_LONG).show();

        List<dato> datosDeportes = new ArrayList<>();  //lista de los datos que se obtengan de la API

        Call<Models> call = actividadesApiAdapter.getApiService().getactividades(); //esto nos devuelve una llamada asincrona
        call.enqueue(this);

        //List<dato> datosDeportes = new ArrayList<>();  //lista de los datos que se obtengan de la API

        for (int i=0; i<1000; i++) {
            dato p = new dato(i, "Deportes"+i, "deporte cosas" , 53653, 732738732,"hddhdhd");
            datosDeportes.add(p);
        }


        //MiAdapter ma = new MiAdapter(datosDeportes);

        RecyclerView rv = findViewById(R.id.lista_actividades_Deportes);
        //rv.setAdapter(ma);

        // controlar el layoutmanager
        rv.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    public void onResponse(Call<Models> call, Response<Models> response) {
        if (response.isSuccessful()){
            List<Graph> actividades = response.body().getGraph();
            Log.d("onResponse actividades", "Tamaño de nuestro arreglo => " + actividades.size());
        }
    }

    @Override
    public void onFailure(Call<Models> call, Throwable t) {

    }
}