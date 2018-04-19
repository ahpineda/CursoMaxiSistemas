package com.example.apineda.practica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class SenderActivity extends AppCompatActivity {

    TextView nombre2, apellido2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sender);
        nombre2 = (TextView) findViewById(R.id.nombreT2);
        apellido2 = (TextView) findViewById(R.id.apellidoT2) ;
        Bundle bundle = getIntent().getExtras();
        String nombre = bundle.getString("nombre");
        String apellido = bundle.getString("apellido");
        nombre2.setText(nombre);
        apellido2.setText(apellido);


}}
