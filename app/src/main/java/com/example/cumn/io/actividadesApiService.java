package com.example.cumn.io;

import com.example.cumn.model.actividad;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface actividadesApiService {

    //con esto tenemos la ruta a todas las actividades
    @GET("300107-0-agenda-actividades-eventos.json")
    Call<ArrayList<actividad>> getactividades();

}
