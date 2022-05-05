package com.example.cumn.ui.activity;

import android.content.DialogInterface;
import android.content.Intent;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.ImageView;

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

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {

        if (keyCode == event.KEYCODE_BACK){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Te vas?").setPositiveButton("Obvio!", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Intent intent = new Intent(Intent.ACTION_MAIN);
                    intent.addCategory(Intent.CATEGORY_HOME);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                }
            }).setNegativeButton("Todavía no!", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
            builder.show();
        }
        return super.onKeyDown(keyCode, event);
    }
}