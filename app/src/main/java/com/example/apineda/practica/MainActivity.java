package com.example.apineda.practica;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText nombre, apellido, telefono, mail, mail2;
    Button cleanbt, botonApretado, lanzar;
    RadioGroup radioGrup;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nombre = (EditText) findViewById(R.id.nombreET);
        apellido = (EditText) findViewById(R.id.apellidoET);
        telefono = (EditText) findViewById(R.id.telefonoET);
        mail = (EditText) findViewById(R.id.mailET);
        mail2 = (EditText) findViewById(R.id.mail2ET);
        cleanbt= (Button) findViewById(R.id.cleanbt);
        botonApretado = (Button) findViewById(R.id.toast);
        lanzar = (Button) findViewById(R.id.lanzarID);
        radioGrup = (RadioGroup) findViewById(R.id.radiogrup);
    }

    public void botonApretado(View view) {
        Toast.makeText(this, "boton apretado", Toast.LENGTH_LONG).show();
    }

    public void lanzar(View view) {
            Intent intent = new Intent(this, SenderActivity.class);
            startActivity(intent);

    }



    public void cleanBT(View view){
        nombre.setText("");
        apellido.setText("");
        telefono.setText("");
        mail.setText("");
        mail2.setText("");
    }
}