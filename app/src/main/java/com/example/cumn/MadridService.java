package com.example.cumn;

import retrofit2.http.GET;

import com.example.cumn.datos.ocio.example.datosOcio;

import java.util.List;

import io.reactivex.Single;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface MadridService {
    @GET("egob/catalogo/206974-0-agenda-eventos-culturales-100.json")
    Call<datosOcio> listActivities();
}
