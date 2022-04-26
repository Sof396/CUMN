package com.example.cumn.ui.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.example.cumn.MadridService;
import com.example.cumn.R;
import com.example.cumn.dato;
import com.example.cumn.datos.ocio.example.datosOcio;
import com.example.cumn.io.actividadesApiAdapter;
import com.example.cumn.models.Graph;
import com.example.cumn.models.Models;
import com.example.cumn.ui.adapter.actividadesAdapter;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class Ocio extends AppCompatActivity implements Callback<Models>{

    private actividadesAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ocio);

        Toast.makeText(this, "Ocio" , Toast.LENGTH_LONG).show();



        RecyclerView mRecyclerView = (RecyclerView) findViewById(R.id.lista_actividades_Ocio);


        LinearLayoutManager mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        mAdapter = new actividadesAdapter();
        mRecyclerView.setAdapter(mAdapter);


        List<dato> datosBibliotecas = new ArrayList<>();  //lista de los datos que se obtengan de la API

        Call<Models> call = actividadesApiAdapter.getApiService().getOcio(); //esto nos devuelve una llamada asincrona
        call.enqueue(this);



        //MiAdapter ma = new MiAdapter(datosDeportes);

        RecyclerView rv = findViewById(R.id.lista_actividades_Ocio);
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
}
