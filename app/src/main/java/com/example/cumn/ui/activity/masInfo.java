
package com.example.cumn.ui.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.MenuView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.cumn.R;
import com.example.cumn.io.actividadesApiAdapter;
import com.example.cumn.models.Graph;
import com.example.cumn.models.Models;
import com.example.cumn.ui.adapter.actividadesAdapter;
import com.google.gson.Gson;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class masInfo extends AppCompatActivity implements Callback<Models> {

    private actividadesAdapter mAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mas_info);

        TextView textView = findViewById(R.id.masInfoTitulo);

        Intent intent = getIntent();
        String actividad_id = intent.getStringExtra("actividad_id");


        Call<Models> call = actividadesApiAdapter.getApiService().getDeportes(); //esto nos devuelve una llamada asincrona
        call.enqueue(this);

        //textView.setText(strObj.get);

    }

    @Override
    public void onResponse(Call<Models> call, Response<Models> response) {
        List<Graph> actividades = response.body().getGraph();

        Log.d("onResponse actividades", "Tamaño de nuestro arreglo => " + actividades.size());
        mAdapter.setDataSet(actividades);
    }

    @Override
    public void onFailure(Call<Models> call, Throwable t) {

    }
}