package com.example.cumn.ui.activity;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.cumn.R;

public class MenuPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);


        ImageView botonOcio = findViewById(R.id.Ocio);
        ImageView botonDeportes = findViewById(R.id.Deportes);
        ImageView botonBiblio = findViewById(R.id.Bibliotecas);
        ImageView botonEventos = findViewById(R.id.Eventos);

        botonOcio.setOnClickListener(view -> {
            Intent intentOcio = new Intent(MenuPrincipal.this, Ocio.class);
            startActivity(intentOcio);
        });

        botonDeportes.setOnClickListener(view -> {
            Intent intentDeportes = new Intent(MenuPrincipal.this, Deportes.class);
            startActivity(intentDeportes);
        });

        botonBiblio.setOnClickListener(view -> {
            Intent intentBiblio = new Intent(MenuPrincipal.this, Bibliotecas.class);
            startActivity(intentBiblio);
        });

        botonEventos.setOnClickListener(view -> {
            Intent intentEventos = new Intent(MenuPrincipal.this, Eventos.class);
            startActivity(intentEventos);
        });
    }
}