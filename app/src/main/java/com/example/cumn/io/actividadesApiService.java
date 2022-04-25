package com.example.cumn.io;

import com.example.cumn.model.actividad;
import com.example.cumn.models.Graph;
import com.example.cumn.models.Models;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface actividadesApiService {

    //con esto tenemos la ruta a todas las actividades
    @GET("300107-0-agenda-actividades-eventos.json")
    Call<Models> getactividades();

}
