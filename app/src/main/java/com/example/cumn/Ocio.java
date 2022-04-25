package com.example.cumn;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.example.cumn.datos.ocio.example.datosOcio;

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

public class Ocio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ocio);

        Toast.makeText(this, "Ocio" , Toast.LENGTH_LONG).show();



        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://datos.madrid.es/egob/")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();





        MadridService service = retrofit.create(MadridService.class);


        Call<datosOcio> call = service.listActivities();

        call.enqueue(new Callback<datosOcio>() {
            @Override
            public void onResponse(@NonNull Call<datosOcio> call, @NonNull Response<datosOcio> response) {
                if (response.code() == 200) {
                    datosOcio res = response.body();

                    System.out.println(res.getDescription());
                }
            }

            @Override
            public void onFailure(Call<datosOcio> call, Throwable t) {
                Log.e("ERROR", t.getMessage());
            }
        });

        List<dato> datosOcio = new ArrayList<>();  //lista de los datos que se obtengan de la API

    for (int i=0; i<100; i++) {
            dato p = new dato(i, "ygudysg"+i, "gyefgiuyw" , 53653, 732738732,"2001-13-67");
            datosOcio.add(p);
        }


        //MiAdapter ma = new MiAdapter(call);

        RecyclerView rv = findViewById(R.id.lista_actividades_Ocio);
        //rv.setAdapter(ma);

        // controlar el layoutmanager
        rv.setLayoutManager(new LinearLayoutManager(this));
        // esto es para hacerlo en dos columnas
        //rv.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));
    }
}
