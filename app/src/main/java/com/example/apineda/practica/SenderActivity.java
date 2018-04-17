package com.example.apineda.practica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class SenderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sender);

    }

    public void botonApretado(View view){
        Toast.makeText(this, "boton apretado", Toast.LENGTH_LONG).show();
    }
}
