package com.example.cumn;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.cumn.io.actividadesApiAdapter;
import com.example.cumn.model.actividad;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Deportes extends AppCompatActivity implements Callback<ArrayList<actividad>> {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deportes);

        Toast.makeText(this, "Deportes" , Toast.LENGTH_LONG).show();

        List<dato> datosDeportes = new ArrayList<>();  //lista de los datos que se obtengan de la API

        Call<ArrayList<actividad>> call = actividadesApiAdapter.getApiService().getactividades(); //esto nos devuelve una llamada asincrona
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
    public void onResponse(Call<ArrayList<actividad>> call, Response<ArrayList<actividad>> response) {
        if (response.isSuccessful()){
            ArrayList<actividad> actividades= response.body();
            Log.d("onResponse actividades", "Tamaño de actividades =>" + actividades.size());
        }
    }

    @Override
    public void onFailure(Call<ArrayList<actividad>> call, Throwable t) {

    }
}