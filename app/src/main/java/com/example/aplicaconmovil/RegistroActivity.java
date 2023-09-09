package com.example.aplicaconmovil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class RegistroActivity extends AppCompatActivity {
    ImageView imagRegistro;
    TextView textRegistro;
    Button getBtnRegistroCarton;
    EditText peso, precious, mes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        imagRegistro = findViewById(R.id.imgRegistroD);
        textRegistro = findViewById(R.id.textRegistroD);
        //Almacenamiento
        peso = findViewById(R.id.textcant);
        precious = findViewById(R.id.textprec);
        mes = findViewById(R.id.textmes);
        getBtnRegistroCarton = findViewById(R.id.btnregistrog);
        Intent imagRegistroR = new Intent(this, CategoriaActivity.class);
        Intent textRegistroR = new Intent(this, CategoriaActivity.class);
        imagRegistro.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(imagRegistroR);
            }
        });
        textRegistro.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(textRegistroR);
            }
        });

        getBtnRegistroCarton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!peso.getText().toString().isEmpty() && !precious.getText().toString().isEmpty() &&
                        !mes.getText().toString().isEmpty()){
                    File files = new File(getFilesDir(),"registro.txt");
                    try {
                        FileWriter writer = new FileWriter(files, true);
                        BufferedWriter bufferedWriter = new BufferedWriter(writer);
                        String factura = peso.getText().toString()+","+
                                         precious.getText().toString()+","+
                                         mes.getText().toString();
                        bufferedWriter.write(factura);
                        bufferedWriter.newLine();
                        bufferedWriter.close();
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                    peso.setText("");
                    precious.setText("");
                    mes.setText("");

                }else{
                    Toast.makeText(RegistroActivity.this,"Todos los campos deben estar diligenciados",
                            Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}
