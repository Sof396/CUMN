
package com.example.cumn.ui.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.MenuView;
import androidx.core.app.ActivityCompat;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import com.example.cumn.R;
import com.example.cumn.dato;
import com.example.cumn.io.actividadesApiAdapter;
import com.example.cumn.models.Graph;
import com.example.cumn.models.Models;
import com.example.cumn.ui.adapter.actividadesAdapter;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.gson.Gson;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class masInfo extends AppCompatActivity implements OnMapReadyCallback{

    private actividadesAdapter mAdapter;
    private GoogleMap mMap;
    MapView mapView;
    GoogleMap map;
    double latitud;
    double longitud;
    private MapView mMapView;




    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mas_info);
        //View v = inflater.inflate(R.layout.activity_mas_info, container, false);

        TextView tituloView = findViewById(R.id.masInfoTitulo);
        TextView descripcionView = findViewById(R.id.masInfoDescripcion);
        TextView organizacionView = findViewById(R.id.masInfoOrganizacion);

        mMapView = (MapView) findViewById(R.id.mapita);
        mMapView.onCreate(savedInstanceState);

        mMapView.getMapAsync(this);


        //MapView mapView = findViewById(R.id.mapita);
        //mapView.getMapAsync(this);

        Bundle datos = this.getIntent().getExtras();
        if (datos != null){



            String titulo = datos.getString("titulo");
            String descripcion = datos.getString("descripcion");
            String link = datos.getString("link");
             latitud = datos.getDouble("latitud");
             longitud = datos.getDouble("longitud");
            String organizacion = datos.getString("organizacion");

            tituloView.setText(titulo);
            descripcionView.setText(descripcion);
            organizacionView.setText(organizacion);
        }

        //mapView = (MapView) v.findViewById(R.id.mapita);
        //mapView.onCreate(savedInstanceState);


        //mapView.getMapAsync(this);







    }
    @Override
    protected void onResume() {
        super.onResume();
        mMapView.onResume();
    }

    @Override
    public void onMapReady(GoogleMap map) {
        LatLng cali = new LatLng(latitud, longitud);
        map.addMarker(new MarkerOptions().position(new LatLng(latitud, longitud)).title("Es aqui"));
        CameraPosition cameraPosition = CameraPosition.builder()
                .target(cali)
                .zoom(10)
                .build();
        map.moveCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));
    }

    @Override
    protected void onPause() {
        mMapView.onPause();
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        mMapView.onDestroy();
        super.onDestroy();
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        mMapView.onLowMemory();
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        mMapView.onSaveInstanceState(outState);
    }

    /*@Override
    public void onMapReady(@NonNull GoogleMap googleMap) {
        mMap = googleMap;
        map.getUiSettings().setMyLocationButtonEnabled(false);
        //map.setMyLocationEnabled(true);
        map.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(latitud, longitud)));
    }*/

}