package com.example.ejemplo2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   Button bton;
    EditText Nombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      bton = (Button) findViewById(R.id.bton);
      Nombre = (EditText) findViewById(R.id.NombreEditText);
        bton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
                final  String TextTransition = Nombre.getText().toString();
                intent.putExtra("texto",TextTransition);
                startActivity(intent);

            }

        });
    }
}
