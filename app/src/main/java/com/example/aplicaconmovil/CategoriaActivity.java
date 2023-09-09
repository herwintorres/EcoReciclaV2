package com.example.aplicaconmovil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CategoriaActivity extends AppCompatActivity {
    ImageView imagRegresar, imagCarton, imagPlastico, imagVidrio;
    TextView textRegresar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categoria);
        imagRegresar = findViewById(R.id.imgRegresarCategoria);
        textRegresar = findViewById(R.id.texRegresarCategoria);
        imagCarton = findViewById(R.id.imgCarton);
        imagPlastico = findViewById(R.id.imgPlastico);
        imagVidrio = findViewById(R.id.imgVidrio);
        Intent imgRegresarCa = new Intent(this, PrincipalActivity.class);
        Intent textRegresarCa = new Intent(this, PrincipalActivity.class);
        Intent imgCartonCa = new Intent(this, RegistroActivity.class);
        Intent imgPlasticoCa = new Intent(this, RegistroActivity.class);
        Intent imgVidrioCa = new Intent(this, RegistroActivity.class);
        imagRegresar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(imgRegresarCa);
            }
        });

        textRegresar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(textRegresarCa);
            }
        });
        imagCarton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(imgCartonCa);
            }
        });
        imagPlastico.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(imgPlasticoCa);
            }
        });
        imagVidrio.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(imgVidrioCa);
            }
        });

    }
}
