package com.example.aplicaconmovil;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
public class PrincipalActivity extends AppCompatActivity {
    Button estadistica;
    Button categoria;
    Button consejo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        estadistica = findViewById(R.id.btnEstadistica);
        categoria = findViewById(R.id.btnCategoria);
        consejo = findViewById(R.id.btnConsejo);
        Intent estadisticaView = new Intent(this, EstadisticActivity.class);
        Intent categoriaView = new Intent(this, CategoriaActivity.class);
        Intent consejoView = new Intent(this, ConsejoActivity.class);

        estadistica.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(estadisticaView);
            }
        });

        categoria.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(categoriaView);
            }
        });

        consejo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(consejoView);
            }
        });

    }
}