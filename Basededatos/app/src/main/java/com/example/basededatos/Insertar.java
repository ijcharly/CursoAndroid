package com.example.basededatos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Insertar extends AppCompatActivity {
EditText EtxtNombre, EtxtApellido, EtxtContraseña;
Button agregacion;
BaseDeDatos myDb = new BaseDeDatos();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insertar);
        EtxtNombre = (EditText)findViewById(R.id.NombreEdittxt);
        EtxtApellido = (EditText)findViewById(R.id.ApellidoEditxt);
        EtxtContraseña = (EditText)findViewById(R.id.ContraseñaEdittext);
        agregacion = (Button)findViewById(R.id.AgregarBttn);
        agregacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombre = EtxtNombre.getText().toString();
                String apellido = EtxtApellido.getText().toString();
                String contraseña = EtxtContraseña.getText().toString();
                Boolean result = myDb.insertData(nombre,apellido,contraseña);

            }
        });



    }
}
