package com.example.cumn.io;

import com.example.cumn.models.Graph;
import com.example.cumn.models.Models;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface actividadesApiService {

    //con esto tenemos la ruta a todas las actividades
    @GET("212504-0-agenda-actividades-deportes.json")
    Call<Models> getDeportes();

    @GET("206717-0-agenda-eventos-bibliotecas.json")
    Call<Models> getBibliotecas();

    @GET("206974-0-agenda-eventos-culturales-100.json")
    Call<Models> getEventos();

    @GET("300107-0-agenda-actividades-eventos.json")
    Call<Models> getOcio();

}
