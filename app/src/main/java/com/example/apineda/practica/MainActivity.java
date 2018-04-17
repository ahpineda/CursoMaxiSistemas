package com.example.apineda.practica;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void botonApretado(View view){
        Toast.makeText(this, "boton apretado", Toast.LENGTH_LONG).show();
    }
    public void lanzar(View view) {
        Intent intent = new Intent(this, SenderActivity.class);
        startActivity(intent);}

    }
