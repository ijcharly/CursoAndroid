package com.example.basededatos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button Insertar,Eliminar,Modificar , Leer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Insertar = (Button)findViewById(R.id.InsertarBttn);
        Insertar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Insetar",Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getApplicationContext(), Insertar.class);
                startActivity(intent);
            }
        });

        Leer = (Button)findViewById(R.id.LeerBttn);
        Leer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Leer",Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getApplicationContext(), Leer.class);
                startActivity(intent);
            }
        });
        Modificar = (Button)findViewById(R.id.ModificarBttn);
        Modificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Modificar",Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getApplicationContext(), Modificar.class);
                startActivity(intent);
            }
        });
        Eliminar = (Button)findViewById(R.id.EliminarBttn);
        Eliminar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Eliminar", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), Eliminar.class);
                startActivity(intent);

            }
        });
}}
