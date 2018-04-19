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

    EditText nombre = (EditText) findViewById(R.id.nombreET);
    EditText apellido = (EditText) findViewById(R.id.apellidoET);
    EditText telefono = (EditText) findViewById(R.id.telefonoET);
    EditText mail = (EditText) findViewById(R.id.mailET);
    EditText mail2 = (EditText) findViewById(R.id.mail2ET);
    Button cleanbt= (Button) findViewById(R.id.cleanbt);
    Button botonApretado = (Button) findViewById(R.id.toast);
    Button lanzar = (Button) findViewById(R.id.lanzarID);
    RadioGroup radioGrup = (RadioGroup) findViewById(R.id.radiogrup);



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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