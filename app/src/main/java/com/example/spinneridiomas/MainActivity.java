package com.example.spinneridiomas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Spinner opciones;
    TextView mensaje;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        opciones=findViewById(R.id.spnOpciones);
        mensaje=findViewById(R.id.txtMensaje);

        opciones.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(opciones.getSelectedItem()==0){
                    mensaje.setText("Frase en Castellano");
                }else if(opciones.getSelectedItem()==1){
                    mensaje.setText("Frase en euskera");
                }else if(opciones.getSelectedItem()==2){
                    mensaje.setText("Frase en ingles");
                }else if(opciones.getSelectedItem()==3){
                    mensaje.setText("Frase en aleman");
                }else {
                    mensaje.setText("Frase en noruego");
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Toast.makeText(getApplicationContext(), "No has seleccionado nada", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
