package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Spinner opciones;
    //String datos[]={"ejm1","ejm2","ejm3"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       /* ArrayAdapter<CharSequence> adaptador=
                ArrayAdapter.createFromResource(this,R.array.opciones, android.R.layout.simple_spinner_item);*/

        opciones=findViewById(R.id.cmbOpciones);

        /*adaptador.setDropDownViewResource(
                android.R.layout.simple_spinner_dropdown_item);
        opciones.setAdapter(adaptador);*/

        opciones.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "Seleccionado  "+opciones.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Toast.makeText(getApplicationContext(), "No has seleccionado nada", Toast.LENGTH_SHORT).show();
            }
        });


    }
}
