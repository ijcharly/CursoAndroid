package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Resultados extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultados);
        TextView equal;
        equal = (TextView) findViewById(R.id.textView);
        int m1 = getIntent().getExtras().getInt("Iguala");
        equal.setText(String.valueOf(m1));
    }
}
