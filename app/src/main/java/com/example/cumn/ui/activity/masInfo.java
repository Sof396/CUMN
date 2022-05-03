
package com.example.cumn.ui.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.MenuView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.cumn.R;
import com.example.cumn.dato;
import com.example.cumn.io.actividadesApiAdapter;
import com.example.cumn.models.Graph;
import com.example.cumn.models.Models;
import com.example.cumn.ui.adapter.actividadesAdapter;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.gson.Gson;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class masInfo extends AppCompatActivity implements OnMapReadyCallback{

    private actividadesAdapter mAdapter;
    private GoogleMap mMap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mas_info);

        TextView tituloView = findViewById(R.id.masInfoTitulo);
        TextView descripcionView = findViewById(R.id.masInfoDescripcion);
        TextView organizacionView = findViewById(R.id.masInfoOrganizacion);

        MapView mapView = findViewById(R.id.mapita);
        mapView.getMapAsync(this);

        Bundle datos = this.getIntent().getExtras();
        if (datos != null){



            String titulo = datos.getString("titulo");
            String descripcion = datos.getString("descripcion");
            String link = datos.getString("link");
            Double latitud = datos.getDouble("latitud");
            Double longitud = datos.getDouble("longitud");
            String organizacion = datos.getString("organizacion");

            tituloView.setText("Título:\n" + titulo);
            descripcionView.setText("Descripción:\n" + descripcion);
            organizacionView.setText("Organización: " + organizacion);
        }

    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {
        mMap = googleMap;
    }
}