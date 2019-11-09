package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText Num1, Num2;
    Button Suma,Resta, Multiplicacion , Division;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Num1 = (EditText)findViewById(R.id.PrimerNumEditTxt);
        Num2 = (EditText)findViewById(R.id.SegundoNumEditTxt);

        Suma = (Button)findViewById(R.id.SumaBttn);
        Suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            int n1 = Integer.parseInt(Num1.getText().toString());
            int n2 = Integer.parseInt(Num2.getText().toString());
            int resultado = n1 + n2;
                Intent intent = new Intent(getApplicationContext(), Resultados.class);
                intent.putExtra("Iguala",resultado);
                startActivity(intent);

            }
        });

        Resta = (Button)findViewById(R.id.RestaBttn);
        Resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1 = Integer.parseInt(Num1.getText().toString());
                int n2 = Integer.parseInt(Num2.getText().toString());
                int resultado = n1 - n2;
                Intent intent = new Intent(getApplicationContext(), Resultados.class);
                intent.putExtra("Iguala",resultado);
                startActivity(intent);
            }
        });
        Multiplicacion = (Button)findViewById(R.id.MultiplicacionBttn);
        Multiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1 = Integer.parseInt(Num1.getText().toString());
                int n2 = Integer.parseInt(Num2.getText().toString());
                int resultado = n1 * n2;
                Intent intent = new Intent(getApplicationContext(), Resultados.class);
                intent.putExtra("Iguala",resultado);
                startActivity(intent);
            }
        });
        Division = (Button)findViewById(R.id.DivisionBttn);
        Division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1 = Integer.parseInt(Num1.getText().toString());
                int n2 = Integer.parseInt(Num2.getText().toString());
                int resultado = n1 / n2;
                Intent intent = new Intent(getApplicationContext(), Resultados.class);
                intent.putExtra("Iguala",resultado);
                startActivity(intent);

            }
        });
    }
}
