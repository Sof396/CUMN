package com.example.cumn.ui.activity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Handler;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.Toast;

import com.example.cumn.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "Bienvenidos" , Toast.LENGTH_LONG).show();


        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, MenuPrincipal.class);
                startActivity(intent);
                finish();
            }
        }, 2000); // Espera un segundo antes de cambiar de pantalla
    }


}