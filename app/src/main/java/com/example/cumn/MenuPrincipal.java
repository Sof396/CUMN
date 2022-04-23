package com.example.cumn;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MenuPrincipal extends AppCompatActivity {

    private Button botonOcio;
    private Button botonDeportes;
    private Button botonBiblio;
    private Button botonEventos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Toast.makeText(this, "Actividades" , Toast.LENGTH_LONG).show();

        botonOcio = findViewById(R.id.Ocio);
        botonDeportes = findViewById(R.id.Deportes);
        botonBiblio = findViewById(R.id.Bibliotecas);
        botonEventos = findViewById(R.id.Eventos);

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