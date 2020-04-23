package com.example.sumadigitos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText numero;
    Button boton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numero=findViewById(R.id.editNumero);
        boton=findViewById(R.id.btnEjecutar);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suma();
            }
        });
    }
    public int suma(){
        String num=numero.getText().toString();
        String partes[]=num.split(" ");

    }
}
