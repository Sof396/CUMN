package com.example.cumn;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Ocio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ocio);

        Toast.makeText(this, "Ocio" , Toast.LENGTH_LONG).show();
        
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://datos.madrid.es/egob/catalogo/206974-0-agenda-eventos-culturales-100.json")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
    }
}
