package com.example.aplicaconmovil;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;


public class LoginActivity extends AppCompatActivity {
    Button registro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        registro = findViewById(R.id.btnRegistro);
        Intent registroUsu = new Intent(this, MainActivity.class);
        registro.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(registroUsu);
            }
        });
    }
}
